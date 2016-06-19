/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import za.co.sindi.paygate.payxml.type.Boolean;

/**
 * @author Bienfait Sindi
 * @since 21 January 2015
 *
 */
public class BooleanTypeAdapter extends XmlAdapter<String, Boolean> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Boolean unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return Boolean.of(value);
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Boolean bool) throws Exception {
		// TODO Auto-generated method stub
		return bool.toString();
	}
}
