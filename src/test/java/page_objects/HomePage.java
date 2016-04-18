package page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BusinessPagesBase;

public class HomePage extends BusinessPagesBase {
	

	public LandingPage doLogin(String username,String password)
	{
	/*	log.debug("Inside login test");*/
		System.out.print("inside homepPage DoLOgin"+username+":"+password);
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(OR.getProperty("pwd"))).sendKeys(password);
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		log.debug("Login Test executed successfully");
		return new LandingPage();
	}

	public void signUp(String Fname,String Lname,String email,String re_enter,String password) 
	{
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(Fname);
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys(Lname);
		driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys(re_enter);
		driver.findElement(By.xpath(".//*[@id='u_0_b']")).sendKeys(password);
	    driver.findElement(By.xpath(".//*[@id='month']")).sendKeys("July");
		driver.findElement(By.xpath(".//*[@id='day']")).sendKeys("3");
		driver.findElement(By.xpath(".//*[@id='year']")).sendKeys("1982");
		
		
	List<WebElement> radio=driver.findElements(By.name("sex"));
    System.out.println(radio.get(0).getAttribute("type"));
	radio.get(0).click();
	
	driver.findElement(By.xpath(".//*[@id='u_0_j']")).click();
	
	//pop up
	//driver.findElement(By.xpath(".//*[@id='u_a_0']/div/div/div[2]/a/span")).click();
	
	/*driver.findElement(By.xpath(".//*[@id='u_0_0']")).click();
	driver.findElement(By.xpath(".//*[@id='u_0_s']")).click();*/
	
	
		
/*		try{
			Select month=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
			month.selectByVisibleText("July");
			Thread.sleep(5000);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	List<WebElement>option1=month.getOptions();
		System.out.println(option1.size());
		
		for(int j=0;j<option1.size();j++)
		{
			System.out.println(option1.get(j).getText());
		}
		
        
		
		Select day=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		day.selectByValue("3");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		Select year=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByVisibleText("1982");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		List<WebElement> options=year.getOptions();
        System.out.println(options.size());
        
        for(int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        }*/

	}
	
	public void validateItemsOnPage()
	{
		
	}
	
	public void facebookText()
	{
		WebElement fb=driver.findElement(By.xpath(OR.getProperty("fbtext")));
		System.out.println(fb.getText());
		System.out.println(driver.getTitle());
		
	}
	
	public void validateLinks()
	{
		List<WebElement> links=driver.findElements(By.tagName(OR.getProperty("links")));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println("printing links and attributes"+links.get(i).getAttribute("href"));
		}
		
	}
}

