package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GET_METHOD_DISPLAY {
	public void excpetedPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
         Thread.sleep(2000);
		String excepectedTitle = "facebook";
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(excepectedTitle)) {
			System.out.println("expected page is displayed");
		}
		else {
			System.out.println("excpted is not displayed");
		}
		driver.close();
	}

	@Test
	
	public void excpectedUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
 
         String expectedUrl = "facebook";
 
         String actualUrl = driver.getCurrentUrl();
 
         if (actualUrl.contains(expectedUrl)) {
 
         System.out.println("expected url is displayed");
         }      
         else{

}
         System.out.println("ecpected is NOT displayed");
    }
	@Test
public void usernamePasswordBoxAlignment() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     Thread.sleep(4000);
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.manage().window().maximize();
    System.out.println(driver.getTitle());
     Thread.sleep(2000);
     WebElement unTB = driver.findElement(By.id("email"));
   
  int email_Ycordinate = unTB.getLocation().getY();
  System.out.println(email_Ycordinate);
  WebElement pwdTB = driver.findElement(By.name("pass"));
  
  int password_Ycordinate = pwdTB.getLocation().getY();
  System.out.println(password_Ycordinate);
  
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
     Thread.sleep(2000);
     WebElement unTB = driver.findElement(By.id("email"));
  
  int email_Xcordinate = unTB.getLocation().getX();
  System.out.println(email_Xcordinate);
  WebElement pwdTB = driver.findElement(By.name("pass"));
  int password_Xcordinate = pwdTB.getLocation().getX();
  System.out.println(password_Xcordinate);
   if (email_Xcordinate==password_Xcordinate) {
 	 System.out.println("Both username and password fields are displayed in the same column");
 	 }else{
 	 System.out.println("username and password fields are NOT aligned in the same column");
 	 }
}

}
