package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AssessmentPage extends GenericWrappers {
	
	 private WebDriver driver;
	 
		@FindBy(xpath = "// input[contains(@class,'Assessment_answerInput')]")
		private WebElement assessementInputBox;		

		@FindBy(xpath = "//div[text()='Over All Submit']")
		private WebElement overAllSubmitButton;
		
		@FindBy(xpath = "//div[text()='Submit']")
		private WebElement submitButton;
		
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement checkBox;
		
		@FindBy(xpath = "//div[contains(@class,'ModalComponent_submit_button_Text')]")
		private WebElement answerSubmitButton;
		
		@FindBy(xpath = "//div[contains(@class,'ScoreCardModal_modalButton_Text')]")
		private WebElement okButton;
		
		@FindBy(xpath = "//div[contains(@class,'ScoreCardModal_percentage')]")
		private WebElement percentageField;
		
		@FindBy(xpath = "//h2[contains(@class,'ScoreCardModal_resultTitle')]")
		private WebElement resultField;
		
		public WebElement getAnswerField(String option) {
	        String xpath = String.format("(//div[contains(@class,'Assessment_optionKey')])["+option+"]");
	        return driver.findElement(By.xpath(xpath));
	    }
		
		public AssessmentPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void enterAssessmentInput(String ans) {
			enterValuebyXpath(assessementInputBox," Assessment Answer Input ", ans);
		}
		
		public void enterMcqOption(String ans) {
			scrollToElement(getAnswerField(ans));
			clickbyXpath(getAnswerField(ans)," Assessment Answer Input ");
		}
		
		
		public void clickSubmitButton() {
			scrollToElement(submitButton);
			clickbyXpath(submitButton, " Submit Button ");
			
		}
		
		public void clickoverAllSubmitButton() {
			scrollToElement(overAllSubmitButton);
			clickbyXpath(overAllSubmitButton, " Over All Submit Button ");
			
		}
		
		public void clickCheckBox() {
			clickbyXpath(checkBox, " Review Checkbox ");
			
		}
		
		public void clickAnswerSubmitButton() {
			clickbyXpath(answerSubmitButton, " Review Checkbox ");
			
		}
		
		public void clickOkButton() {
			clickbyXpath(okButton, " Ok Button ");
			
		}
		
		public void checkpercentage(String percentage) {
			verifyTextContainsByXpath(percentageField, percentage);
			
		}
		
		public void checkResult(String result) {
			verifyTextContainsByXpath(resultField, result);
			
		}
		
		public void clickMCQSubmitButton() {
			scrollToElement(submitButton);
			clickbyXpath(submitButton, " Submit Button ");
			
		}
		
		
		
		
		
	 

}
