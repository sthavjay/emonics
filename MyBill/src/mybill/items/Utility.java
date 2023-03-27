package mybill.items;

public class Utility {
	private int billnumber;
	private String desc;
	private double amount;
	private int qty;
	public Utility(int billnumber, String desc, double amount, int qty) {
		super();
		this.billnumber = billnumber;
		this.desc = desc;
		this.amount = amount;
		this.qty = qty;
	}
	public Utility(int billnumber, double amount, int qty) {
		super();
		this.billnumber = billnumber;
		this.amount = amount;
		this.qty = qty;
	}
	public int getBillnumber() {
		return billnumber;
	}
	public void setBillnumber(int billnumber) {
		this.billnumber = billnumber;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	
}
