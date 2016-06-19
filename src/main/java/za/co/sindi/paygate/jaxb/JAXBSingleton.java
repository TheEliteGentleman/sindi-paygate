/**
 * 
 */
package za.co.sindi.paygate.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import za.co.sindi.paygate.payxml.element.Protocol;

/**
 * @author Bienfait Sindi
 * @since 23 January 2015
 *
 */
public class JAXBSingleton {

	private static JAXBSingleton instance;
	private JAXBContext jaxbContext;
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	/**
	 * @throws JAXBException 
	 * 
	 */
	private JAXBSingleton() throws JAXBException {
		// TODO Auto-generated constructor stub
		jaxbContext = JAXBContext.newInstance(Protocol.class
//											 ,AuthTx.class
//											 ,AuthRx.class
//											 ,ErrorRx.class
//											 ,MMTransTx.class
//											 ,MMTransRx.class
//											 ,PreAuthTx.class
//											 ,PreAuthRx.class
//											 ,QueryTx.class
//											 ,QueryRx.class
//											 ,RefundTx.class
//											 ,RefundRx.class
//											 ,SettleTx.class
//											 ,SettleRx.class
//											 ,UkashTx.class
//											 ,UkashRx.class
					);
	}

	/**
	 * @return the instance
	 * @throws JAXBException 
	 */
	public static JAXBSingleton getInstance() throws JAXBException {
		if (instance == null) {
			instance = new JAXBSingleton();
		}
		
		return instance;
	}

	/**
	 * @return the jaxbContext
	 */
	public JAXBContext getJaxbContext() {
		return jaxbContext;
	}

	/**
	 * @return the marshaller
	 * @throws JAXBException 
	 */
	public Marshaller getMarshaller() throws JAXBException {
		if (marshaller == null) {
			marshaller = getJaxbContext().createMarshaller();
		}
		
		return marshaller;
	}

	/**
	 * @return the unmarshaller
	 * @throws JAXBException 
	 */
	public Unmarshaller getUnmarshaller() throws JAXBException {
		if (unmarshaller == null) {
			unmarshaller = getJaxbContext().createUnmarshaller();
		}
		
		return unmarshaller;
	}
}
