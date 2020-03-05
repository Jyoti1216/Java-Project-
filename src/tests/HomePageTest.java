package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.InvokeBrowser;
import utilities.LoadProperties;
import utilities.Locators;

public class HomePageTest {

	public HomePage homepage;

	@BeforeClass(description = "Configure something before test")
	@Parameters("Browser")
	public void setup(String Browser) throws Throwable {
		
		LoadProperties.property();
		
		homepage = new HomePage();
		homepage.LaunchFlipkart(Browser);
	}

	@Test(priority = 0)
	private void FlipkartTitle() {

		String title = homepage.Title();
		Assert.assertTrue(title.contains("Online Shopping Site"));
	}

	@Test(priority = 1)
	private void FlipkartLoginBtn() {

		Assert.assertTrue(InvokeBrowser.driver.findElement(Locators.LoginButton).isDisplayed());
	}
	
	

}
