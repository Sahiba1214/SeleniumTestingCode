package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateSignup_Xpath {
	@Test
	public void facebook_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sahiba");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Fatma");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sahiba1214@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sahiba1214@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sahiba123");
		Thread.sleep(2000);
		WebElement dateElement= driver1.findElement(By.xpath("//*[@id='day']"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.xpath("//*[@id='month']"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(2000);
		
		
		Select dateDropdown = new Select(dateElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dateDropdown.selectByVisibleText("16");
		monthDropdown.selectByVisibleText("Oct");
		yearDropdown.selectByVisibleText("1998");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		//driver1.close();
	}
	

}



