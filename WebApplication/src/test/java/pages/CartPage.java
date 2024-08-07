package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class CartPage extends GenericWrappers {
	
	 private WebDriver driver;
	    
	 // Locate all elements on the page
	    
	    @FindBy(xpath = "//div[@text()='Sign in']")
	    private WebElement signInButton;
	    
	    @FindBy(xpath = "//div[text()='Sign up']")
	    private WebElement signUpButton;
	    
		/*
		 * @FindBy(id = "loginButton") private WebElement loginButton;
		 */
	    
	    // Constructor
	    
	    public CartPage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    // Methods to interact with elements
	    public void clickSignInButton() {
	    	
	    	clickbyXpath(signInButton,"Sign In ");
	    }
	    
	    public void clickSignUpButton() {
	    	clickbyXpath(signUpButton, " Sign Up " );
	    }
	    

}
