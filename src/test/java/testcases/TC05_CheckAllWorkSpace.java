package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CurrentApplicationPage;
import pages.HomePageNew;
import pages.SignInPageNew;
import utils.Reporter;
import wrappers.WebApplicationWrappers;

public class TC05_CheckAllWorkSpace extends WebApplicationWrappers {
	SignInPageNew signInPage;
	HomePageNew homePageNew;
	CurrentApplicationPage currentapppage;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC05 - Check user able to naviagte to all workspaces";
		testDescription = "Login to HOF and check user able to naviagte to all availble Workspace";
	}


	@Test
	public void signInCreateWorkspace() throws InterruptedException {
		initDriver("Windows","Chrome",false);
		Reporter.reportStep("Browser : Chrome ","INFO");
		Reporter.reportStep("Platform : Windows ","INFO");
		
		signInPage= new SignInPageNew(driver);
		homePageNew=new HomePageNew(driver);
		currentapppage= new CurrentApplicationPage(driver);
		
		launchApplication(loadProp().getProperty("URL"));
		
		signInPage.enterEmail("AutomationUser@belsterns.com");
		signInPage.clickSignInNextButton();
		
		signInPage.enterPassword("Welcome@123");
		signInPage.clickSignInNextButton();
		verifyTitle("All workspaces - House Of FOSS");
		
		homePageNew.navigateAllWorkSpace();
		
	}
	
}

