package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.InvokeBrowser;

public class AddToCompare {
	
	Actions action;
	
	public AddToCompare() { 
		
		action = new Actions(InvokeBrowser.driver);
	}

	public void MouseHover(By locator) throws InterruptedException {
		
		WebElement element = InvokeBrowser.driver.findElement(locator);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
	}
	
	public void Click(By locator) throws InterruptedException {
		
		InvokeBrowser.driver.findElement(locator).click();
		Thread.sleep(3000);
	}
	public String Element(By locator) {
		return InvokeBrowser.driver.findElement(locator).getText();
		
		
	}

}
