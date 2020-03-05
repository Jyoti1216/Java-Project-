package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {

	public ExtentTest test;
	public ExtentReports report;

	public void startTest() {
		report = new ExtentReports("E:\\Automation\\Project\\Selenium_pJ\\Report\\ExtentReportResults.html");
		test = report.startTest("FlipkartAutomation");
	}

	public void endTest() {
		report.endTest(test);
		report.flush();
	}
	
	public void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
	}
	
	public String Screenshot(WebDriver driver) throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") +"\\Screenshot\\" + System.currentTimeMillis() + "_sshot.png";
		Files.copy(screenshotFile, new File(path));
		return path;
	}
	
//	public void name() {
//		
//		AllureTestNg allure1 = new AllureTestNg();
//		
//		
//		
//	}
	
		
}
