package hinder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hinder1 {
	static
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 }
	 @Test
	 public void run()
	 {
		 WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");

	 }

}