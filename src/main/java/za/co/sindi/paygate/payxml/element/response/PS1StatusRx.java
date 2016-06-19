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
 * @since 25 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ps1statusrx")
public class PS1StatusRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1984705767973931446L;

	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionID;
	
	@XmlAttribute(name = "pcur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payerCurrencyCode;
	
	@XmlAttribute(name = "pamt", required = true)
	private int paymentAmountInCents;
	
	@XmlAttribute(name = "apamt", required = true)
	private int actualPaymentAmountInCents;
	
	@XmlAttribute(name = "settlecur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String settlementCurrencyCode;
	
	@XmlAttribute(name = "settleamt", required = true)
	private int settlementAmountInCents;

	@XmlAttribute(name = "asettleamt", required = true)
	private int actualSettlementAmountInCents;
	
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
	
	/**
	 * 
	 */
	public PS1StatusRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param transactionID
	 * @param payerCurrencyCode
	 * @param paymentAmountInCents
	 * @param actualPaymentAmountInCents
	 * @param settlementCurrencyCode
	 * @param settlementAmountInCents
	 * @param actualSettlementAmountInCents
	 * @param transactionStatusCode
	 * @param transactionStatusDescription
	 * @param resultCode
	 * @param resultDescription
	 */
	public PS1StatusRx(String accountReference, String transactionID,
			String payerCurrencyCode, int paymentAmountInCents,
			int actualPaymentAmountInCents, String settlementCurrencyCode,
			int settlementAmountInCents, int actualSettlementAmountInCents,
			int transactionStatusCode, String transactionStatusDescription,
			int resultCode, String resultDescription) {
		super();
		this.accountReference = accountReference;
		this.transactionID = transactionID;
		this.payerCurrencyCode = payerCurrencyCode;
		this.paymentAmountInCents = paymentAmountInCents;
		this.actualPaymentAmountInCents = actualPaymentAmountInCents;
		this.settlementCurrencyCode = settlementCurrencyCode;
		this.settlementAmountInCents = settlementAmountInCents;
		this.actualSettlementAmountInCents = actualSettlementAmountInCents;
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
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
	 * @return the payerCurrencyCode
	 */
	public String getPayerCurrencyCode() {
		return payerCurrencyCode;
	}

	/**
	 * @param payerCurrencyCode the payerCurrencyCode to set
	 */
	public void setPayerCurrencyCode(String payerCurrencyCode) {
		this.payerCurrencyCode = payerCurrencyCode;
	}

	/**
	 * @return the paymentAmountInCents
	 */
	public int getPaymentAmountInCents() {
		return paymentAmountInCents;
	}

	/**
	 * @param paymentAmountInCents the paymentAmountInCents to set
	 */
	public void setPaymentAmountInCents(int paymentAmountInCents) {
		this.paymentAmountInCents = paymentAmountInCents;
	}

	/**
	 * @return the actualPaymentAmountInCents
	 */
	public int getActualPaymentAmountInCents() {
		return actualPaymentAmountInCents;
	}

	/**
	 * @param actualPaymentAmountInCents the actualPaymentAmountInCents to set
	 */
	public void setActualPaymentAmountInCents(int actualPaymentAmountInCents) {
		this.actualPaymentAmountInCents = actualPaymentAmountInCents;
	}

	/**
	 * @return the settlementCurrencyCode
	 */
	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	/**
	 * @param settlementCurrencyCode the settlementCurrencyCode to set
	 */
	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	/**
	 * @return the settlementAmountInCents
	 */
	public int getSettlementAmountInCents() {
		return settlementAmountInCents;
	}

	/**
	 * @param settlementAmountInCents the settlementAmountInCents to set
	 */
	public void setSettlementAmountInCents(int settlementAmountInCents) {
		this.settlementAmountInCents = settlementAmountInCents;
	}

	/**
	 * @return the actualSettlementAmountInCents
	 */
	public int getActualSettlementAmountInCents() {
		return actualSettlementAmountInCents;
	}

	/**
	 * @param actualSettlementAmountInCents the actualSettlementAmountInCents to set
	 */
	public void setActualSettlementAmountInCents(int actualSettlementAmountInCents) {
		this.actualSettlementAmountInCents = actualSettlementAmountInCents;
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
}
