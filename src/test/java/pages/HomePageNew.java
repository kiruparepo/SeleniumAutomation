package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.Reporter;
import wrappers.WebApplicationWrappers;

public class HomePageNew extends WebApplicationWrappers {

	static ExtentTest test;
	static ExtentReports report;

	@FindBy(xpath = "//button[@name='new service']")
	private WebElement createWorkspaceButton;

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
	
	@FindBy(xpath = "(//*[@data-testid='workspace-description-text'])[1]")
	private WebElement firstWorkSpace;
	
	@FindBy(xpath = "//img[@alt='First launch']")
	private WebElement launchApplicationBtn;
	
	

	public HomePageNew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.jsExecutor = (JavascriptExecutor) driver;
	}

	public void clickCreateWorkSpaceBtn() {

		clickbyXpath(createWorkspaceButton, "click on Create Workspace button");

	}
	
	public void checkCreateWorkspaceBtnNotExist() {
	    try {
	        // Check if the element is displayed, and if it is not, report as "PASS"
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
	        // Use an intentionally incorrect or non-existing XPath to trigger a failure
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='new service']")));
	        Reporter.reportStep("Create Workspace button unexpectedly found!", "FAIL");
	    } catch (TimeoutException e) {
	        // This is expected behavior in the negative test case
	        Reporter.reportStep("Create Workspace button not visible after waiting (expected negative scenario)", "PASS");
	    } catch (NoSuchElementException e) {
	        // This is expected behavior in the negative test case
	        Reporter.reportStep("Create Workspace button not found (expected negative scenario)", "PASS");
	    } catch (Exception e) {
	        // Catch other unexpected exceptions
	        Reporter.reportStep("Unexpected error while checking Create Workspace button visibility", "FAIL");
	    }
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
	
	public void selectFirstWorkSpaceBtn() {

		clickbyXpath(firstWorkSpace, "click on First Workspace ");

	}
	
	public void navigateAllWorkSpace() {
		try {
		List<WebElement> li=driver.findElements(By.xpath("//*[@data-testid='workspace-description-text']"));
		int j=1;
		for(int i=0; i<li.size();i++) {
			li.get(i).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
	        // Use an intentionally incorrect or non-existing XPath to trigger a failure
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='new_application']")));
	       driver.navigate().back();
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='workspace-description-text']")));
           li = driver.findElements(By.xpath("//*[@data-testid='workspace-description-text']"));
	       Reporter.reportStep("User navigated to "+ j +" Worksapce ","PASS");
	       j++;
		}
		}catch (Exception e) {
			Reporter.reportStep("Unable to click on Workspace card","FAIL");
		}
	}
	
	

}
