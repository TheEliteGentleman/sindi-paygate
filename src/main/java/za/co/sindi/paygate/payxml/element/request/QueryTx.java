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
 * @since 25 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "querytx")
public class QueryTx implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6583354174880548649L;

	@XmlAttribute(name = "tid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String transactionID;
	
	@XmlAttribute(name = "cref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String accountReference;
	
	/**
	 * 
	 */
	public QueryTx() {
		super();
		// TODO Auto-generated constructor stub
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
}
