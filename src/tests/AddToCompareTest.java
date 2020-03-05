package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AddToCompare;
import pages.LoginPage;
import utilities.InvokeBrowser;
import utilities.Locators;

public class AddToCompareTest {

	AddToCompare addtocompare;

	@BeforeClass
	public void setup() throws InterruptedException {
		try {
			addtocompare = new AddToCompare();
			Thread.sleep(5000);
			InvokeBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		

		
	}

	@Test(priority = 0)
	private void Dropdown() throws InterruptedException {
		try {
			Assert.assertTrue(addtocompare.Element(Locators.Dropdown_TVs_Appliances).contains("TVs & Appliances"));
			addtocompare.MouseHover(Locators.Dropdown_TVs_Appliances);
			
			
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		
		
	}

	@Test(priority = 1) 
	private void Select_SubOption() throws InterruptedException {
		try {
			System.out.println(addtocompare.Element(Locators.CoffeeMaker));
			Assert.assertTrue(addtocompare.Element(Locators.CoffeeMaker).contains("Coffee Maker"));
			
			addtocompare.Click(Locators.CoffeeMaker);
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		
		
	}

	@Test(priority = 2)
	private void Select_Filter() throws InterruptedException {
		try {
			Thread.sleep(3000);
			Assert.assertTrue(addtocompare.Element(Locators.PriceLowtoHigh).contains("Price -- Low to High "));
			
			addtocompare.Click(Locators.PriceLowtoHigh);
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		
		
	}

	@Test(priority = 3)
	private void Select_ItemsToCompare() throws InterruptedException {
		try {
			addtocompare.MouseHover(Locators.CartItem1);
			addtocompare.Click(Locators.AddtoCompare1);

			addtocompare.MouseHover(Locators.CartItem2);
			addtocompare.Click(Locators.AddtoCompare2);

			addtocompare.MouseHover(Locators.CartItem3);
			addtocompare.Click(Locators.AddtoCompare3);

			addtocompare.MouseHover(Locators.CartItem4);
			addtocompare.Click(Locators.AddtoCompare4);
			
			Assert.assertEquals(addtocompare.Element(Locators.Total_item), "4");
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		
	}

	@Test(priority = 4)
	private void OpenPage_CompareToOtherItems() throws InterruptedException {
		try {
			
			Assert.assertEquals(addtocompare.Element(Locators.CompareButton),"");
			addtocompare.Click(Locators.CompareButton);
			
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
       
		
	}

	@Test(priority = 5)
	private void Click_AddToCart() throws InterruptedException {
		try {
			addtocompare.Click(Locators.AddtoCart);
			
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		
	}

	/*
	 * @Test(priority = 6) private void test7() throws InterruptedException {
	 * 
	 * addtocompare.Click(Locators.OrderButton); }
	 */
}
