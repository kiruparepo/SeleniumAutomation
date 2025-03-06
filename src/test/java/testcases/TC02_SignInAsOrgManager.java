package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePageNew;
import pages.SignInPageNew;
import utils.Reporter;
import wrappers.WebApplicationWrappers;

public class TC02_SignInAsOrgManager extends WebApplicationWrappers {
	SignInPageNew signInPage;
	HomePageNew homePageNew;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC02 - Sign In to Account in HOF with Org Manager ";
		testDescription = "  Sign In to Account in HOF as Org Manager ";
	}


	@Test
	public void signInCreateWorkspace() throws InterruptedException {
		
		initDriver("Windows","Chrome",false);
		Reporter.reportStep("Browser : Chrome ","INFO");
		Reporter.reportStep("Platform : Windows ","INFO");
		
		signInPage= new SignInPageNew(driver);
		homePageNew=new HomePageNew(driver);
		
		launchApplication(loadProp().getProperty("URL"));		
		signInPage.enterEmail("kirupakaran.p@belsterns.com");
		signInPage.clickSignInNextButton();
		
		signInPage.enterPassword("Welcome@123");
		signInPage.clickSignInNextButton();
		Thread.sleep(2000);
		verifyTitle("All workspaces - House Of FOSS");
		homePageNew.checkCreateWorkspaceBtnNotExist();
		
		
		
		
	}
	
}
