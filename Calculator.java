
package cs360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		return;
	}
	
	public void subtract (int value) {
		total -= value;
		return;
	}
	
	public void multiply (int value) {
		total *= value;
		return;
	}
	
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			return;
		}
		else {
			total /= value;
			return;
		}
	}	
	
	public String getHistory () {
		return "";
	}
}
