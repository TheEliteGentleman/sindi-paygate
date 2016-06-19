/**
 * 
 */
package za.co.sindi.paygate.payxml.element;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.jaxb.adapter.BooleanTypeAdapter;
import za.co.sindi.paygate.payxml.type.Boolean;

/**
 * @author Bienfait Sindi
 * @since 14 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enrolled",
    "paresStatus",
    "eciIndicator",
    "transactionIdentifier",
    "cardholderAuthenticationVerificationValue"
})
@XmlRootElement(name = "threed")
public class Threed implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -548963658704513933L;

	@XmlElement(name="enrolled", required = true)
	@XmlJavaTypeAdapter(BooleanTypeAdapter.class)
	private Boolean enrolled;
	
	@XmlElement(name="paresstatus", required = true)
	@XmlJavaTypeAdapter(BooleanTypeAdapter.class)
	private Boolean paresStatus;
	
	@XmlElement(name="eci", required = true)
	private String eciIndicator;
	
	@XmlElement(name="xid", required = true)
	private String transactionIdentifier;
	
	@XmlElement(name="cavv", required = true)
	private String cardholderAuthenticationVerificationValue;
	
	/**
	 * @return the enrolled
	 */
	public Boolean getEnrolled() {
		return enrolled;
	}
	
	/**
	 * @param enrolled the enrolled to set
	 */
	public void setEnrolled(Boolean enrolled) {
		this.enrolled = enrolled;
	}
	
	/**
	 * @return the paresStatus
	 */
	public Boolean getParesStatus() {
		return paresStatus;
	}
	
	/**
	 * @param paresStatus the paresStatus to set
	 */
	public void setParesStatus(Boolean paresStatus) {
		this.paresStatus = paresStatus;
	}
	
	/**
	 * @return the eciIndicator
	 */
	public String getEciIndicator() {
		return eciIndicator;
	}
	
	/**
	 * @param eciIndicator the eciIndicator to set
	 */
	public void setEciIndicator(String eciIndicator) {
		this.eciIndicator = eciIndicator;
	}
	
	/**
	 * @return the transactionIdentifier
	 */
	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}
	
	/**
	 * @param transactionIdentifier the transactionIdentifier to set
	 */
	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}
	
	/**
	 * @return the cardholderAuthenticationVerificationValue
	 */
	public String getCardholderAuthenticationVerificationValue() {
		return cardholderAuthenticationVerificationValue;
	}
	
	/**
	 * @param cardholderAuthenticationVerificationValue the cardholderAuthenticationVerificationValue to set
	 */
	public void setCardholderAuthenticationVerificationValue(
			String cardholderAuthenticationVerificationValue) {
		this.cardholderAuthenticationVerificationValue = cardholderAuthenticationVerificationValue;
	}	
}
