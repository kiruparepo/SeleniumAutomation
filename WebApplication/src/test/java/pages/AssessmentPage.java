package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AssessmentPage extends GenericWrappers {
	
	 private WebDriver driver;
	 
		@FindBy(xpath = "//input[contains(@class,'Assessment_answerInput')]")
		private WebElement enterFillQuestion;

		@FindBy(xpath = "//div[contains(@class,'Assessment_submitButton')]")
		private WebElement SubmitButton;

		@FindBy(xpath = "//div[contains(@class,'Assessment_nextButton')]")
		private WebElement nextButton;

		@FindBy(xpath = "//div[contains(@class,'Assessment_over_All_Submit_Button')]")
		private WebElement overAllSubmitButton;

		@FindBy(xpath = "(//div[contains(@class,'Assessment_optionKey')])[1]")
		private WebElement mcqOption1;

		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement popUpCheckbox;
	 
		@FindBy(xpath = "//div[contains(@class,'ModalComponent_submit_button_Text')]")
		private WebElement popUpSubmitButton;
		
		@FindBy(xpath = "(//div[contains(@class,'ScoreCardModal_percentage')])[3]")
		private WebElement checkPercentage;
		
		@FindBy(xpath = "//div[contains(@class,'ScoreCardModal_button_view')]")
		private WebElement okayButton;
	 
		
	 

	public AssessmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void enterFillQuestion(String Answer) {
		entervaluebyXpath(enterFillQuestion, " Enter Fill Question field ", Answer);
	}

	public void clickSubmitButton() {
		clickbyXpath(SubmitButton, " Submit Button ");
	}

	public void clickNextButton() {
		clickbyXpath(nextButton, " Next Button ");
	}

	public void enterMCQQuestion(String Answer) {
		entervaluebyXpath(mcqOption1, " Enter MCQ Question ", Answer);
	}

	public void clickOverAllSubmitButton() {
		clickbyXpath(overAllSubmitButton, " Over All Submit Button ");
	}
	
	public void clickPopUpSubmitButton() {
		clickbyXpath(popUpSubmitButton, " Pop up Submit Button ");
	}
	
	public void clickPopUpCheckBox() {
		clickbyXpath(popUpCheckbox, " Popup Check box ");
	}
	
	public void clickOkayButton() {
		clickbyXpath(okayButton, " Okay Button ");
	}
	
	public void VerifyPercentage(String Percentage) {
		verifyTextContainsByXpath(checkPercentage,Percentage," The Score Percentage ");
	}
	
	
}
