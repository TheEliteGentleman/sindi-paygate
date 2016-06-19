/**
 * 
 */
package za.co.sindi.paygate.payxml.element.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.jaxb.adapter.DateAdapter;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 24 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ukashrx")
public class UkashRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2784795129786917168L;
	
	private String transactionID;
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
	
	@XmlAttribute(name = "ucno")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String ukashChangeVoucherNumber;
	
	@XmlAttribute(name = "ucval")
	private int ukashChangeValueInCents;
	
	@XmlAttribute(name = "ucexp")
    @XmlJavaTypeAdapter(DateAdapter.class)
	private Date ukashChangeVoucherExpiryDate;
	
	@XmlAttribute(name = "uccur")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String ukashChangeVoucherCurrencyCode;
	
	@XmlAttribute(name = "risk", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String riskIndicator;

	/**
	 * 
	 */
	public UkashRx() {
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
	 * @param riskIndicator
	 */
	public UkashRx(String transactionID, String accountReference,
			int transactionStatusCode, String transactionStatusDescription,
			int resultCode, String resultDescription, String riskIndicator) {
		super();
		this.transactionID = transactionID;
		this.accountReference = accountReference;
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
		this.riskIndicator = riskIndicator;
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
	 * @return the ukashChangeVoucherNumber
	 */
	public String getUkashChangeVoucherNumber() {
		return ukashChangeVoucherNumber;
	}

	/**
	 * @param ukashChangeVoucherNumber the ukashChangeVoucherNumber to set
	 */
	public void setUkashChangeVoucherNumber(String ukashChangeVoucherNumber) {
		this.ukashChangeVoucherNumber = ukashChangeVoucherNumber;
	}

	/**
	 * @return the ukashChangeValueInCents
	 */
	public int getUkashChangeValueInCents() {
		return ukashChangeValueInCents;
	}

	/**
	 * @param ukashChangeValueInCents the ukashChangeValueInCents to set
	 */
	public void setUkashChangeValueInCents(int ukashChangeValueInCents) {
		this.ukashChangeValueInCents = ukashChangeValueInCents;
	}

	/**
	 * @return the ukashChangeVoucherExpiryDate
	 */
	public Date getUkashChangeVoucherExpiryDate() {
		return ukashChangeVoucherExpiryDate;
	}

	/**
	 * @param ukashChangeVoucherExpiryDate the ukashChangeVoucherExpiryDate to set
	 */
	public void setUkashChangeVoucherExpiryDate(Date ukashChangeVoucherExpiryDate) {
		this.ukashChangeVoucherExpiryDate = ukashChangeVoucherExpiryDate;
	}

	/**
	 * @return the ukashChangeVoucherCurrencyCode
	 */
	public String getUkashChangeVoucherCurrencyCode() {
		return ukashChangeVoucherCurrencyCode;
	}

	/**
	 * @param ukashChangeVoucherCurrencyCode the ukashChangeVoucherCurrencyCode to set
	 */
	public void setUkashChangeVoucherCurrencyCode(
			String ukashChangeVoucherCurrencyCode) {
		this.ukashChangeVoucherCurrencyCode = ukashChangeVoucherCurrencyCode;
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
