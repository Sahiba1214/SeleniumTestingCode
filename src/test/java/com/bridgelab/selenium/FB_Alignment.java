package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB_Alignment {
	@Test
	public void usernamePasswordBoxAlignment() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        Thread.sleep(4000);
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
//	        System.out.println(driver.getTitle());
	        Thread.sleep(2000);
	        WebElement unTB = driver.findElement(By.id("email"));
	     // get the y-coordinate of email field
	     int email_Ycordinate = unTB.getLocation().getY();
	     System.out.println(email_Ycordinate);
	     WebElement pwdTB = driver.findElement(By.name("pass"));
	     // get the y-coordinate of password field
	     int password_Ycordinate = pwdTB.getLocation().getY();
	     System.out.println(password_Ycordinate);
	     //check whether the Y-coordinate of email and password field are same
	     if (email_Ycordinate==password_Ycordinate) {
	    	 System.out.println("Both email and password fields are displayed in the same row");
	    	 }else{
	    	 System.out.println("email and password fields are NOT aligned in the same row");
	    	 }

		
	}
	@Test
	public void XCoordinate() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(4000);
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
//	        System.out.println(driver.getTitle());
	        Thread.sleep(2000);
	        WebElement unTB = driver.findElement(By.id("email"));
	     // get the x-coordinate of email field
	     int email_Xcordinate = unTB.getLocation().getX();
	     System.out.println(email_Xcordinate);
	     WebElement pwdTB = driver.findElement(By.name("pass"));
	     // get the x-coordinate of password field
	     int password_Xcordinate = pwdTB.getLocation().getX();
	     System.out.println(password_Xcordinate);
	     //check whether the X-coordinate of email and password field are same
	     if (email_Xcordinate==password_Xcordinate) {
	    	 System.out.println("Both username and password fields are displayed in the same column");
	    	 }else{
	    	 System.out.println("username and password fields are NOT aligned in the same column");
	    	 }
	}

}


