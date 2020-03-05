package utilities;

import org.openqa.selenium.By;
 
public class Locators extends LoadProperties {

	// Home Page
	public static By CloseButton = By.xpath(LoadProperties.orXpath.getProperty("Close_Login_Page"));
	public static By LoginButton = By.xpath(LoadProperties.orXpath.getProperty("LoginBtn"));

	// Login Page
	public static By Username = By.xpath(LoadProperties.orXpath.getProperty("Email_field"));
	public static By Password = By.xpath(LoadProperties.orXpath.getProperty("Pass_field"));
	public static By loginbutton = By.xpath(LoadProperties.orXpath.getProperty("Login_Button"));
	public static By message = By.xpath(LoadProperties.orXpath.getProperty("Validate_message")); 
	public static By validateuser = By.xpath(LoadProperties.orXpath.getProperty("Validate_loginuser")); 
	
	//Add To Compare By Select Items
	public static By Dropdown_TVs_Appliances = By.xpath(LoadProperties.orXpath.getProperty("Dropdown_TVs&Appliances"));
	public static By CoffeeMaker = By.xpath(LoadProperties.orXpath.getProperty("Suboption_CoffeeMaker"));
	public static By PriceLowtoHigh = By.xpath(LoadProperties.orXpath.getProperty("Filter_pricelowtohigh"));
	
	//Select Item
	public static By CartItem1 = By.xpath(LoadProperties.orXpath.getProperty("Cart_item1"));
	public static By AddtoCompare1 = By.xpath(LoadProperties.orXpath.getProperty("Check_Addtocompare1"));
	
	public static By CartItem2 = By.xpath(LoadProperties.orXpath.getProperty("Cart_item2"));
	public static By AddtoCompare2 = By.xpath(LoadProperties.orXpath.getProperty("Check_Addtocompare2"));
	
	public static By CartItem3 = By.xpath(LoadProperties.orXpath.getProperty("Cart_item3"));
	public static By AddtoCompare3 = By.xpath(LoadProperties.orXpath.getProperty("Check_Addtocompare3"));
	
	public static By CartItem4 = By.xpath(LoadProperties.orXpath.getProperty("Cart_item4"));
	public static By AddtoCompare4 = By.xpath(LoadProperties.orXpath.getProperty("Check_Addtocompare4"));
	public static By Total_item = By.xpath(LoadProperties.orXpath.getProperty("Total_item"));
	
	public static By CompareButton = By.xpath(LoadProperties.orXpath.getProperty("Button_Compare"));
	public static By AddtoCart = By.xpath(LoadProperties.orXpath.getProperty("Button_Addtocart"));
	
	
	//Add Item by searching
	
	public static By Search = By.xpath(LoadProperties.orXpath.getProperty("Search_field"));
	public static By SelectItem = By.xpath(LoadProperties.orXpath.getProperty("SelectItem"));
	public static By AddtoCartButton = By.xpath(LoadProperties.orXpath.getProperty("AddtoCart_Button"));
	
	public static By OrderButton= By.xpath(LoadProperties.orXpath.getProperty("Order_Button"));
	
}
