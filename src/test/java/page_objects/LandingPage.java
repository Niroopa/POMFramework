package page_objects;

import org.openqa.selenium.By;
import base.BusinessPagesBase;

public class LandingPage extends BusinessPagesBase {

	
	public MyProfilePage goToProfile()
	{
		
		driver.findElement(By.partialLinkText("Niroopa")).click();
		
		return new MyProfilePage();
	}
	
	
	public void postMessage()
	{
		
	}
	

	
	
}
	


