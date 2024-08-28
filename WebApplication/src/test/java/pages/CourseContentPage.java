package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class CourseContentPage extends GenericWrappers {

	private WebDriver driver;
	public JavascriptExecutor jsExecutor;
			
	// Locate all elements on the page
	
	@FindBy(xpath = "(//div[contains(@class,'Course_Content_chapter_Name_Text')])[1]")
	private WebElement chapterField;
	
	@FindBy(xpath = "(//div[contains(@class,'Course_Content_chapter_Name_Text')])[1]")
	private WebElement secondChapterField;
	
	@FindBy(xpath = "(//div[contains(@class,'Course_Content_topic_Assests_Content_View_After_Buy')])[1]")
	private WebElement playVideoButton;
	
	@FindBy(xpath = "(//div[contains(@class,'Course_Content_topic_Assests_Content_View_After_Buy')])[2]")
	private WebElement topicAssessmentButton;
	
	@FindBy(xpath = "//video[contains(@class,'video_video')]")
	private WebElement videoField;
	
	@FindBy(xpath = "//*[@color='#21B573']")
	private WebElement greenTickField;
	
	@FindBy(xpath = "//div[contains(@class,'Course_Content_chapter_Assessment_View')]")
	private WebElement chapterAssessmentButton;
	
	public WebElement getChapterField(String num) {
        String xpath = String.format("(//div[contains(@class,'Course_Content_chapter_Name_Text')])["+num+"]");
        return driver.findElement(By.xpath(xpath));
    }
	
	public WebElement getTopicField(String num) {
        String xpath = String.format("(//div[contains(@class,'Course_Content_topic_Name_Text')]/div)["+num+"]");
        return driver.findElement(By.xpath(xpath));
    }
	
	@FindBy(xpath = "//div[contains(@class,'Exam_Instruction_submit_button')]/div")
	private WebElement examInstStartExamButton;
	
	@FindBy(xpath = "//*[@role='status']")
	private WebElement assessmentToastMessage;
	
	public CourseContentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	private static String chapternumber1() {
		// TODO Auto-generated method stub
		return null;
	}


	public void clickChaptertitle(String num) {
		scrollToElement(getChapterField(num));
		clickbyXpath(getChapterField(num)," Chapter Title ");
		
	}
	
	public void clickTopictitle(String num) {
		scrollToElement(getTopicField(num));
		clickbyXpath(getTopicField(num)," Topic Title ");
		
	}
	
	public void clickPlayVideo() {
		clickbyXpath(playVideoButton," Play Video Button ");
		
	}
	
	public void clickTopicAssessmentButton() {
		clickbyXpath(topicAssessmentButton," Topic Assessment button ");
		
	}
	
	public void completeVideoandVerifyGreenTick() {

	jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].currentTime = arguments[0].duration;", videoField);
	verifyElementVisible(greenTickField," Green Tick Mark ");
	
	}
	
	public void checkAssessmentCompletedToast() {
		verifyElementVisible(assessmentToastMessage,"Already completed Assessment Toast");
	}
	
	public void clickChatpterAssessmentButton() {
		clickbyXpath(chapterAssessmentButton," Chapter Assessment button ");
		
	}
	
	public void clickStartExam() {
		clickbyXpath(examInstStartExamButton," Assessment button ");
		
	}
}
