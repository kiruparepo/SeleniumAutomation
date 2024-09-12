package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class AllCoursePage extends GenericWrappers {

		private WebDriver driver;

		// Locate all elements on the page
		@FindBy(xpath = "//div[contains(@class,'All_Courses_sort_Dropdown_View')]")
		private WebElement selectSubjectdropdown;
		
		 public WebElement selectCourse(int coursenum)
		    {
		    	return driver.findElement(By.xpath("(//div[contains(@class,'All_Courses_exploreButton_Text')])["+coursenum+"]"));
		    }
		
		/*
		 * @FindBy(xpath =
		 * "//div[contains(@class,'All_Courses_sort_Dropdown_View')]/div/div[2]")
		 * private WebElement chooseSubject;
		 */
		
		
		 public AllCoursePage(WebDriver driver) {
		        this.driver=driver;
		        PageFactory.initElements(driver, this);
		    }
		    
		    // Methods to interact with elements
		    public void clickAllSubjectDropdown() {
		    	
		    	clickbyXpath(selectSubjectdropdown," Select your subject Dropdown ");
		    	
		    }
		    
			public void clickCourse(int coursenum) {

				clickbyXpath(selectCourse(coursenum), " Select course");

			}
		    
		    
		    public void selectSubject(String subject) throws InterruptedException {
		    	
				List<WebElement> elements= driver.findElements(By.xpath("//div[contains(@class,'All_Courses_sort_Dropdown_View')]/div/div[2]/div/div")); 
				for (WebElement element : elements) {
				  String attributeValue = element.getText(); 
				  if (attributeValue.equals(subject)) {
					  clickbyXpath(element," Subject field "+subject+" ");
					  break; 
				  } 
		    	   	
				}
		
		    }
}
