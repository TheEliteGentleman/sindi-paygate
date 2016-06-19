/**
 * 
 */
package za.co.sindi.paygate;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import za.co.sindi.codec.BinaryEncoder;
import za.co.sindi.codec.HexCodec;
import za.co.sindi.codec.exception.EncodingException;
import za.co.sindi.common.utils.PreConditions;
import za.co.sindi.paygate.payxml.element.response.AuthRx;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public class Utils {

	private Utils() {
		throw new AssertionError("Private Constructor.");
	}
	
	public static boolean isTransactionApproved(AuthRx response) {
		PreConditions.checkArgument(response != null, "No AuthRx provided.");
		return (response.getTransactionStatusCode() == 1 && response.getResultCode() == 990017 && !"00000000".equals(response.getAuthorizationCode()));
	}
	
	public static String calculateCheckSum(final String payGateID, final String accountReference, final int cardType, final int transactionStatusCode, final int resultCode, final String resultDescription, final String authorizationCode, final String transactionID, final String riskIndicator, final String password) throws NoSuchAlgorithmException, UnsupportedEncodingException, EncodingException {
		StringBuilder sb = new StringBuilder();
		sb.append(payGateID).append("|")
		  .append(accountReference).append("|")
		  .append(cardType).append("|")
		  .append(transactionStatusCode).append("|")
		  .append(resultCode).append("|")
		  .append(resultDescription).append("|")
		  .append(authorizationCode).append("|")
		  .append(transactionID).append("|")
		  .append(riskIndicator).append("|")
		  .append(password);
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] md5Hashes = digest.digest(sb.toString().getBytes("UTF-8"));
		BinaryEncoder hexCodec = new HexCodec();
		return new String(hexCodec.encode(md5Hashes));
	}
}
