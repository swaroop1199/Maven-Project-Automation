package Utilities;

import Base.BaseClass;

public class Utilities extends BaseClass {
	
	//Sleep Method
	public static void CustomSleep(long millis) throws InterruptedException{
		Thread.sleep(millis);
	}

	//Maximize Browser Method
	public static void BrowserMaximize() {
		driver.manage().window().maximize();
	}
	
	
	
}
