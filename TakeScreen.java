package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen extends BaseClass {
	
			public static void main(String[] args) throws IOException {

			launchBrowser();
			
			driver.get("https://www.facebook.com/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			driver.manage().window().maximize();
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			
			File destination =new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenTest\\screenshot\\facebook.png");
			
			FileUtils.copyFile(screenshot, destination);
			
	
	
			}
}
