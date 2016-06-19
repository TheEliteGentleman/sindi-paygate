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

import za.co.sindi.paygate.jaxb.adapter.BooleanTypeAdapter;
import za.co.sindi.paygate.payxml.element.Response;
import za.co.sindi.paygate.payxml.type.Boolean;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mmcardreqrx")
public class MMCardReqRx implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6410310188723769560L;

	@XmlAttribute(name = "accept", required = true)
    @XmlJavaTypeAdapter(BooleanTypeAdapter.class)
	private Boolean cardAccepted;
	
	@XmlAttribute(name = "reqexp", required = true)
    @XmlJavaTypeAdapter(BooleanTypeAdapter.class)
	private Boolean cardContainsExpiryDate;
	
	@XmlAttribute(name = "reqacc", required = true)
    @XmlJavaTypeAdapter(BooleanTypeAdapter.class)
	private Boolean requestCardAccountType;
	
	@XmlAttribute(name = "type"/*, required = true*/)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String cardAccountType;
	
	/**
	 * 
	 */
	public MMCardReqRx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cardAccepted
	 * @param cardContainsExpiryDate
	 * @param requestCardAccountType
	 */
	public MMCardReqRx(Boolean cardAccepted, Boolean cardContainsExpiryDate,
			Boolean requestCardAccountType) {
		super();
		this.cardAccepted = cardAccepted;
		this.cardContainsExpiryDate = cardContainsExpiryDate;
		this.requestCardAccountType = requestCardAccountType;
	}

	/**
	 * @return the cardAccepted
	 */
	public Boolean getCardAccepted() {
		return cardAccepted;
	}

	/**
	 * @param cardAccepted the cardAccepted to set (YES|NO)
	 */
	public void setCardAccepted(Boolean cardAccepted) {
		this.cardAccepted = cardAccepted;
	}

	/**
	 * @return the cardContainsExpiryDate (YES|NO)
	 */
	public Boolean getCardContainsExpiryDate() {
		return cardContainsExpiryDate;
	}

	/**
	 * @param cardContainsExpiryDate the cardContainsExpiryDate to set (YES|NO)
	 */
	public void setCardContainsExpiryDate(Boolean cardContainsExpiryDate) {
		this.cardContainsExpiryDate = cardContainsExpiryDate;
	}

	/**
	 * @return the requestCardAccountType (YES|NO)
	 */
	public Boolean getRequestCardAccountType() {
		return requestCardAccountType;
	}

	/**
	 * @param requestCardAccountType the requestCardAccountType to set (YES|NO)
	 */
	public void setRequestCardAccountType(Boolean requestCardAccountType) {
		this.requestCardAccountType = requestCardAccountType;
	}

	/**
	 * @return the cardAccountType (YES|NO)
	 */
	public String getCardAccountType() {
		return cardAccountType;
	}

	/**
	 * @param cardAccountType the cardAccountType to set (YES|NO)
	 */
	public void setCardAccountType(String cardAccountType) {
		this.cardAccountType = cardAccountType;
	}
}
