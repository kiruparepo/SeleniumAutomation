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

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchTextBox;

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

	public void clickCreateWorkSpaceBtn() {

		clickbyXpath(createApplicationBtn, "click on Create Workspace button");

	}
	
	public void enterWorkSpaceName(String name) {
		enterValuebyXpath(createWorspaceButton2, "WorkSpace name", name);
	}
	
	public void enterWorkSpaceDesc(String desc) {
		enterValuebyXpath(workSpaceDesc, "WorkSpace Description", desc);
	}
	
	public void clickCreateWorkSpaceBtn2() {

		clickbyXpath(createWorspaceButton2, "click on Workspace button");

	}
	
	

}
