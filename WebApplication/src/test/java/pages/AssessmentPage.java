package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AssessmentPage extends GenericWrappers {
	
	 private WebDriver driver;
	 

	public AssessmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	 

}
