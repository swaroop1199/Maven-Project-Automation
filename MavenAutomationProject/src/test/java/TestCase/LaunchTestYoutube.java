package TestCase;

import org.testng.annotations.Test;
import Utilities.Utilities;

public class LaunchTestYoutube extends Utilities {

	@Test
	public static void Browserlaunch() throws InterruptedException {
		
		//Object created for Utilities to use SearchYoutube Method present in it
		Utilities page = new Utilities();
		
		
		BrowserMaximize();
		// Custom Search method created for youtube
		page.SearchYoutube("Mission Impossible Dead Reckoning part 1");
		CustomSleep(10000);
	}

}
