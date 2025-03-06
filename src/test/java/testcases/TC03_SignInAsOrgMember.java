package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePageNew;
import pages.SignInPageNew;
import utils.Reporter;
import wrappers.WebApplicationWrappers;

public class TC03_SignInAsOrgMember extends WebApplicationWrappers {
	SignInPageNew signInPage;
	HomePageNew homePageNew;
	
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC03 - Sign In to Account in HOF with Org Member ";
		testDescription = "  Sign In to Account in HOF as Org Member ";
	}


	@Test
	public void signInCreateWorkspace() throws InterruptedException {
		
		initDriver("Windows","Chrome",false);
		Reporter.reportStep("Browser : Chrome ","INFO");
		Reporter.reportStep("Platform : Windows ","INFO");
		
		signInPage= new SignInPageNew(driver);
		homePageNew=new HomePageNew(driver);
		
		launchApplication(loadProp().getProperty("URL"));
		
		signInPage.enterEmail("testuser151515@company.com");
		signInPage.clickSignInNextButton();
		
		signInPage.enterPassword("Kirupa@26");
		signInPage.clickSignInNextButton();
		verifyTitle("All workspaces - House Of FOSS");
		homePageNew.checkCreateWorkspaceBtnNotExist();
		
		
		
	}
	
}
