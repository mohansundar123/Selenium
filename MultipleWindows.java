package org.com;

import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindows extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		urlLaunch("https://www.amazon.in/");
		pageTitle();
		maxWindow();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);

		Set<String> multipleWindowID = driver.getWindowHandles();
		System.out.println(multipleWindowID);
		
		for (String eachID : multipleWindowID) {
			if (!eachID.equals(windowID)) {
				driver.switchTo().window(eachID);
			}
		}

		driver.findElement(By.id("add-to-cart-button")).click();		
	}
}
