/**
 * 
 */
package za.co.sindi.paygate.payxml;

import za.co.sindi.paygate.AbstractService;
import za.co.sindi.paygate.Constants;
import za.co.sindi.paygate.ServiceException;
import za.co.sindi.paygate.impl.XMLSerialization;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public class PayXMLService extends AbstractService {

	private XMLSerialization serialization = new XMLSerialization();
	
	/**
	 * 
	 */
	public PayXMLService() {
		// TODO Auto-generated constructor stub
		this(Constants.PAYXML_SERVER_URL);
	}

	/**
	 * @param serverURL
	 */
	public PayXMLService(String serverURL) {
		super(serverURL);
		// TODO Auto-generated constructor stub
		setSerializer(serialization);
		setDeserializer(serialization);
	}
	
	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Service#execute(java.lang.String, java.lang.String, za.co.sindi.paygate.payxml.element.Request)
	 */
	@Override
	public Response service(String payGateID, String password, Request request)	throws ServiceException {
		// TODO Auto-generated method stub
		return service(Constants.PAYXML_VERSION, payGateID, password, request);
	}
}
