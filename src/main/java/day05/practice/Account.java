package day05.practice;

class Account  {
	private String accNo;
	private double balance;
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}
	public double getBalance() {
		return balance;
	}

	
}
