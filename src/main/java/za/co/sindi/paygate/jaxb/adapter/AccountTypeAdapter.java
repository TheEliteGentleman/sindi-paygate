/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import za.co.sindi.paygate.payxml.type.AccountType;

/**
 * @author Bienfait Sindi
 * @since 21 January 2015
 *
 */
public class AccountTypeAdapter extends XmlAdapter<String, AccountType> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public AccountType unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return AccountType.of(Integer.parseInt(value));
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(AccountType accountType) throws Exception {
		// TODO Auto-generated method stub
		return String.valueOf(accountType.getCode());
	}
}
