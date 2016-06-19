/**
 * 
 */
package za.co.sindi.paygate.payxml.element.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.payxml.element.Request;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "refundtx")
public class RefundTx implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8852632219070643308L;

	@XmlAttribute(name = "tid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionId;
	
	@XmlAttribute(name = "amt", required = true)
	private int amountInCents;
	
	@XmlAttribute(name = "cref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	@XmlAttribute(name = "bno")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String batchNumber;
	
	/**
	 * 
	 */
	public RefundTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionId
	 * @param amountInCents
	 */
	public RefundTx(String transactionId, int amountInCents) {
		super();
		this.transactionId = transactionId;
		this.amountInCents = amountInCents;
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
}
