package Koustubh;

import org.testng.annotations.Test;
import resources.Base;

public class HomePage extends Base{
	
	@Test
	public void basePageNavigation() throws Exception {
		driver = initializeDriver();
		driver.get("https://www.fb.com");
	}
}