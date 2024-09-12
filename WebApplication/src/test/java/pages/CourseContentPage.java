package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class CourseContentPage extends GenericWrappers{
    
    private WebDriver driver;
    
    //Locate all elements on the page
    
    @FindBy(xpath = "//div[text()='Go to Course']")
    private WebElement gotoCourseButton;
    
    @FindBy(xpath = "//div[text()='Sign up']")
    private WebElement signUpButton;
    
    @FindBy(xpath = "(//div[contains(@class,'Course_Content_topic_Assests_Content_View_After_Buy')])[2]")
    private WebElement topicVideoButton;
    
    @FindBy(xpath = "(//div[contains(@class,'Course_Content_topic_Assests_Content_View_After_Buy')])[2]")
    private WebElement topicAssessmentButton;
    
    @FindBy(xpath = "//div[contains(@class,'video_play_progress')]")
    private WebElement videoProgressBar;
    
    
    @FindBy(xpath = "//*[@role='status']")
	private WebElement assessmentToastMessage;
    
    public WebElement chapterTitle(int chapternum)
    {
    	return driver.findElement(By.xpath("(//div[contains(@class,'Course_Content_chapter_Name_Text')])["+chapternum+"]"));
    }
    
    public WebElement videoField(int topicnum)
    {
    	return driver.findElement(By.xpath("(//div[contains(@class,'Course_Content_topic_Name_Text_View_after_buy')])["+topicnum+"]"));
    }
    
    public WebElement topicTitle(int chapternum)
    {
    	return driver.findElement(By.xpath("(//div[contains(@class,'Course_Content_topic_Name_Text')]/div)["+chapternum+"]"));
    }
 
 
    
    public CourseContentPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    // Methods to interact with elements
    
    public void playTopicVideo() {
    	clickbyXpath(topicVideoButton," Play Topic level Video ");
    }
    
    public void clickAssessmentButton() {
    	clickbyXpath(topicAssessmentButton,"Topic Level Assessment Button ");
    }
    
    public void checkToastMeseage(String toast) {
    	verifyTextContainsByXpath(assessmentToastMessage,toast, "Toast Message");
    }
    
    public void clickGotoCourseButton() {
    	
    	clickbyXpath(gotoCourseButton," Go to Course ");
    }
    
    public void clickSignUpButton() {
    	clickbyXpath(signUpButton, " Sign Up " );
    }
    
    public void clicktoSelectChapter(int chapternum) {
    	clickbyXpath(chapterTitle(chapternum), " Chapter Field " );
    }
    
    public void clicktoSelectTopic(int topicnum) {
    	clickbyXpath(topicTitle(topicnum), " Chapter Field " );
    }
    
    
    
}

