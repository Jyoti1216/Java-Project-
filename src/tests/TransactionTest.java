package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Transaction;
import utilities.Locators;

public class TransactionTest {
	
	Transaction transaction;

	@BeforeClass
	private void Setup() {
		
		transaction = new Transaction();
		transaction.Click(Locators.OrderButton);
	}
	
	@Test(priority = 1)
	private void Fill_Address() {
		
		
	}
}
