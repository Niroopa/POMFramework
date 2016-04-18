package base;

//import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;


public class BusinessPagesBase {

	
	public static WebDriver driver;
	public static TopNavigation topnav;
	public static Logger log=Logger.getLogger("NiroopaLogger");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	
	public BusinessPagesBase() 
	{
		System.out.println("in business base constructor");
		
		
		if(driver == null)
		{
		//	driver=new FirefoxDriver();
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.Properties");
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
				log.debug("OR property loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.Properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				Config.load(fis);
				log.debug("Config property loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		    
			if(Config.getProperty("browser").equals("firefox"))
			{
				driver=new FirefoxDriver();
			}else if(Config.getProperty("browser").equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			else if(Config.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			System.out.println(Config.getProperty("testsiteurl"));
			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Navigated to test site url");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
     		topnav=new TopNavigation();
		}		

}
	
	@BeforeSuite
	public void setUp() throws IOException
	{

		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.Properties");
		OR.load(fis);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.Properties");
	    Config.load(fis);
		
	    System.out.println(Config.getProperty("testsiteurl"));
		driver.get(Config.getProperty("testsiteurl"));
		
		
	}
	
	
}

