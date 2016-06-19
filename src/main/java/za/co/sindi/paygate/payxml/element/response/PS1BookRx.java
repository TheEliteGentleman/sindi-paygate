/**
 * 
 */
package za.co.sindi.paygate.payxml.element.response;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.jaxb.adapter.BigDecimalAdapter;
import za.co.sindi.paygate.payxml.element.PayDetail;
import za.co.sindi.paygate.payxml.element.Response;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payDetails"
})
@XmlRootElement(name = "ps1bookrx")
public class PS1BookRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7259097053835074658L;

	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "pamt", required = true)
	private int paymentAmountInCents;
	
	@XmlAttribute(name = "pfxrate", required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal paymentExchangeRate;
	
	@XmlAttribute(name = "pcur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payerCurrencyCode;
	
	@XmlAttribute(name = "settleamt", required = true)
	private int settlementAmountInCents;

	@XmlAttribute(name = "settlefxrate", required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal settlementExchangeRate;
	
	@XmlAttribute(name = "settlecur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String settlementCurrencyCode;
	
	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionID;
	
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
	
	@XmlElements(
			@XmlElement(name="paydetail", required = true, type=PayDetail.class)
	)
	private List<PayDetail> payDetails;

	/**
	 * 
	 */
	public PS1BookRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param paymentAmountInCents
	 * @param paymentExchangeRate
	 * @param payerCurrencyCode
	 * @param settlementAmountInCents
	 * @param settlementExchangeRate
	 * @param settlementCurrencyCode
	 * @param transactionID
	 * @param transactionStatusCode
	 * @param transactionStatusDescription
	 * @param resultCode
	 * @param resultDescription
	 * @param payDetails
	 */
	public PS1BookRx(String accountReference, int paymentAmountInCents,
			BigDecimal paymentExchangeRate, String payerCurrencyCode,
			int settlementAmountInCents, BigDecimal settlementExchangeRate,
			String settlementCurrencyCode, String transactionID,
			int transactionStatusCode, String transactionStatusDescription,
			int resultCode, String resultDescription, List<PayDetail> payDetails) {
		super();
		this.accountReference = accountReference;
		this.paymentAmountInCents = paymentAmountInCents;
		this.paymentExchangeRate = paymentExchangeRate;
		this.payerCurrencyCode = payerCurrencyCode;
		this.settlementAmountInCents = settlementAmountInCents;
		this.settlementExchangeRate = settlementExchangeRate;
		this.settlementCurrencyCode = settlementCurrencyCode;
		this.transactionID = transactionID;
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
		this.payDetails = payDetails;
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
	 * @return the paymentExchangeRate
	 */
	public BigDecimal getPaymentExchangeRate() {
		return paymentExchangeRate;
	}

	/**
	 * @param paymentExchangeRate the paymentExchangeRate to set
	 */
	public void setPaymentExchangeRate(BigDecimal paymentExchangeRate) {
		this.paymentExchangeRate = paymentExchangeRate;
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
	 * @return the settlementExchangeRate
	 */
	public BigDecimal getSettlementExchangeRate() {
		return settlementExchangeRate;
	}

	/**
	 * @param settlementExchangeRate the settlementExchangeRate to set
	 */
	public void setSettlementExchangeRate(BigDecimal settlementExchangeRate) {
		this.settlementExchangeRate = settlementExchangeRate;
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
	 * @return the payDetails
	 */
	public List<PayDetail> getPayDetails() {
		return payDetails;
	}

	/**
	 * @param payDetails the payDetails to set
	 */
	public void setPayDetails(List<PayDetail> payDetails) {
		this.payDetails = payDetails;
	}
}
