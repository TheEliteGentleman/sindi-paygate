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

import za.co.sindi.paygate.jaxb.adapter.EntityTypeAdapter;
import za.co.sindi.paygate.payxml.element.Request;
import za.co.sindi.paygate.payxml.type.Entity;

/**
 * @author Bienfait Sindi
 * @since 14 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ps1booktx")
public class PS1BookTx implements Request {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6707790866679123429L;

	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference; //cref
	
	@XmlAttribute(name = "cname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerName;
	
	@XmlAttribute(name = "amt", required = true)
	private int amountInCents;
	
	@XmlAttribute(name = "cur")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String currencyCode;
	
	@XmlAttribute(name = "pcountry", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payerCountryCode;
	
	@XmlAttribute(name = "pcur", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payerCurrencyCode;
	
	@XmlAttribute(name = "email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerEmail;
	
	@XmlAttribute(name = "tel", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerTelephoneNumber;

	@XmlAttribute(name = "nurl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String notificationURL;
	
	@XmlAttribute(name = "pet", required = true)
    @XmlJavaTypeAdapter(EntityTypeAdapter.class)
	private Entity payerEntityType;
	
	@XmlAttribute(name = "pename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payerEntityName;
	
	/**
	 * 
	 */
	public PS1BookTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param customerName
	 * @param amountInCents
	 * @param currencyCode
	 * @param payerCountryCode
	 * @param payerCurrencyCode
	 * @param customerEmail
	 * @param customerTelephoneNumber
	 * @param notificationURL
	 * @param payerEntityType
	 */
	public PS1BookTx(String accountReference, String customerName,
			int amountInCents, String currencyCode, String payerCountryCode,
			String payerCurrencyCode, String customerEmail,
			String customerTelephoneNumber, String notificationURL,
			Entity payerEntityType) {
		super();
		this.accountReference = accountReference;
		this.customerName = customerName;
		this.amountInCents = amountInCents;
		this.currencyCode = currencyCode;
		this.payerCountryCode = payerCountryCode;
		this.payerCurrencyCode = payerCurrencyCode;
		this.customerEmail = customerEmail;
		this.customerTelephoneNumber = customerTelephoneNumber;
		this.notificationURL = notificationURL;
		this.payerEntityType = payerEntityType;
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
	 * @return the payerCountryCode
	 */
	public String getPayerCountryCode() {
		return payerCountryCode;
	}

	/**
	 * @param payerCountryCode the payerCountryCode to set
	 */
	public void setPayerCountryCode(String payerCountryCode) {
		this.payerCountryCode = payerCountryCode;
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
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 * @return the customerTelephoneNumber
	 */
	public String getCustomerTelephoneNumber() {
		return customerTelephoneNumber;
	}

	/**
	 * @param customerTelephoneNumber the customerTelephoneNumber to set
	 */
	public void setCustomerTelephoneNumber(String customerTelephoneNumber) {
		this.customerTelephoneNumber = customerTelephoneNumber;
	}

	/**
	 * @return the notificationURL
	 */
	public String getNotificationURL() {
		return notificationURL;
	}

	/**
	 * @param notificationURL the notificationURL to set
	 */
	public void setNotificationURL(String notificationURL) {
		this.notificationURL = notificationURL;
	}

	/**
	 * @return the payerEntityType
	 */
	public Entity getPayerEntityType() {
		return payerEntityType;
	}

	/**
	 * @param payerEntityType the payerEntityType to set
	 */
	public void setPayerEntityType(Entity payerEntityType) {
		this.payerEntityType = payerEntityType;
	}

	/**
	 * @return the payerEntityName
	 */
	public String getPayerEntityName() {
		return payerEntityName;
	}

	/**
	 * @param payerEntityName the payerEntityName to set
	 */
	public void setPayerEntityName(String payerEntityName) {
		this.payerEntityName = payerEntityName;
	}
}
