package day05.practice;

public class AccountMain {
	
	public static void main(String[] args) {
		
//		creating new account in Axis bank and depositing and withdrawing
		
		Account axisAccount = new Account("5000 1000 2000 4000", 10000.00);
		
		
		ATM AxisATM= new AxisATM();
		
		AxisATM.deposit(axisAccount, 1000.0);
		
		try {
			AxisATM.withdraw(axisAccount, 2000.0);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(axisAccount.getAccNo());;
		System.out.println(axisAccount.getBalance());
		
//		creating new account in Icici bank and depositing and withdrawing
		
		Account myIciciAccount = new Account("5001 1010 2020 4040", 20000.00);
		
		ATM IciciAtm= new IciciATM();
		
		IciciAtm.deposit(myIciciAccount, 5000.0);
		
		try {
			IciciAtm.withdraw(myIciciAccount, 2000.0);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(myIciciAccount.getAccNo());;
		System.out.println(myIciciAccount.getBalance());
	}

}