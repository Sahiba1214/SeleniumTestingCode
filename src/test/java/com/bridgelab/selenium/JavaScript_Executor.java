package com.bridgelab.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_Executor {
	@Test
	public void enterText_intoDisabledTextbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(4000);
	        driver.get("file:///C:/Users/HP/Desktop/text.html");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	      //Typecast the driver object to JavascriptExecutor interface type
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        Thread.sleep(2000);
	        //enter "admit" in first textbooks using javascript
	        js.executeScript("document.getElementById('t1').value='sahiba'");
	        Thread.sleep(2000);
	      //enter "admin" in first textbox using javascript
	        js.executeScript("document.getElementById('t1').value='sahiba'");
	        Thread.sleep(2000);
	        //clear the value in second textbox using javascript
	        js.executeScript("document.getElementById('t2').value=''");
	        //enter "manager" in second textbox using javascript
	        js.executeScript("document.getElementById('t2').value='manager'");
	        //change the second text box to button type using Javascript
	        js.executeScript("document.getElementById('t2').type='button'");
	        driver.close();


	}
	@Test
	public void scrollUpandDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.get("http://seleniumhq.org/download");

        Thread.sleep(2000);
        driver.manage().window().maximize();
      //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
        //scroll down on the webpage
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
        //scroll up on the webpage
        js.executeScript("window.scrollBy(0, -1000)");
        Thread.sleep(3000);

        }
	}
}


