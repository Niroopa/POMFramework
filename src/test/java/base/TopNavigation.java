package base;

import org.openqa.selenium.By;

import page_objects.LandingPage;

public class TopNavigation {

	
	public void doSearch()
	{
		
	}
	
	public LandingPage goToHome()
	{
		BusinessPagesBase.driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		return new LandingPage();
		
	}
	
	
	public void logOut()
	{
		{
			
			/*WebElement logButton=driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
			Actions action=new Actions(driver);
			action.contextClick(logButton).perform();
					
			WebElement logout=driver.findElement(By.xpath(".//*[@id='u_2_1']//div/div//div[1]//div//div//ul//li[12]//a//span//span"));
			action.moveToElement(logout).perform();*/
			
			BusinessPagesBase.driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
			
			//below locator using xpath is not working as its javascript or dynamic element thats why used partial link text
			//driver.findElement(By.xpath(".//*[@id='u_g_1']/div/div/div[1]/div/div/ul/li[1]/a/span/span")).click();
			
			BusinessPagesBase.driver.findElement(By.xpath(".//*[text()='Log Out']")).click();
			
		}
		
		
		
	}
}
