/**
 * 
 */
package za.co.sindi.paygate;

import za.co.sindi.paygate.http.HttpClient;
import za.co.sindi.paygate.payxml.element.Protocol;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 12 January 2015
 *
 */
public interface Service {

	public void setHttpClient(HttpClient httpClient);
	public Protocol service(Protocol requestProtocol) throws ServiceException;
	public Response service(final String payGateID, final String password, Request request) throws ServiceException;
	public Response service(final String version, final String payGateID, final String password, Request request) throws ServiceException;
	public void message(String message) throws ServiceException;
}
