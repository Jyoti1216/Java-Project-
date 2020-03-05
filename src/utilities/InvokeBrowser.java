package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeBrowser {

	public static WebDriver driver;

	public static void Launch(String Browser) {
		
		System.setProperty("allure.results.directory", "path/to/directory");
		
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\Resources\\IEDriverServer64.exe");
			driver = new InternetExplorerDriver();
		} else
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(LoadProperties.config.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
 
}
