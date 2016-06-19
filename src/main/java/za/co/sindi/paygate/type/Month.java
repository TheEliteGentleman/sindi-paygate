/**
 * 
 */
package za.co.sindi.paygate.type;

import java.io.Serializable;

import za.co.sindi.common.utils.PreConditions;

/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public class Month implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3746059271757081350L;
	
	private int month;
	private int year;
	
	/**
	 * 
	 */
	public Month() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param month
	 * @param year
	 */
	public Month(int month, int year) {
		super();
		PreConditions.checkArgument(month >= 1 && month <= 12, "Invalid month specified.");
		this.month = month;
		this.year = year;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
}
