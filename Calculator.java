/* Name: Matt Simonson
 * 
 * ID: 549
 * 
 * Assignment #: 2
 */
package cs360assign2;

public class Calculator {

	private int total; // holds the total after each calculation
	private String history; // holds the history of the calculator
	
	public Calculator () {
		total = 0;  //sets initial value to 0
		history = "0"; //includes
	}
	
	/* Method: getTotal()
	 * 
	 * 	return total integer value of computations
	 * Parameters:
	 * 	none
	 * Return values:
	 * 	total: total value of all computations
	 */
	public int getTotal () {
		return total;
	}
	
	/* Method: add (int value)
	 * 
	 *  add value to total
	 *  update history String
	 * Parameters:
	 * 	int value: value to add to total
	 * Return values:
	 * 	none 
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
		return;
	}
	
	/* Method: subtract (int value)
	 * 
	 * 	subtract value from total
	 * 	update history String
	 * Parameters:
	 * 	int value: value to subtract from total
	 * Return values:
	 * 	none 
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
		return;
	}
	
	/* Method: multiply (int value)
	 * 
	 * 	multiply total by value
	 * 	update history String
	 * Parameters:
	 * 	int value: value to multiply to total
	 * Return values:
	 * 	none 
	 */
	public void multiply (int value) {
		total *= value;
		history = history + " * " + value;
		return;
	}
	
	/* Method: divide (int value)
	 * 
	 * 	divide total by value and edit current total
	 * 	updates history String
	 * Parameters:
	 * 	int value: selected integer to divide total by
	 * Return values:
	 * 	none 
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			history = history + " / 0";
			return;
		}
		else {
			total /= value;
			history = history + " / " + value;
			return;
		}
	}	
	
	/* Method: getHistory()
	 * 
	 * return the history string
	 * Parameters:
	 * 	none
	 * Return values:
	 * 	history ( + a line break ): documenting history of calculator 
	 */
	public String getHistory () {
		return history;
	}
}
