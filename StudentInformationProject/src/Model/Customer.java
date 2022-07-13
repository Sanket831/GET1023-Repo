package Model;

public class Customer {
	int customerNo;
	String sName;
	int customerAge;
	
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public int getCustomerAge(int customerAge) {
		return customerAge;
	}
	
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
}
