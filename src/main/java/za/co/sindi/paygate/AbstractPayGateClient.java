/**
 * 
 */
package za.co.sindi.paygate;

import za.co.sindi.common.utils.PreConditions;
import za.co.sindi.common.utils.Strings;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.element.Response;
import za.co.sindi.paygate.payxml.element.response.ErrorRx;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public abstract class AbstractPayGateClient implements PayGateClient {

	private String payGateID;
	private String password;
	private Service payGateService;
	
	/**
	 * @param payGateID
	 * @param password
	 */
	protected AbstractPayGateClient(String payGateID, String password) {
		super();
		PreConditions.checkArgument(!Strings.isNullOrEmpty(payGateID), "No PayGate ID provided.");
		PreConditions.checkArgument(!Strings.isNullOrEmpty(password), "No password provided.");
		
		this.payGateID = payGateID;
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.PayGateClient#setPayGateService(za.co.sindi.paygate.Service)
	 */
	@Override
	public void setPayGateService(Service payGateService) {
		// TODO Auto-generated method stub
		this.payGateService = payGateService;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.PayGateClient#execute(za.co.sindi.paygate.payxml.element.Request)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Response> T execute(Request request) throws ServiceException {
		// TODO Auto-generated method stub
		PreConditions.checkSate(payGateService != null, "No PayGate Service provided.");
		Response response = payGateService.service(payGateID, password, request);
		if (response instanceof ErrorRx) {
			ErrorRx error = (ErrorRx) response;
			throw new ServiceException("Error " + error.getErrorCode() + ": " + error.getErrorDescription());
		}
		
		return (T) response;
	}
}
