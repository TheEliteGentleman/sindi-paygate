/**
 * 
 */
package za.co.sindi.paygate.payxml.element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import za.co.sindi.paygate.payxml.element.request.AuthTx;
import za.co.sindi.paygate.payxml.element.request.MMCardReqTx;
import za.co.sindi.paygate.payxml.element.request.MMTransTx;
import za.co.sindi.paygate.payxml.element.request.PS1BookTx;
import za.co.sindi.paygate.payxml.element.request.PreAuthTx;
import za.co.sindi.paygate.payxml.element.request.QueryTx;
import za.co.sindi.paygate.payxml.element.request.RefundTx;
import za.co.sindi.paygate.payxml.element.request.SettleTx;
import za.co.sindi.paygate.payxml.element.request.UkashTx;
import za.co.sindi.paygate.payxml.element.response.AuthRx;
import za.co.sindi.paygate.payxml.element.response.ErrorRx;
import za.co.sindi.paygate.payxml.element.response.MMCardReqRx;
import za.co.sindi.paygate.payxml.element.response.MMTransRx;
import za.co.sindi.paygate.payxml.element.response.PS1BookRx;
import za.co.sindi.paygate.payxml.element.response.PS1StatusRx;
import za.co.sindi.paygate.payxml.element.response.PreAuthRx;
import za.co.sindi.paygate.payxml.element.response.QueryRx;
import za.co.sindi.paygate.payxml.element.response.RefundRx;
import za.co.sindi.paygate.payxml.element.response.SecureRx;
import za.co.sindi.paygate.payxml.element.response.SettleRx;
import za.co.sindi.paygate.payxml.element.response.UkashRx;

/**
 * @author Bienfait Sindi
 * @since 20 January 2015
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messages"
})
@XmlRootElement(name = "protocol")
public class Protocol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2084959395629804514L;

	@XmlAttribute(name = "ver", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String version;

    @XmlAttribute(name = "pgid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	private String payGateID;
	
    @XmlAttribute(name = "pwd", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String password;
    
    @XmlElements({
        @XmlElement(name = "authtx", required = true, type = AuthTx.class),
        @XmlElement(name = "settletx", required = true, type = SettleTx.class),
        @XmlElement(name = "refundtx", required = true, type = RefundTx.class),
        @XmlElement(name = "querytx", required = true, type = QueryTx.class),
        @XmlElement(name = "preauthtx", required = true, type = PreAuthTx.class),
        @XmlElement(name = "ukashtx", required = true, type = UkashTx.class),
        @XmlElement(name = "mmtranstx", required = true, type = MMTransTx.class),
        @XmlElement(name = "mmcardreqtx", required = true, type = MMCardReqTx.class),
//        @XmlElement(name = "ps1datatx", required = true, type = Ps1Datatx.class),
        @XmlElement(name = "ps1booktx", required = true, type = PS1BookTx.class),
        @XmlElement(name = "authrx", required = true, type = AuthRx.class),
        @XmlElement(name = "securerx", required = true, type = SecureRx.class),
        @XmlElement(name = "settlerx", required = true, type = SettleRx.class),
        @XmlElement(name = "refundrx", required = true, type = RefundRx.class),
        @XmlElement(name = "queryrx", required = true, type = QueryRx.class),
        @XmlElement(name = "preauthrx", required = true, type = PreAuthRx.class),
        @XmlElement(name = "ukashrx", required = true, type = UkashRx.class),
        @XmlElement(name = "mmtransrx", required = true, type = MMTransRx.class),
        @XmlElement(name = "mmcardreqrx", required = true, type = MMCardReqRx.class),
//        @XmlElement(name = "ps1datarx", required = true, type = Ps1Datarx.class),
        @XmlElement(name = "ps1bookrx", required = true, type = PS1BookRx.class),
        @XmlElement(name = "ps1statusrx", required = true, type = PS1StatusRx.class),
        @XmlElement(name = "errorrx", required = true, type = ErrorRx.class)
    })
    private List<Object> messages;
    
    public void addRequest(Request request) {
    	if (request != null) {
    		getMessages().add(request);
    	}
    }
    
    public void addResponse(Response response) {
    	if (response != null) {
    		getMessages().add(response);
    	}
    }
	
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/**
	 * @return the payGateID
	 */
	public String getPayGateID() {
		return payGateID;
	}
	
	/**
	 * @param payGateID the payGateID to set
	 */
	public void setPayGateID(String payGateID) {
		this.payGateID = payGateID;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the messages
	 */
	public List<Object> getMessages() {
		if (messages == null) {
			messages = new ArrayList<Object>();
		}
		
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<Object> messages) {
		this.messages = messages;
	}
}
