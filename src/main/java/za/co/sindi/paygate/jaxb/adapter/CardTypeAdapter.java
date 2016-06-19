/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import za.co.sindi.paygate.payxml.type.CardType;

/**
 * @author Bienfait Sindi
 * @since 21 January 2015
 *
 */
public class CardTypeAdapter extends XmlAdapter<String, CardType> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public CardType unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return CardType.of(Integer.parseInt(value));
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(CardType cardType) throws Exception {
		// TODO Auto-generated method stub
		return String.valueOf(cardType.getCode());
	}
}
