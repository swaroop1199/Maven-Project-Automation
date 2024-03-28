package Utilities;

import org.openqa.selenium.By;

import Base.BaseClass;

public class Utilities extends BaseClass {
	
	// Element or locator for searchbox of youtube
	By searchbox = By.xpath("//input[@name='search_query']");
	
	
	// Constructor Initialized for Class
	//public Utilities(WebDriver driver1) {
		//this.driver = driver;	
	//}
	
	// Sleep Method
	public static void CustomSleep(long millis) throws InterruptedException{
		Thread.sleep(millis);
	}

	// Maximize Browser Method
	public static void BrowserMaximize() {
		driver.manage().window().maximize();
	}
	
	
	// Method for Search button in Youtube
	public void SearchYoutube(String searchinput) {
		driver.findElement(searchbox).sendKeys(searchinput);
	}
	
	
	
	
}
