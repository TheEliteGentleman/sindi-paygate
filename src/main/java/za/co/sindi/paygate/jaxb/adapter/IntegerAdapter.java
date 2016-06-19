/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
public class IntegerAdapter extends XmlAdapter<String, Integer> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Integer unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return Integer.parseInt(value);
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Integer value) throws Exception {
		// TODO Auto-generated method stub
		return value == null ? "" : String.valueOf(value);
	}
}
