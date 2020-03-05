package pages;


import utilities.InvokeBrowser;
import utilities.Locators;

public class HomePage {
	
	public void LaunchFlipkart(String Browser) {

		InvokeBrowser.Launch(Browser);
		InvokeBrowser.driver.findElement(Locators.CloseButton).click();
		
	}

	public String Title() { 

		return InvokeBrowser.driver.getTitle();
	}
	
	
}
