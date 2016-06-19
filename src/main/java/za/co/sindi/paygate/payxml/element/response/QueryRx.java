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

import za.co.sindi.paygate.jaxb.adapter.CardTypeAdapter;
import za.co.sindi.paygate.jaxb.adapter.DateTimeAdapter;
import za.co.sindi.paygate.jaxb.adapter.MonthTypeAdapter;
import za.co.sindi.paygate.payxml.element.Response;
import za.co.sindi.paygate.payxml.type.CardType;
import za.co.sindi.paygate.payxml.type.Month;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "queryrx")
public class QueryRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8332304215100839115L;
	
	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionID;
	
	@XmlAttribute(name = "ttype", required = true)
	private int transactionType;
	
	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "cname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cardHolderName;
	
	@XmlAttribute(name = "cc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cardNumber;
	
	@XmlAttribute(name = "exp", required = true)
    @XmlJavaTypeAdapter(MonthTypeAdapter.class)
	private Month cardExpiryDate;
	
	@XmlAttribute(name = "ctype", required = true)
    @XmlJavaTypeAdapter(CardTypeAdapter.class)
	private CardType cardType;
	
	@XmlAttribute(name = "budp", required = true)
	private int budgetPeriod;
	
	@XmlAttribute(name = "amt", required = true)
	private int amountInCents;
	
	@XmlAttribute(name = "cur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String currencyCode;
	
	@XmlAttribute(name = "auth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String authorizationCode;
	
	@XmlAttribute(name = "bno")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String batchNumber;
	
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
	
	@XmlAttribute(name = "risk", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String riskIndicator;
	
	@XmlAttribute(name = "date")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private Date transactionDate;
	
	/**
	 * 
	 */
	public QueryRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionID
	 * @param transactionType
	 * @param accountReference
	 * @param cardHolderName
	 * @param cardNumber
	 * @param cardExpiryDate
	 * @param cardType
	 * @param budgetPeriod
	 * @param amountInCents
	 * @param currencyCode
	 * @param authorizationCode
	 * @param transactionStatusCode
	 * @param transactionStatusDescription
	 * @param resultCode
	 * @param resultDescription
	 * @param riskIndicator
	 */
	public QueryRx(String transactionID, int transactionType,
			String accountReference, String cardHolderName, String cardNumber,
			Month cardExpiryDate, CardType cardType, int budgetPeriod,
			int amountInCents, String currencyCode, String authorizationCode,
			int transactionStatusCode, String transactionStatusDescription,
			int resultCode, String resultDescription, String riskIndicator) {
		super();
		this.transactionID = transactionID;
		this.transactionType = transactionType;
		this.accountReference = accountReference;
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cardExpiryDate = cardExpiryDate;
		this.cardType = cardType;
		this.budgetPeriod = budgetPeriod;
		this.amountInCents = amountInCents;
		this.currencyCode = currencyCode;
		this.authorizationCode = authorizationCode;
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
	 * @return the transactionType
	 */
	public int getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
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
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardExpiryDate
	 */
	public Month getCardExpiryDate() {
		return cardExpiryDate;
	}

	/**
	 * @param cardExpiryDate the cardExpiryDate to set
	 */
	public void setCardExpiryDate(Month cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
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

	/**
	 * @return the budgetPeriod
	 */
	public int getBudgetPeriod() {
		return budgetPeriod;
	}

	/**
	 * @param budgetPeriod the budgetPeriod to set
	 */
	public void setBudgetPeriod(int budgetPeriod) {
		this.budgetPeriod = budgetPeriod;
	}

	/**
	 * @return the amountInCents
	 */
	public int getAmountInCents() {
		return amountInCents;
	}

	/**
	 * @param amountInCents the amountInCents to set
	 */
	public void setAmountInCents(int amountInCents) {
		this.amountInCents = amountInCents;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
