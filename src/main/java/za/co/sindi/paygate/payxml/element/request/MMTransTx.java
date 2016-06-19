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

import za.co.sindi.paygate.jaxb.adapter.AccountTypeAdapter;
import za.co.sindi.paygate.jaxb.adapter.MonthTypeAdapter;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.type.AccountType;
import za.co.sindi.paygate.payxml.type.Month;

/**
 * @author Bienfait Sindi
 * @since 24 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mmtranstx")
public class MMTransTx implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = -69825413991829785L;
	
	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "cname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerName;
	
	@XmlAttribute(name = "msisdn", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerMobileTelephoneNumber;
	
	@XmlAttribute(name = "amt", required = true)
	private int amountInCents;
	
	@XmlAttribute(name = "cur", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String currencyCode;
	
	@XmlAttribute(name = "cc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerCardNumber;
	
	@XmlAttribute(name = "exp")
    @XmlJavaTypeAdapter(MonthTypeAdapter.class)
	private Month cardExpiryDate;
	
	@XmlAttribute(name = "acctype")
    @XmlJavaTypeAdapter(AccountTypeAdapter.class)
	private AccountType accountType;
	
	/**
	 * 
	 */
	public MMTransTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param customerName
	 * @param customerMobileTelephoneNumber
	 * @param amountInCents
	 * @param currencyCode
	 */
	public MMTransTx(String accountReference, String customerName, String customerMobileTelephoneNumber, int amountInCents, String currencyCode) {
		super();
		this.accountReference = accountReference;
		this.customerName = customerName;
		this.customerMobileTelephoneNumber = customerMobileTelephoneNumber;
		this.amountInCents = amountInCents;
		this.currencyCode = currencyCode;
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
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerMobileTelephoneNumber
	 */
	public String getCustomerMobileTelephoneNumber() {
		return customerMobileTelephoneNumber;
	}

	/**
	 * @param customerMobileTelephoneNumber the customerMobileTelephoneNumber to set
	 */
	public void setCustomerMobileTelephoneNumber(String customerMobileTelephoneNumber) {
		this.customerMobileTelephoneNumber = customerMobileTelephoneNumber;
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
	 * @return the customerCardNumber
	 */
	public String getCustomerCardNumber() {
		return customerCardNumber;
	}

	/**
	 * @param customerCardNumber the customerCardNumber to set
	 */
	public void setCustomerCardNumber(String customerCardNumber) {
		this.customerCardNumber = customerCardNumber;
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
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
}
