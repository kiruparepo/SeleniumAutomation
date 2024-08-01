package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import wrappers.WebApplicationWrappers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


public class Reporter extends WebApplicationWrappers {
	
	private static ExtentTest test;
	private static ExtentReports extent;
	private static ExtentSparkReporter htmlReporter;

	public static void reportStep(String desc, String tcstatus) {

		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
        try {
        	TakesScreenshot ts = (TakesScreenshot) driver;
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		// Write if it is successful or failure or information
		if(tcstatus.toUpperCase().equals("PASS")){
			test.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../reports/images/"+number+".jpg").build());
		}else if(tcstatus.toUpperCase().equals("FAIL")){
			test.fail(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../reports/images/"+number+".jpg").build());
			throw new RuntimeException("FAILED");
		}else if(tcstatus.toUpperCase().equals("INFO")){
			test.log(Status.INFO, desc);
		}
	}

	
	public static void startResult(){
		htmlReporter = new ExtentSparkReporter("./reports/Spark.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	public static void startTestCase(){
		test = extent.createTest(testCaseName, testDescription);
	}

	public static void endResult(){
		extent.flush();
	}


}
