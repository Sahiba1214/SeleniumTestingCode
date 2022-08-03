package com.bridgelab.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Takes_Screenshot {
	@Test
	public void screenshot() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		driver1.findElement(By.name("email")).sendKeys("Shahiba");
		TakesScreenshot ts = (TakesScreenshot) driver1;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		//File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/"+"facebook"+".png");
		
		//File destFile = new File("./Screenshot"+"facebook"+".png");
       //FileUtils.copyFile(srcFile, destFile);
		FileHandler.copy(srcFile, destFile);
		
		
		
	}
	
}
