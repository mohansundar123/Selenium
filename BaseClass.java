package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void urlLaunch(String url) {

         driver.get(url);		
	}
	
	public static void maxWindow() {

		driver.manage().window().maximize();
		
	}
	
	public static void pageTitle() {
 String title = driver.getTitle();
 System.out.println(title);
	}
	
	public static void pageUrl() {

		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
	}
	
	public static void closebBrowser() {

		driver.close();
		
	}
	
	public static void fillText(WebElement element,String value) {
element.sendKeys(value);
		
	}
	
	
public static void btnClick(WebElement clk) {

	clk.click();
	
}	
	
	public static void clickDouble(WebElement ele) {
   Actions a= new Actions(driver);

       a.doubleClick(ele).perform();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
