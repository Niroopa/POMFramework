package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import base.BusinessPagesBase;

public class MyProfilePage extends BusinessPagesBase {
	
	public MyProfilePage updateInfo()
	{
		driver.findElement(By.xpath(".//*[@id='pagelet_timeline_profile_actions']/a")).click();
		
        return this;	
	}

	public MyProfilePage uploadPic()
	{
	     
		driver.findElement(By.xpath(".//*[@id='u_jsonp_2_5']/img")).click();
		driver.findElement(By.xpath(".//*[@id='js_k']")).sendKeys("C:\\Users\\niroopa\\Desktop\\Ganesha.jpg");
		driver.findElement(By.xpath(".//*[@id='facebook']/body/div[25]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/button[2]")).click();
		
		return this;
	}
	
	
	public String friendsText()
	{
		return driver.findElement(By.xpath(".//*[@id='u_jsonp_2_4']/div/a[3]")).getText();
		
	}
	/*public WebElement goToFriends(String str)
	{
		try{
		driver.findElement(By.xpath(".//*[@id='u_0_u']/div/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_3o']/span/input")).sendKeys(str);
		driver.findElement(By.xpath(".//*[@id='u_0_3o']/span/button")).clear();	
		WebElement value = driver.findElement(By.xpath(".//*[@id='js_j']"));
		System.out.println("Printing here" +value);
		return value;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}*/
	
	public void goToPhotos()
	{
		
	}
	

	
}
