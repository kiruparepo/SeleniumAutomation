package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class MyCoursePage extends GenericWrappers {
	
	private WebDriver driver;

	// Locate all elements on the page

	@FindBy(xpath = "//div[text()='Home']")
	private WebElement homeButton;

	@FindBy(xpath = "//div[text()='Home']//following-sibling::div[1]")
	private WebElement myCourseButton;
	
	@FindBy(xpath = "//div[text()='Go to Course']")
	private WebElement gotoCourseButton;
	
	

	public MyCoursePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickHomeButton() {
		clickbyXpath(homeButton," Home Button ");
	}
	
	public void clickMyCourseButton() {
		clickbyXpath(myCourseButton," My Course Button ");
	}
	
	public void clickGotoCourseButton() {
		clickbyXpath(gotoCourseButton," Goto Course Button ");
	}

	
	
}
