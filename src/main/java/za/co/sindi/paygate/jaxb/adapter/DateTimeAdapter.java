/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
public class DateTimeAdapter extends XmlAdapter<String, Date> {

	private static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
	
	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Date unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return dateFormat.parse(value);
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Date date) throws Exception {
		// TODO Auto-generated method stub
		return dateFormat.format(date);
	}
}
