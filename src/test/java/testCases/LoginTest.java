package testCases;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BusinessPagesBase;
import base.TestBase;
import page_objects.HomePage;
import page_objects.LandingPage;
import utilities.ExcelReader;

public class LoginTest extends TestBase {

	HomePage hp=new HomePage();
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password)
	{
		Log.debug("Inside Login test");
		System.out.println("username"+username +"password"+password);
	    
	    LandingPage lp = hp.doLogin(username,password);
	    if (lp != null){
	      System.out.println("true");	
    	  Assert.assertTrue(true);
	    }
	    else{
	      System.out.println("false");
	      Assert.assertTrue(false);
	    }
	    
	    
}
	
	/*@Test(priority=1, alwaysRun=true)
	public void doLogin1()
	{
		hp.doLogin("nirupatamiri24@yahoo.com", "pradeep28");
		Assert.assertFalse(true);
	}*/
	
	@DataProvider
	public static Object[][] getData(){
		
/*		if (excel == null){
			ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\test_data.xlsx");	
		} */
		String sheetName="Login_Test"; 
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		System.out.println("total rows are : "+rows);
		System.out.println("total rows are : "+cols);	
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum = 2; rowNum <= rows; rowNum++){
			
			for (int colNum = 0; colNum < cols; colNum++){
				
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				
				System.out.println(data[rowNum-2][colNum]);
			}
		}
		
		return data;
		
	}
	
}