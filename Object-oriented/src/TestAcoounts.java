import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;

//import com.ey.bank.Current;

public class TestAcoounts {
	public static void main(String[] args) {
//		Accounts a1=new Accounts("polo",5000);
//		a1.summary();
//		
//		a1.deposit(1000);
//		a1.summary();
//		
//		a1.withdraw(3000);
//		a1.summary();
//		
//		a1.withdraw(4000);
		
//		Savings s1=new Savings("polo");
//		s1.summary();
//		
//		s1.withdraw(1);
//		
//		s1.deposit(100);
//		s1.summary();
//		Bank c1=new Current("sam");
//		c1.summary();
//		
//		c1.withdraw(3000);
//		c1.withdraw(6000);
//		c1.summary();
//		
//		c1.deposit(2000);
//		c1.deposit(5000);
//		c1.summary();
		
		//AccountsFactory factory =new AccountsFactory();
		
//		Bank c1=AccountsFactory.createCurrentAccount("Sam");
//		c1.summary();
//		
		Bank s1=AccountsFactory.createSavingsAccount("Ben");
		try {
			s1.withdraw(10000);
		} catch (BalanceException e) {
//			e.printStackTrace();  //DEvelopers: Troubleshoot the issues
		//	System.out.println(e); //logging: to audit system behavior
			System.out.println(e.getMessage()); //End users
		}
			
	}

}
