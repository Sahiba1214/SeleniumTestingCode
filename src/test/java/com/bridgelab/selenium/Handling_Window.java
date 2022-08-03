package com.bridgelab.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_Window {
	public static WebDriver driver;
	@BeforeTest
	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();	        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
	}
	@Test
	public void switching_Window() {
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getWindowHandle();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.close();

		
	}
	@Test
	public void close_Parent_Window() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentId=driver.getWindowHandle();
		System.out.println("ParentId" +parentId );
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[normalize-space()='Register now']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		int count=allWindow.size();
		System.out.println("Number of window open by selenium:" +count);
		for(String windowHandle: allWindow) {
			driver.switchTo().window(windowHandle);
			if(windowHandle.equals(parentId)) {
				driver.close();
			}
		}
		
		
		
	}
	@Test
	public void closeAllChildWindow() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentId=driver.getWindowHandle();
//		System.out.println("ParentId" +parentId );
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[normalize-space()='Register now']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		int count=allWindow.size();
//		System.out.println("Number of window open by selenium:" +count);
		for(String windowHandle: allWindow) {
			driver.switchTo().window(windowHandle);
			if(!windowHandle.equals(parentId)) {
				driver.close();
			}
		}
		
	}
	@Test
	public void close_All_Window() {
		driver.get("https://www.naukri.com/");
		//using getWindowHandles(), get a set of window handle IDs
		Set<String> allWindowHandles = driver.getWindowHandles();
		//using size(), get the count of total number of browser windows
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
//		driver.findElement(By.xpath("//a[normalize-space()='Register now']")).click();
		for (String windowHandle : allWindowHandles) {
		//switch to each browser window
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		//print the window handle id of each browser window
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		//close all the browsers one by one
		driver.close();
		}

		
	}
	@Test
	public void close_Any_Specific_Window() {
		driver.get("https://www.naukri.com/");
		//Set the expected title of the browser window which you want to close
		String expected_title = "It jobs";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		//switch to each browser window
		driver.switchTo().window(windowHandle);
		String actual_title = driver.getTitle();
		//Checks whether the actual title contains the specified expected title
		if (actual_title.contains(expected_title)) {
		driver.close();
		System.out.println("Specified Browser window with title -->"+ actual_title +" --> is closed");
		
		   }
		}  
		
	}
	@Test
	public void handleTabs_using_getWindowHandles() {
		//enter orangehrm login url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//get the window handle id of the parent browser window
		String parentwindowHandle = driver.getWindowHandle();
		//enter username
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Sahiba");
		//enter password
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Fatma");
		//click on orange hrm INC link
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//get the number of windows currently opened on the system 
		Set<String> allwhs = driver.getWindowHandles();
		//switch to all the browser windows
		for (String wh : allwhs) {
		driver.switchTo().window(wh);
		//get the title of the tab
		String childtitle = driver.getTitle();
		System.out.println("Title of the child tab is :"+ childtitle);
		//close the child tab
//		driver.close();
		//switch back to the main browser window
		driver.switchTo().window(parentwindowHandle);
		//close the main browser window
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//closing the parent window
		driver.close();

		}

}
}