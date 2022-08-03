package com.bridgelab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Element_interface {
	@Test
	public void enterThefocusedElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");	
     WebDriver driver = new ChromeDriver();
     Thread.sleep(4000);
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.manage().window().maximize();
   //entering text into the focussed element
     driver.switchTo().activeElement().sendKeys("sahiba");

	}
     @Test
	public void removeValuefromText_usingClearMethod() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         Thread.sleep(4000);
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         driver.findElement(By.id("email")).sendKeys("sahiba1214@gmai.com");
         Thread.sleep(2000);
         String value = driver.findElement(By.id("email")).getAttribute("value");
         System.out.println("Value present inside the text box is : "+value);
         driver.findElement(By.id("email")).clear();
         Thread.sleep(2000);
         driver.findElement(By.id("email")).sendKeys("sahiba1214@gmai.com");
         Thread.sleep(2000);
          
         driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); 
//         this line will actually delete the value if there is no space in the text entered
         // if there is a space between two words in the email field, we have to use the below lines of 
//        code
         driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a") ;
         driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a") ;
         driver.findElement(By.id("email")).sendKeys(Keys.DELETE); 
         Thread.sleep(2000);


		
	}
     @Test
     public void printTooltip_Facebook_RememberCheckbox() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         Thread.sleep(4000);
         driver.get("http://localhost:8080/login.do");

         Thread.sleep(2000);
         driver.manage().window().maximize();
       //find the Keep me Logged in Checkbox
         WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
         //get the tooltip text using getAttribute() method and store in a variable
         String tooltipText = Checkbox.getAttribute("title");
         System.out.println(tooltipText);
         driver.close();

    	 
     }
     @Test
     public void CheckBox_selectedorNot() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         Thread.sleep(4000);
         driver.get("http://localhost:8080/login.do");

         Thread.sleep(2000);
         driver.manage().window().maximize();
         WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("remember"));
       //select the checkbox
       KeepMeLogIN_Checkbox.click();
//       Using the isSelected() method, it checks whether the checkbox is selected or 
//       not : if it is already selected, it return true and if not selected, then it returns 
//       false/
       if (KeepMeLogIN_Checkbox.isSelected()) {
       System.out.println("Checkbox is selected");
       }else{
       System.out.println("Checkbox is NOT selected");
       }
     }
     @Test
     public void VerifyUNtextboxisEnabledFB() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         Thread.sleep(4000);
         driver.get("https://www.facebook.com/");
         WebElement UN = driver.findElement(By.id("email"));
         if (UN.isEnabled()) {
         System.out.println("Email text box is enabled");
         }else {
         System.out.println("Email text box is disabled");
         }
         driver.close();

     } 
    	 
     }