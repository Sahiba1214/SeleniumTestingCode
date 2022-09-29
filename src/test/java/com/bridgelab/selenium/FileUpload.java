package com.bridgelab.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	
		public static WebDriver driver;
		@BeforeTest
		public void launchrowser(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
			
	}
		@Test
		public void autoIt_UploadFile() throws InterruptedException, IOException {
			driver.get("https://www.freepdfconvert.com/pdf-to-word");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Choose PDF file")).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\HP\\Documents\\fileupload.exe");
		}
		@Test
		public void file_Upload() throws InterruptedException {
			driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\HP\\Documents\\Sahiba.Resume.pdf");
		Thread.sleep(2000);
		
	}

}
