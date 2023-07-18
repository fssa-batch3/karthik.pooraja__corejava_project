package day05.practice;

public class AxisATM implements ATM{

	@Override
	public boolean deposit(Account account, double amount) {
		if(amount > 0) {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance + amount;
			account.setBalance(finalBalance);
			return true;
		}
		else {
			throw new IllegalArgumentException("The amount cannot be zero or negative");
		}
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if(account.getBalance() < 5000) {
			throw new IllegalArgumentException("The minimum balance should be 5000.");
		}
		else {
			double currentBalance = account.getBalance();
			account.setBalance(currentBalance - (amount+5));
			return true;
		}
	}

	@Override
	public double getBalance() {
		return this.getBalance();
	}

}