
public class bankAccount {
	private String accountNo;
	private double balance;
	private String CustomerName;
	private String Email;
	private String PhoneNo;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public void deposit(double dAmount) {
		balance+=dAmount;
		System.out.println("Amount Deposited "+dAmount+" Remaining Balance= "+balance);
		}
	public void withdraw(double wAmount) {
		if(balance-wAmount<0) {
			System.out.println("Insufficient Balance"+balance);
		}
		else {
			balance-=wAmount;
			System.out.println("Amount Withdraw "+wAmount+" Remaining Balance= "+balance);
		}
	}
	

}
