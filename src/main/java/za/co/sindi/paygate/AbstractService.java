/**
 * 
 */
package za.co.sindi.paygate;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import za.co.sindi.common.utils.CloseUtils;
import za.co.sindi.common.utils.PreConditions;
import za.co.sindi.common.utils.Strings;
import za.co.sindi.paygate.http.HttpClient;
import za.co.sindi.paygate.http.HttpResponse;
import za.co.sindi.paygate.http.HttpUtils;
import za.co.sindi.paygate.http.exception.HttpException;
import za.co.sindi.paygate.http.impl.DefaultHttpClient;
import za.co.sindi.paygate.http.impl.HttpPostRequest;
import za.co.sindi.paygate.http.impl.StringEntity;
import za.co.sindi.paygate.impl.StringBasedMessageHandler;
import za.co.sindi.paygate.payxml.element.Protocol;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 18 January 2015
 *
 */
public abstract class AbstractService implements Service {

	protected final Logger LOGGER = Logger.getLogger(this.getClass().getName());
	
	private String serverURL;
	private HttpClient httpClient;
	private Serializer serializer;
	private Deserializer deserializer;

	/**
	 * @param serverURL
	 */
	protected AbstractService(String serverURL) {
		super();
		PreConditions.checkArgument(!Strings.isNullOrEmpty(serverURL), "No server URL provided.");
		this.serverURL = serverURL;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Service#setHttpClient(za.co.sindi.paygate.http.HttpClient)
	 */
	@Override
	public void setHttpClient(HttpClient httpClient) {
		// TODO Auto-generated method stub
		this.httpClient = httpClient;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Service#execute(za.co.sindi.paygate.payxml.element.Protocol)
	 */
	@Override
	public Protocol service(Protocol protocol) throws ServiceException {
		// TODO Auto-generated method stub
		PreConditions.checkArgument(protocol != null, "No PayGate request protocol object provided.");
		PreConditions.checkSate(serializer != null, "No Serializer provided.");
		PreConditions.checkSate(deserializer != null, "No Deserializer provided.");
		
		try {
			MessageHandler messageHandler = new StringBasedMessageHandler();
			serializer.serialize(protocol, messageHandler);
			Message message = messageHandler.createMessage();
			PreConditions.checkState(message != null, "Couldn't generate message from the provided request protocol.");
			
			HttpPostRequest postRequest = new HttpPostRequest(serverURL);
			postRequest.setHttpEntity(new StringEntity(message.getContent(), message.getContentType(), message.getCharsetName()));
			HttpResponse response = getHttpClient().execute(postRequest);
			PreConditions.checkSate(response != null, "No HTTP Response returned.");
			
			return deserializer.deserialize(response.getInputStream());
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Error POSTing request to PayGate's server.", e);
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Error encountered during object serialization.", e);
		} catch (DeserializationException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Error encountered during object deserialization.", e);
		} finally {
			try {
				CloseUtils.close(httpClient);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				LOGGER.log(Level.WARNING, "Unable to close HttpClient.", e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Service#execute(java.lang.String, java.lang.String, java.lang.String, za.co.sindi.paygate.payxml.element.Request)
	 */
	@Override
	public Response service(String version, String payGateID, String password, Request request) throws ServiceException {
		// TODO Auto-generated method stub
		PreConditions.checkArgument(request != null, "No PayGate request provided.");
		Protocol requestProtocol = new Protocol();
		requestProtocol.setVersion(version);
		requestProtocol.setPayGateID(payGateID);
		requestProtocol.setPassword(password);
		requestProtocol.addRequest(request);
		
		Protocol responseProtocol = service(requestProtocol);
		return (Response) responseProtocol.getMessages().get(0);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Service#message(java.lang.String)
	 */
	@Override
	public void message(String message) throws ServiceException {
		// TODO Auto-generated method stub
		PreConditions.checkArgument(!Strings.isNullOrEmpty(message), "No message provided.");
		
		try {
			HttpPostRequest postRequest = new HttpPostRequest(serverURL);
			postRequest.setHttpEntity(new StringEntity(message, "text/plain", HttpUtils.CHARSET_NAME_UTF8));
			getHttpClient().execute(postRequest);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Error POSTing request to PayGate's server.", e);
		}
	}

	/**
	 * @param serializer the serializer to set
	 */
	protected void setSerializer(Serializer serializer) {
		this.serializer = serializer;
	}

	/**
	 * @param deserializer the deserializer to set
	 */
	protected void setDeserializer(Deserializer deserializer) {
		this.deserializer = deserializer;
	}

	/**
	 * @return the httpClient
	 */
	private HttpClient getHttpClient() {
		if (httpClient == null) {
			if (LOGGER.isLoggable(Level.INFO)) {
				LOGGER.info("No HttpClient provided. Defaulting to " + DefaultHttpClient.class.getName());
			}
			
			httpClient = new DefaultHttpClient();
		}
		
		return httpClient;
	}
}
