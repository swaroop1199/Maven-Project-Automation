package TestCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.Utilities;

public class LaunchTestGoogle extends Utilities {
	
	@Test
	public void Launchgoogle() throws InterruptedException {
		
		ExtentTest test1 = ExtentReportTest.createTest("Test Case:1","Google Page Browser Open");
		BrowserMaximize();
		CustomSleep(10000);
		log.info(test1.pass("Test Completed"));
	}
	
}
