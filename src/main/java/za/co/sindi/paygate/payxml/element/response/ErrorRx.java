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
 * @since 25 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "errorrx")
public class ErrorRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3728765512529085765L;

	@XmlAttribute(name = "ecode", required = true)
//    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private int errorCode;
	
	@XmlAttribute(name = "edesc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String errorDescription;
	
	/**
	 * 
	 */
	public ErrorRx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param errorCode
	 * @param errorDescription
	 */
	public ErrorRx(int errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}
	
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}
	
	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}	
}
