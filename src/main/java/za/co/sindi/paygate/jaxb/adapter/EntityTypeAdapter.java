/**
 * 
 */
package za.co.sindi.paygate.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import za.co.sindi.paygate.payxml.type.Entity;

/**
 * @author Bienfait Sindi
 * @since 21 January 2015
 *
 */
public class EntityTypeAdapter extends XmlAdapter<String, Entity> {

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public Entity unmarshal(String value) throws Exception {
		// TODO Auto-generated method stub
		return Entity.of(value);
	}

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Entity entity) throws Exception {
		// TODO Auto-generated method stub
		return entity.toString();
	}
}
