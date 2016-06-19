/**
 * 
 */
package za.co.sindi.paygate.payxml;

import za.co.sindi.paygate.AbstractPayGateClient;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public class PayXMLClient extends AbstractPayGateClient {

	/**
	 * @param payGateID
	 * @param password
	 */
	public PayXMLClient(String payGateID, String password) {
		super(payGateID, password);
		// TODO Auto-generated constructor stub
		setPayGateService(new PayXMLService());
	}
}
