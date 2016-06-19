/**
 * 
 */
package za.co.sindi.paygate;

import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public interface PayGateClient {

	public void setPayGateService(Service payGateService);
	public <T extends Response> T execute(Request request) throws ServiceException;
}
