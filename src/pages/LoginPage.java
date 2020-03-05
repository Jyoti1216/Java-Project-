package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.InvokeBrowser;
import utilities.Locators;

public class LoginPage {

	public void LoginPageOpen() throws Exception {

		InvokeBrowser.driver.findElement(Locators.LoginButton).click();
	}

	public void LoginPageClose() throws Exception {

		InvokeBrowser.driver.findElement(Locators.CloseButton).click();
	}

	public void login(String strUserName, String strPasword) {

		InvokeBrowser.driver.findElement(Locators.Username).sendKeys(strUserName);
		InvokeBrowser.driver.findElement(Locators.Password).sendKeys(strPasword);
		InvokeBrowser.driver.findElement(Locators.loginbutton).click();

	}

	public String Element(By locator) {
		return InvokeBrowser.driver.findElement(locator).getText();

	}
}
