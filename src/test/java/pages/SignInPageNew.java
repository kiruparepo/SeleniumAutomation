package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import wrappers.WebApplicationWrappers;

public class SignInPageNew extends WebApplicationWrappers {

	static ExtentTest test;
	static ExtentReports report;


	@FindBy(xpath = "//button[@id='submit-button']")
	private WebElement signInNextBtn;
	
	@FindBy(xpath = "//input[@id='loginName']")
	private WebElement loginTxtBox;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordtxtbox;
	
	@FindBy(xpath = "//p[contains(text(),'Password is invalid')]")
	private WebElement errorPasswordText;
	

	@FindBy(xpath = "//p[contains(text(),'User could not be found')]")
	private WebElement errorLoginText;
	
	public SignInPageNew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.jsExecutor = (JavascriptExecutor) driver;
	}

	// navigate to signin page and check page title

	public void clickSignInNextButton() {
		
		scrollToElements(signInNextBtn);
		clickbyXpath(signInNextBtn, "click on SignIn Next button");
		
	}

	// check error message entering only space
	public void enterEmail(String email) {
		enterValuebyXpath(loginTxtBox, "Login Name ", email);
	}
	
	public void checkLoginNameError(String error) {
		verifyTextContainsByXpath(errorLoginText, error, "Login Name ");
	}
	
	public void enterPassword(String password) {
		enterValuebyXpath(passwordtxtbox, "Password ", password);
	}

	public void checkPasswordError(String error) {
		verifyTextContainsByXpath(errorPasswordText, error, "Password error ");
	}

	// check error message entering only characters

}