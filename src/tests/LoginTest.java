package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.LoadProperties;
import utilities.Locators;
import pages.LoginPage;

public class LoginTest {
	
	LoginPage loginpage;
	
	@BeforeClass(description = "Configure something before test")
	public void setup() throws Exception {
		try {
			loginpage= new LoginPage();
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		
      } 
	
	@BeforeMethod
	private void set() throws Exception {
		
		try {
			loginpage.LoginPageOpen();
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	@AfterMethod
	private void TeatDown() throws Exception {
		// TODO Auto-generated method stub
		try {
			loginpage.LoginPageClose();
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority = 0)
	private void Login_EmptyUser_pass() {
		
		try {
			loginpage.login("", "");
			Assert.assertTrue(loginpage.Element(Locators.message).contains("Please enter valid Email ID/Mobile number"));
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test(priority = 2)
	private void Login_EmptyUsername() {
		
		try {
			loginpage.login("", LoadProperties.config.getProperty("Password"));
			Assert.assertTrue(loginpage.Element(Locators.message).contains("Please enter valid Email ID/Mobile number"));
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test(priority = 1)
	private void Login_EmptyPass() {
		try {
			loginpage.login(LoadProperties.config.getProperty("Email"), "");
			Assert.assertEquals(loginpage.Element(Locators.message),("Please enter Password"));
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test(priority = 3)
	private void login_ValidUserValidPass() throws Exception {
		try {
			loginpage.login(LoadProperties.config.getProperty("Email"), LoadProperties.config.getProperty("Password"));
			Thread.sleep(3000);
			Assert.assertEquals(loginpage.Element(Locators.validateuser),("Piyush"));
		}catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		
		
	}

	}
