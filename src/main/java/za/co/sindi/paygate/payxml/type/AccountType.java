/**
 * 
 */
package za.co.sindi.paygate.payxml.type;

/**
 * @author Bienfait Sindi
 * @since 24 January 2015
 *
 */
public enum AccountType {
	
	SAVINGS(1, "Savings"),
	CHEQUE(2, "Cheque")
	;
	
	private final int code;
	private final String description;
	/**
	 * @param code
	 * @param description
	 */
	private AccountType(final int code, final String description) {
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
	
	public static AccountType of(final int code) {
		if (SAVINGS.code == code) {
			return SAVINGS;
		}
		
		if (CHEQUE.code == code) {
			return CHEQUE;
		}
		
		throw new IllegalArgumentException("Invalid account type " + code);
	}
}
