package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utilities.Utilities;

public class LaunchTestYoutube extends Utilities {

	@Test
	public static void Browserlaunch() throws InterruptedException {
		
		
		BrowserMaximize();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Animal");
		CustomSleep(10000);
	}

}
