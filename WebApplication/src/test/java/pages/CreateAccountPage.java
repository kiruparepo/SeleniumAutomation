package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wrappers.GenericWrappers;

public class CreateAccountPage extends GenericWrappers {
	
		private WebDriver driver;
	 // Locate all elements on the page
	    
		@FindBy(xpath = "//input[@name='user_email']")
		private WebElement emailField;
		
		@FindBy(xpath = "//input[@name='user_name']")
		private WebElement usernameField;
		
		@FindBy(xpath = "//input[@name='password']")
		private WebElement passwordField;
		
		@FindBy(xpath = "//input[@name='confirm_password']")
		private WebElement confirmPasswordField;
		
		@FindBy(xpath = "//input[@name='term_and_condition']")
		private WebElement tcField;
		
	    @FindBy(xpath = "//div[@text()='Submit']")
	    private WebElement submitButton;
	    
	    @FindBy(xpath = "//div[@text()='Sign in']")
	    private WebElement signInButton;
	    
	    @FindBy(xpath = "//div[@text()='Terms and Conditions']")
	    private WebElement tcLink;
	    
	    
	    
	    // Constructor
	    
	    public CreateAccountPage(WebDriver driver) {
	    	
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    
	    // Methods to interact with elements
	    
		public void enterEmailId(String emailId) {
			enterValuebyXpath(emailField, " Email ID ", emailId);
		}

		
		public void enterUserName(String userName) {
			enterValuebyXpath(usernameField, " User Name ", userName);
		}

		public void enterPassword(String password) {
			enterValuebyXpath(passwordField, " Password ", password);
		}

		
		public void enterConfirmPassword(String confirmPassword) {
			enterValuebyXpath(confirmPasswordField, "Confirm Password", confirmPassword);
		}

		
		public void clickTCCheckbox() {
			clickbyXpath(tcField, " Terms and Conditions check box ");
		}

		
		public void clickTcLink() {
			clickbyXpath(tcLink, " Terms and Conditions check Link ");
		}

		
		public void clickSignInButton() {
			clickbyXpath(signInButton, " Sign In");
		}

		
		public void clickSubmitButton() {
			clickbyXpath(submitButton, " Submit Button ");
		}
}
