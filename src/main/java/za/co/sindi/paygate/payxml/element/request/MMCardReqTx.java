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
 * @since 24 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mmcardreqtx")
public class MMCardReqTx implements Request {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6670612077316010083L;
	
	@XmlAttribute(name = "cc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String customerCardNumber;
	
	/**
	 * 
	 */
	public MMCardReqTx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerCardNumber
	 */
	public MMCardReqTx(String customerCardNumber) {
		super();
		this.customerCardNumber = customerCardNumber;
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
}
