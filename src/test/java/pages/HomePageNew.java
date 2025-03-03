package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import wrappers.WebApplicationWrappers;

public class HomePageNew extends WebApplicationWrappers {

	static ExtentTest test;
	static ExtentReports report;

	@FindBy(xpath = "//button[@name='new service']")
	private WebElement createWorspaceButton;

	@FindBy(xpath = "//input[@id=':r1:']")
	private WebElement workSpaceName;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement workSpaceDesc;
	
	@FindBy(xpath = "//button[@name='Create workspace']")
	private WebElement createWorspaceButton2;
	

	@FindBy(xpath = "//p[contains(text(),'Password is invalid')]")
	private WebElement errorPasswordText;

	@FindBy(xpath = "//p[contains(text(),'User could not be found')]")
	private WebElement errorLoginText;

	public HomePageNew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.jsExecutor = (JavascriptExecutor) driver;
	}

	public void clickCreateWorkSpaceBtn() {

		clickbyXpath(createWorspaceButton, "click on Workspace button");

	}
	
	public void enterWorkSpaceName(String name) {
		enterValuebyXpath(workSpaceName, "WorkSpace name", name);
	}
	
	public void enterWorkSpaceDesc(String desc) {
		enterValuebyXpath(workSpaceDesc, "WorkSpace Description", desc);
	}
	
	public void clickCreateWorkSpaceBtn2() {

		clickbyXpath(createWorspaceButton2, "click on Workspace button");

	}
	
	

}
