package base;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExcelReader;


public class TestBase {
	
	public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\test_data.xlsx");
	public static Logger Log = Logger.getLogger("NiroopaLogger");
	

	@BeforeSuite
	public void setUp()
	{

			
		System.out.println("Inside Before suite");
		
		
	}
	
	@AfterSuite
	public void tearDown()
	{
 		BusinessPagesBase.driver.quit();
	}
}
