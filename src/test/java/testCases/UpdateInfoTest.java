package testCases;

import org.testng.annotations.Test;

import base.BusinessPagesBase;
import page_objects.LandingPage;
import page_objects.MyProfilePage;



public class UpdateInfoTest {

	
	
	@Test
	public void updateInfo(){
		
	
	LandingPage lp=BusinessPagesBase.topnav.goToHome();
	MyProfilePage mp = lp.goToProfile();
	mp.updateInfo();
	BusinessPagesBase.topnav.logOut();
	}
	
	
 


}


