package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class MyCoursePage extends GenericWrappers{
    
    private WebDriver driver;
    
    //Locate all elements on the page
    
    @FindBy(xpath = "//div[text()='Go to Course']")
    private WebElement gotoCourseButton;
    
    @FindBy(xpath = "//div[text()='Sign up']")
    private WebElement signUpButton;
    
    
    
    
    public MyCoursePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    // Methods to interact with elements
    
    public void clickGotoCourseButton() {
    	
    	clickbyXpath(gotoCourseButton," Go to Course ");
    }
    
    public void clickSignUpButton() {
    	clickbyXpath(signUpButton, " Sign Up " );
    }
    
}

