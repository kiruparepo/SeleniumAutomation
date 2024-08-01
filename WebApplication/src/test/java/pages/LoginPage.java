package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

	private WebDriver driver;

	// Locate all elements on the page
	@FindBy(xpath = "//input[@name='user_email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@name='user_email']")
	private WebElement userNameField;

	@FindBy(xpath = "//android.widget.TextView[@text='Sign In']")
	private WebElement signInButton;

	// Constructor to initialize the driver and instantiate elements using
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Methods to be used as part of loginpage.
	
	public void enterEmailId(String email) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		entervaluebyXpath(userNameField, methodName, email);
	}

	public void clickSignInButton() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		clickbyXpath(signInButton, methodName);
		
	}

}
