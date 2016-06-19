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

import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mmtransrx")
public class MMTransRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4855932432700643586L;

	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionId;
	
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
	
	@XmlAttribute(name = "auth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String authorizationCode;
	
	@XmlAttribute(name = "risk", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String riskIndicator;
	
	/**
	 * 
	 */
	public MMTransRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionId
	 * @param accountReference
	 * @param transactionStatusCode
	 * @param transactionStatusDescription
	 * @param resultCode
	 * @param resultDescription
	 * @param authorizationCode
	 * @param riskIndicator
	 */
	public MMTransRx(String transactionId, String accountReference, int transactionStatusCode, String transactionStatusDescription, int resultCode, String resultDescription, String authorizationCode, String riskIndicator) {
		super();
		this.transactionId = transactionId;
		this.accountReference = accountReference;
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
		this.authorizationCode = authorizationCode;
		this.riskIndicator = riskIndicator;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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
}
