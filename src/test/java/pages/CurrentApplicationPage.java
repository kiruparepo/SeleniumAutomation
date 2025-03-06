package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import wrappers.WebApplicationWrappers;

public class CurrentApplicationPage extends WebApplicationWrappers {

	static ExtentTest test;
	static ExtentReports report;

	@FindBy(xpath = "//button[@name='new_application']")
	private WebElement createApplicationBtn;

	@FindBy(xpath = "//img[@alt='Peppermint logo']")
	private WebElement peppermintCard;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement peppermintContinueButton;
	
	

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement workSpaceDesc;
	
	@FindBy(xpath = "//button[@name='Create workspace']")
	private WebElement createWorspaceButton2;
	

	@FindBy(xpath = "//p[contains(text(),'Password is invalid')]")
	private WebElement errorPasswordText;

	@FindBy(xpath = "//p[contains(text(),'User could not be found')]")
	private WebElement errorLoginText;

	public CurrentApplicationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.jsExecutor = (JavascriptExecutor) driver;
	}

	public void clickCreateApplicationBtn() {

		clickbyXpath(createApplicationBtn, "click on Create Application button");

	}
	
	
	public void enterWorkSpaceName(String name) {
		enterValuebyXpath(createWorspaceButton2, "WorkSpace name", name);
	}
	
	public void clickPeppermintCard() {

		clickbyXpath(peppermintCard, "click on Peppermint Card ");

	}
	
	public void clickPeppermintContinueBtn() {

		clickbyXpath(peppermintContinueButton, "click on Peppermint Continue");

	}
	
	

}
