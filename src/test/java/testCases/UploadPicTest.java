package testCases;

import org.testng.annotations.Test;

import base.BusinessPagesBase;
import base.TestBase;
import page_objects.LandingPage;
import page_objects.MyProfilePage;



public class UploadPicTest extends TestBase{
	
	@Test
	public void uploadPic()
	{

	LandingPage lp=BusinessPagesBase.topnav.goToHome();
	MyProfilePage mp = lp.goToProfile();
	mp.uploadPic();
	BusinessPagesBase.topnav.logOut();
	}
}

