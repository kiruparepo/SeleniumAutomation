package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePageNew;
import pages.SignInPageNew;
import utils.Reporter;
import wrappers.WebApplicationWrappers;

public class TC01_SignInandCreateWorkspace extends WebApplicationWrappers {
	SignInPageNew signInPage;
	HomePageNew homePageNew;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC01 - Sign In to Account in HOF ";
		testDescription = "  Sign In to Account in HOF and Create Workspace ";
	}


	@Test
	public void signInCreateWorkspace() throws InterruptedException {
		initDriver("Windows","Chrome",false);
		Reporter.reportStep("Browser : Chrome ","INFO");
		Reporter.reportStep("Platform : Windows ","INFO");
		
		signInPage= new SignInPageNew(driver);
		homePageNew=new HomePageNew(driver);
		
		
		launchApplication(loadProp().getProperty("URL"));
		
		signInPage.enterEmail("DemoUser@belsterns.com");
		signInPage.clickSignInNextButton();
		signInPage.clickSignInNextButton();
		
		signInPage.checkLoginNameError("User could not be found");
		
		signInPage.enterEmail("AutomationUser@belsterns.com");
		signInPage.clickSignInNextButton();
		
		signInPage.enterPassword("Welcome@12");
		signInPage.clickSignInNextButton();
		signInPage.checkPasswordError("Password is invalid");
		
		signInPage.enterPassword("Welcome@123");
		signInPage.clickSignInNextButton();
		//signInPage.checkEmailIdError();
		verifyTitle("All workspaces - House Of FOSS");
		homePageNew.clickCreateWorkSpaceBtn();
		int randomNumber = 1000 + (int)(Math.random() * 9000);
		
		homePageNew.enterWorkSpaceName("Bewaret"+randomNumber);
		
		homePageNew.enterWorkSpaceDesc("Digital workspaces and New way of making things work");
		
		homePageNew.clickCreateWorkSpaceBtn2();
		
		
		
	}
	
}
