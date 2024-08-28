package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AssessmentPage;
import pages.CourseContentPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyCoursesPage;
import pages.StudentHomePage;
import wrappers.WebApplicationWrappers;


public class TC_02_TakeChapterAssessment extends WebApplicationWrappers {
	LoginPage loginpage;
	HomePage homepage;
	CreateAccountPage createacpage;
	CourseContentPage coursecontentpage;
	StudentHomePage studenthomepage;
	MyCoursesPage mycoursepage;
	AssessmentPage assessmentpage;
	
	@BeforeClass
	public void startTestCase() {
		testCaseName = " TC02 - Goto My Course and Take up Topic Assessment ";
		testDescription = " Goto my Course and Takeup Topic 1 Assessment ";
	}


	@Test
	public void createAccount() throws InterruptedException {
		invokeApp("Chrome",loadProp().getProperty("URL"));
		loginpage= new LoginPage(driver);
		homepage= new HomePage(driver);
		createacpage= new CreateAccountPage(driver);
		coursecontentpage= new CourseContentPage(driver);
		studenthomepage=new StudentHomePage(driver);
		mycoursepage=new MyCoursesPage(driver);
		assessmentpage=new AssessmentPage(driver);
		
		homepage.clickSignInButton();
		loginpage.enterEmailId("testuser6@gmail.com");
		loginpage.enterPassword("Welcome@123");
		loginpage.clickSubmitButton();
		studenthomepage.clickMyCourseButton();
		mycoursepage.clickGotoCourse();
		//coursecontentpage.clickChaptertitle("1");
		Thread.sleep(2000);
		coursecontentpage.clickTopicAssessmentButton();
		assessmentpage.enterAssessmentInput("Yes");
		assessmentpage.clickSubmitButton();
		assessmentpage.enterAssessmentInput("1");
		assessmentpage.clickSubmitButton();
		assessmentpage.enterMcqOption("1");
		assessmentpage.clickMCQSubmitButton();
		assessmentpage.enterMcqOption("1");
		assessmentpage.clickMCQSubmitButton();
		assessmentpage.enterMcqOption("1");
		assessmentpage.clickMCQSubmitButton();
		assessmentpage.enterAssessmentInput("1");
		assessmentpage.clickSubmitButton();
		assessmentpage.clickoverAllSubmitButton();
		assessmentpage.clickCheckBox();
		assessmentpage.clickAnswerSubmitButton();
		assessmentpage.checkpercentage("100%");
		Thread.sleep(5000);
		assessmentpage.checkResult("PASS");
		assessmentpage.clickOkButton();
		Thread.sleep(10000);
	}

}
