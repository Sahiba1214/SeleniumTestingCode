package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class gmail_Context {
	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		// enter email id
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sahiba1214@gmail.com");
		// click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		// enter password id
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sahiba1214");
		// click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);

		String xp = "(//div[contains(@role,'checkbox')])[2]";
		
        WebElement mail = driver.findElement(By.xpath(xp));

        System.out.println(mail.getText());

	    Actions actions = new Actions(driver);

		actions.contextClick(mail).perform();
		Thread.sleep(6000);

		
	}
}	
		
	   
