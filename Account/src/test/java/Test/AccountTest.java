package Test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Exceptions.InsufficientFundsException;
import accountMain.Account;

public class AccountTest {
		
	Account AccountTest = new Account();
		
		@Before
		public void setUp() throws Exception{
			AccountTest.setId(1122);
			AccountTest.setBalance(20000);
			AccountTest.setAnnualInterestRate(4.5);
		}
		
		@After
		public void tearDown() throws Exception{
		}
		
		@Test
		public void testdeposit(){
			assertTrue(AccountTest.deposit(3000)==23000);
			System.out.println("The balance after deposit is: $" +AccountTest.getBalance());
		}
		
		@Test
		public void testwithdraw() throws InsufficientFundsException {
			assertTrue(AccountTest.withdraw(2500)==17500);
			System.out.println("The balance after withdrawl is: $" +AccountTest.getBalance());
		}
		
		@Test(expected=InsufficientFundsException.class)
		public void testwithdrawfail() throws InsufficientFundsException {
			
			double balance = AccountTest.getBalance();
			AccountTest.withdraw(50000);

			assertTrue(AccountTest.getBalance() == balance);
		}
		
		@Test
		public void testgetmonthlyinterstrate(){
			assertTrue(AccountTest.getMonthlyInterestRate() == AccountTest.getAnnualInterestRate()/12);
			
		}
		@Test
		public void testAccountPrint() {
			System.out.println("Balance: $" +AccountTest.getBalance());
			System.out.println("Monthly Interest:" +AccountTest.getMonthlyInterestRate());
			System.out.println("Date Created:" +AccountTest.getDateCreated());
		}
		
	}