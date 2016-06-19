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
@XmlRootElement(name = "securerx")
public class SecureRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1376614167559904500L;

	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionId;
	
	@XmlAttribute(name = "cref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "url", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String url;
	
	@XmlAttribute(name = "chk", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String checksum;

	/**
	 * 
	 */
	public SecureRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionId
	 * @param accountReference
	 * @param url
	 * @param checksum
	 */
	public SecureRx(String transactionId, String accountReference, String url, String checksum) {
		super();
		this.transactionId = transactionId;
		this.accountReference = accountReference;
		this.url = url;
		this.checksum = checksum;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the checksum
	 */
	public String getChecksum() {
		return checksum;
	}

	/**
	 * @param checksum the checksum to set
	 */
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}	
}
