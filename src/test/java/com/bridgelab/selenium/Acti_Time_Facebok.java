package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Acti_Time_Facebok {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:////Users////ac////Downloads///ActiTime");
		Thread.sleep(2000);
	driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("Sahiba");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("sahiba1214");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}

}
