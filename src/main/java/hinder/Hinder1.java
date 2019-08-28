package hinder;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Hinder1 {
	static
	{
	  System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	 }
	WebDriver driver;
	 @Test
	 public void run()
	 {
		 	driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			System.out.println("hello");
			

	 }
	 @Test
	 public void hello()
	 {
		 driver=new ChromeDriver();
		 //1.create the HTMl Report
		 ExtentHtmlReporter report=new ExtentHtmlReporter(new File("C:\\Users\\DHANASEKHAR REDDY\\Desktop\\qsp\\ExtentReport.html"));
		//create the object of extentReport Class
		 ExtentReports extent =new ExtentReports();
		 extent.attachReporter(report);
		 // 3.start the test
		 ExtentTest test=extent.createTest("ExtentDemoTest");
		 driver.get("https://www.seleniumhq.org/");
		 String title=driver.getTitle();
		 if(title.equalsIgnoreCase("Selenium - we"))
		 {
			 test.log(Status.PASS, "the title is verified");
			 
		 }
		 else
		 {
			 test.log(Status.FAIL, "the title did not match");
			 
		 }
			 
		 
		 
		 
	 }

}
