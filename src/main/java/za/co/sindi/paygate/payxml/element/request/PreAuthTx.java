/**
 * 
 */
package za.co.sindi.paygate.payxml.element.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.jaxb.adapter.MonthTypeAdapter;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.type.Month;

/**
 * @author Bienfait Sindi
 * @since 14 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "preauthtx")
public class PreAuthTx implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4190763135266579025L;
	
	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference; //cref
	
	@XmlAttribute(name = "cname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cardHolderName;
	
	@XmlAttribute(name = "cc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cardNumber;
	
	@XmlAttribute(name = "exp", required = true)
	@XmlJavaTypeAdapter(MonthTypeAdapter.class)
	private Month cardExpiryDate;
	
	@XmlAttribute(name = "budp", required = true)
	private int budgetPeriod;
	
	@XmlAttribute(name = "amt", required = true)
	private int amountInCents;
	
	@XmlAttribute(name = "cur")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String currencyCode;
	
	@XmlAttribute(name = "cvv", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cvv;
	
	@XmlAttribute(name = "bno")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String batchNumber;
	
	@XmlAttribute(name = "pauth", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String telephonicAuthorizationCode;
	
	/**
	 * 
	 */
	public PreAuthTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param cardHolderName
	 * @param cardNumber
	 * @param cardExpiryDate
	 * @param budgetPeriod
	 * @param amountInCents
	 * @param currencyCode
	 * @param cvv
	 * @param telephonicAuthorizationCode
	 */
	public PreAuthTx(String accountReference, String cardHolderName, String cardNumber, Month cardExpiryDate, int budgetPeriod, int amountInCents, String currencyCode, String cvv, String telephonicAuthorizationCode) {
		super();
		this.accountReference = accountReference;
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cardExpiryDate = cardExpiryDate;
		this.budgetPeriod = budgetPeriod;
		this.amountInCents = amountInCents;
		this.currencyCode = currencyCode;
		this.cvv = cvv;
		this.telephonicAuthorizationCode = telephonicAuthorizationCode;
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
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}
	
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
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
	 * @return the telephonicAuthorizationCode
	 */
	public String getTelephonicAuthorizationCode() {
		return telephonicAuthorizationCode;
	}

	/**
	 * @param telephonicAuthorizationCode the telephonicAuthorizationCode to set
	 */
	public void setTelephonicAuthorizationCode(String telephonicAuthorizationCode) {
		this.telephonicAuthorizationCode = telephonicAuthorizationCode;
	}
}
