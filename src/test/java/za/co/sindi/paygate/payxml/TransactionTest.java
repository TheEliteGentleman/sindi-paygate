/**
 * 
 */
package za.co.sindi.paygate.payxml;

import za.co.sindi.paygate.Service;
import za.co.sindi.paygate.ServiceException;
import za.co.sindi.paygate.Utils;
import za.co.sindi.paygate.payxml.element.Response;
import za.co.sindi.paygate.payxml.element.request.AuthTx;
import za.co.sindi.paygate.payxml.element.response.AuthRx;
import za.co.sindi.paygate.payxml.element.response.ErrorRx;
import za.co.sindi.paygate.payxml.type.Month;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public class TransactionTest {

	private static final String PAYGATE_ID = "10011021600";
	private static final String PASSWORD = "test";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AuthTx request = new AuthTx("000001", "MR AB TEST", "4000000000000002", new Month(6, 2015), 0, 4000, "ZAR", "352");
			Service service = new PayXMLService();
			Response response = service.service(PAYGATE_ID, PASSWORD, request);
			if (response instanceof ErrorRx) {
				ErrorRx error = (ErrorRx)response;
				System.err.println("Error " + error.getErrorCode() + ": " + error.getErrorDescription());
				return ;
			}
			
			if (response instanceof AuthRx) {
				System.out.println("Transaction approved? " + Utils.isTransactionApproved((AuthRx)response));
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
