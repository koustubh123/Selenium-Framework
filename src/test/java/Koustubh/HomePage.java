package Koustubh;

import org.testng.annotations.Test;
import resources.Base;

public class HomePage extends Base{
	//Home Page
	@Test
	public void basePageNavigation() throws Exception {
		driver = initializeDriver();
		driver.get("https://www.fb.com");
		driver.get("https://www.fb.com");
		driver.get("https://www.gd.com");
		driver.get("https://www.pd.com");
		driver.get("https://www.m.com");
	}
}
