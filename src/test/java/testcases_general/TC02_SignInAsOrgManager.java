package testcases_general;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePageNew;
import pages.SignInPageNew;
import wrappers.WebApplicationWrappers;

public class TC02_SignInAsOrgManager extends WebApplicationWrappers {
	SignInPageNew signInPage;
	HomePageNew homePageNew;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC01 - Sign In to Account in HOF with Org Manager ";
		testDescription = "  Sign In to Account in HOF as Org Manager ";
	}


	@Test
	public void signInCreateWorkspace() throws InterruptedException {
		signInPage= new SignInPageNew(driver);
		homePageNew=new HomePageNew(driver);
		
		launchApplication(loadProp().getProperty("URL"));
		
		verifyTitle("Welcome Back!");
		
		signInPage.enterEmail("kirupakaran.p@belsterns.com");
		signInPage.clickSignInNextButton();
		
		signInPage.enterPassword("Welcome@123");
		signInPage.clickSignInNextButton();
		//signInPage.checkEmailIdError();
		verifyTitle("All workspaces");
		
		
		
	}
	
}
