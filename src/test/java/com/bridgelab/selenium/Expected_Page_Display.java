package com.bridgelab.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expected_Page_Display {
	@Test
	public void expectedPage ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    String expectedTitle = "Facebook";
	    String actualTitle = driver.getTitle();
	    if(actualTitle.contains(expectedTitle)) {
	    	System.out.println("Expected page is displayed");
	    }
	    else {
	    	System.out.println("expected page is not displayed");
	    }

}

}
