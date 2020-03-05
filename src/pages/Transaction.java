package pages;

import org.openqa.selenium.By;

import utilities.InvokeBrowser;

public class Transaction {
	
	public void Click(By locator) {
	
		InvokeBrowser.driver.findElement(locator).click();
	}
	
	

}
