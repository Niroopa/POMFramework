package rough;

import base.BusinessPagesBase;
import page_objects.HomePage;
import page_objects.LandingPage;
import page_objects.MyProfilePage;

public class LoginTest1 {
	
	public static void main(String args[]) throws InterruptedException
	{
	
		HomePage hp=new HomePage();
		hp.doLogin("softwareseleniumtesting123@gmail.com","Welcome!123");
		//hp.signUp("SeleniumTami","last", "softwareseleniumtesting123@gmail.com", "softwareseleniumtesting123@gmail.com","Welcome!123");
		//Thread.sleep(5000);
		//hp.facebookText();
		//hp.validateLinks();
		
	/*	HomePage hp=new HomePage();
		hp.doLogin("oftwareseleniumtesting123@gmail.com","Welcome!123");
		
		LandingPage lp=new LandingPage();
		lp.goToProfile();
		//lp.logOut();
		
		MyProfilePage mp=new MyProfilePage();
		mp.updateInfo();
	//	mp.uploadPic();
		mp.logOut();*/
		
	/*	Page Object Model Starts from here..
		page object model design pattern is based on encapsulation and inheritence concept
		business logic is kept under one package
		test cases kept under one package
		testing is done using testng and driver shouldnt be there in testing page ..if driver is present in the
		testing page then the page object model concept fails..
		driver implementation and all is done in the business logic pages and all..
		Page Object Model is basically designed ..where the method is responible to taking to the next page 
		then it should return the object of that particular navigated page.*/
		
	/*	HomePage hp=new HomePage();
		LandingPage lp=hp.doLogin("nirupatamiri24@yahoo.com","pradeep28mallada");
		MyProfilePage mp = lp.goToProfile();
		mp.updateInfo();
		mp.uploadPic();
		BusinessPagesBase.topnav.goToHome();
		BusinessPagesBase.topnav.logOut();*/
		
		
		/*above 4 lines of code can also be written in a single line like this in webdriver */
	//	new HomePage().doLogin("nirupatamiri24@yahoo.com","pradeep28mallada").goToProfile().uploadPic();
		
		
	}

}
