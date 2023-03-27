package mybill.items;

import mybill.utilities.Returnable;

public class Tent extends Utility implements Returnable {
	
	private char color; // red or blue or green (RBG)
	private char size; // s or m or l

	public Tent(int billnumber, double amount, int qty, char color, char size) {
		super(billnumber, amount, qty);
		this.color = color;
		this.size = size;
	}

	public Tent(int billnumber, String desc, double amount, int qty, char color, char size) {
		super(billnumber, desc, amount, qty);
		this.color = color;
		this.size = size;
	}
	
	public String toString() {
		return super.toString() + size + color;
	}

	public void doReturn() {
		System.out.println("return policy : 14 days replacement gaurantee");
		
	}
	
}
