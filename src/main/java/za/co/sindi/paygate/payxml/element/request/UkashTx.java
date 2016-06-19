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

import za.co.sindi.paygate.payxml.element.Request;

/**
 * @author Bienfait Sindi
 * @since 24 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ukashtx")
public class UkashTx implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3428592649570084333L;

	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "cname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerName;
	
	@XmlAttribute(name = "uno", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String ukashVoucherNumber;
	
	@XmlAttribute(name = "uval", required = true)
	private int ukashVoucherValueInCents;
	
	@XmlAttribute(name = "upin", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String ukashPinCode;
	
	@XmlAttribute(name = "amt", required = true)
	private int transactionAmountInCents;
	
	@XmlAttribute(name = "cur", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String currencyCode;
	
	@XmlAttribute(name = "email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerEmailAddress;
	
	@XmlAttribute(name = "ip")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerIPAddress;

	/**
	 * 
	 */
	public UkashTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountReference
	 * @param ukashVoucherNumber
	 * @param ukashVoucherValueInCents
	 * @param ukashPinCode
	 * @param transactionAmountInCents
	 * @param currencyCode
	 */
	public UkashTx(String accountReference, String ukashVoucherNumber,
			int ukashVoucherValueInCents, String ukashPinCode,
			int transactionAmountInCents, String currencyCode) {
		super();
		this.accountReference = accountReference;
		this.ukashVoucherNumber = ukashVoucherNumber;
		this.ukashVoucherValueInCents = ukashVoucherValueInCents;
		this.ukashPinCode = ukashPinCode;
		this.transactionAmountInCents = transactionAmountInCents;
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
	 * @return the ukashVoucherNumber
	 */
	public String getUkashVoucherNumber() {
		return ukashVoucherNumber;
	}

	/**
	 * @param ukashVoucherNumber the ukashVoucherNumber to set
	 */
	public void setUkashVoucherNumber(String ukashVoucherNumber) {
		this.ukashVoucherNumber = ukashVoucherNumber;
	}

	/**
	 * @return the ukashVoucherValueInCents
	 */
	public int getUkashVoucherValueInCents() {
		return ukashVoucherValueInCents;
	}

	/**
	 * @param ukashVoucherValueInCents the ukashVoucherValueInCents to set
	 */
	public void setUkashVoucherValueInCents(int ukashVoucherValueInCents) {
		this.ukashVoucherValueInCents = ukashVoucherValueInCents;
	}

	/**
	 * @return the ukashPinCode
	 */
	public String getUkashPinCode() {
		return ukashPinCode;
	}

	/**
	 * @param ukashPinCode the ukashPinCode to set
	 */
	public void setUkashPinCode(String ukashPinCode) {
		this.ukashPinCode = ukashPinCode;
	}

	/**
	 * @return the transactionAmountInCents
	 */
	public int getTransactionAmountInCents() {
		return transactionAmountInCents;
	}

	/**
	 * @param transactionAmountInCents the transactionAmountInCents to set
	 */
	public void setTransactionAmountInCents(int transactionAmountInCents) {
		this.transactionAmountInCents = transactionAmountInCents;
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
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * @param customerEmailAddress the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	/**
	 * @return the customerIPAddress
	 */
	public String getCustomerIPAddress() {
		return customerIPAddress;
	}

	/**
	 * @param customerIPAddress the customerIPAddress to set
	 */
	public void setCustomerIPAddress(String customerIPAddress) {
		this.customerIPAddress = customerIPAddress;
	}
}
