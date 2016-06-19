/**
 * 
 */
package za.co.sindi.paygate.payxml.type;

/**
 * @author Bienfait Sindi
 * @since 18 January 2015
 *
 */
public enum CardType {
	UNKNOWN(0, "Unknown"),
	VISA(1, "Visa"),
	MASTERCARD(2, "MasterCard"),
	AMERICAN_EXPRESS(3, "American Express"),
	DINERS_CLUB(4, "Diners Club")
	;
	private final int code;
	private final String description;
	
	/**
	 * @param code
	 * @param description
	 */
	private CardType(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}

//	/**
//	 * @return the description
//	 */
//	public String getDescription() {
//		return description;
//	}

	public static CardType of(int code) {
		if (UNKNOWN.code == code) {
			return UNKNOWN;
		}
		
		if (VISA.code == code) {
			return VISA;
		}
		
		if (MASTERCARD.code == code) {
			return MASTERCARD;
		}
		
		if (AMERICAN_EXPRESS.code == code) {
			return AMERICAN_EXPRESS;
		}
		
		if (DINERS_CLUB.code == code) {
			return DINERS_CLUB;
		}
		
		throw new IllegalArgumentException("Unknown card type code " + code);
	}
}
