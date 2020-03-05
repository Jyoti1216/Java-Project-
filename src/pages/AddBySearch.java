package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilities.InvokeBrowser;
import utilities.Locators;

public class AddBySearch {
	
	public void SearchProduct(String productname) {
		
		InvokeBrowser.driver.findElement(Locators.Search).sendKeys(productname + Keys.ENTER);
		InvokeBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void click(By locator) {
		
		InvokeBrowser.driver.findElement(locator).click();
	}

}
