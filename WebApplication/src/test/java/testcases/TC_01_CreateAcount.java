package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.WebApplicationWrappers;

public class TC_01_CreateAcount extends WebApplicationWrappers {
	LoginPage loginpage;
	HomePage homepage;
	CreateAccountPage createacpage;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC01 - Create Account in Student Website ";
		testDescription = " Create Account in Student Website ";
	}


	@Test
	public void createAccount() {
		invokeApp("Chrome",loadProp().getProperty("URL"));
		loginpage= new LoginPage(driver);
		homepage= new HomePage(driver);
		createacpage= new CreateAccountPage(driver);
		
		homepage.clickSignUpButton();
		createacpage.enterEmailId("testuser5@gmail.com");
		createacpage.enterUserName("Test User");
		createacpage.enterPassword("Welcome@123");
		createacpage.enterConfirmPassword("Welcome@123");
		createacpage.clickTCCheckbox();
		createacpage.clickSubmitButton();
		
	}

}
