/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import za.co.sindi.common.utils.Strings;
import za.co.sindi.paygate.payxml.type.Month;

/**
 * @author Bienfait Sindi
 * @since 21 January 2015
 *
 */
public class MonthTypeAdapter extends XmlAdapter<String, Month> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Month unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return new Month(Integer.parseInt(value.substring(0, 2)), Integer.parseInt(value.substring(2)));
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Month month) throws Exception {
		// TODO Auto-generated method stub
		return new StringBuilder()
				.append(Strings.padLeft(String.valueOf(month.getMonth()), 2, '0'))
				.append(Strings.padLeft(String.valueOf(month.getYear()), 4, '0'))
				.toString();
	}
}
