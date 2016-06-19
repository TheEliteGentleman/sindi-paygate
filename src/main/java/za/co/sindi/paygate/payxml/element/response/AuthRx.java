/**
 * 
 */
package za.co.sindi.paygate.payxml.element.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.jaxb.adapter.CardTypeAdapter;
import za.co.sindi.paygate.payxml.element.Response;
import za.co.sindi.paygate.payxml.type.CardType;

/**
 * @author Bienfait Sindi
 * @since 18 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "authrx")
public class AuthRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1783467759097929976L;
	
	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionID;
	
	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "stat", required = true)
	private int transactionStatusCode;
	
	@XmlAttribute(name = "sdesc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionStatusDescription;
	
	@XmlAttribute(name = "res", required = true)
	private int resultCode;
	
	@XmlAttribute(name = "rdesc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String resultDescription;
	
	@XmlAttribute(name = "bno")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String batchNumber;
	
	@XmlAttribute(name = "auth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String authorizationCode;
	
	@XmlAttribute(name = "risk", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String riskIndicator;
	
	@XmlAttribute(name = "ctype", required = true)
    @XmlJavaTypeAdapter(CardTypeAdapter.class)
	private CardType cardType;
	
	/**
	 * 
	 */
	public AuthRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionID
	 * @param accountReference
	 * @param transactionStatusCode
	 * @param transactionStatusDescription
	 * @param resultCode
	 * @param resultDescription
	 * @param authorizationCode
	 * @param riskIndicator
	 * @param cardType
	 */
	public AuthRx(String transactionID, String accountReference,
			int transactionStatusCode, String transactionStatusDescription,
			int resultCode, String resultDescription, String authorizationCode,
			String riskIndicator, CardType cardType) {
		super();
		this.transactionID = transactionID;
		this.accountReference = accountReference;
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
		this.authorizationCode = authorizationCode;
		this.riskIndicator = riskIndicator;
		this.cardType = cardType;
	}

	/**
	 * @return the transactionID
	 */
	public String getTransactionID() {
		return transactionID;
	}
	
	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	/**
	 * @return the accountReference
	 */
	public String getAccountReference() {
		return accountReference;
	}
	
	/**
	 * @param accountReference the accountReference to set
	 */
	public void setAccountReference(String accountReference) {
		this.accountReference = accountReference;
	}
	
	/**
	 * @return the transactionStatusCode
	 */
	public int getTransactionStatusCode() {
		return transactionStatusCode;
	}
	
	/**
	 * @param transactionStatusCode the transactionStatusCode to set
	 */
	public void setTransactionStatusCode(int transactionStatusCode) {
		this.transactionStatusCode = transactionStatusCode;
	}
	
	/**
	 * @return the transactionStatusDescription
	 */
	public String getTransactionStatusDescription() {
		return transactionStatusDescription;
	}
	
	/**
	 * @param transactionStatusDescription the transactionStatusDescription to set
	 */
	public void setTransactionStatusDescription(String transactionStatusDescription) {
		this.transactionStatusDescription = transactionStatusDescription;
	}
	
	/**
	 * @return the resultCode
	 */
	public int getResultCode() {
		return resultCode;
	}
	
	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	
	/**
	 * @return the resultDescription
	 */
	public String getResultDescription() {
		return resultDescription;
	}
	
	/**
	 * @param resultDescription the resultDescription to set
	 */
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
	
	/**
	 * @return the batchNumber
	 */
	public String getBatchNumber() {
		return batchNumber;
	}
	
	/**
	 * @param batchNumber the batchNumber to set
	 */
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	
	/**
	 * @return the authorizationCode
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	
	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	
	/**
	 * @return the riskIndicator
	 */
	public String getRiskIndicator() {
		return riskIndicator;
	}

	/**
	 * @param riskIndicator the riskIndicator to set
	 */
	public void setRiskIndicator(String riskIndicator) {
		this.riskIndicator = riskIndicator;
	}

	/**
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}
	
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
}
