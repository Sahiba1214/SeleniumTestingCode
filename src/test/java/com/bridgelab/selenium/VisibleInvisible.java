package com.bridgelab.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VisibleInvisible {
	public static WebDriver driver;

	@BeforeTest
	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void visibleLink_invisibleLink() {
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// get the total number of link elements
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page is : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		// using foreach loop, iterate through all the links
		for (WebElement link : allLinks) {
			// if the link is displayed, then print the text of the link
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + " --> " + link.getText());
			} else {
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		driver.close();

	}

	@Test
	public void webTable_Example() {
		driver.get("file:///C:/Users/HP/Desktop/practice.html");
		// Count Total number of rows present in the table
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :" + totalRows);
		// count total number of columns
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		// Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		// Print ONLY the numbers
		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.println("Number is:" + number);
				countNumberValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		System.out.println("Total count of numeric values is :" + countNumberValue);
		System.out.println("Total sum of all the numeric values is :" + sum);
		// close the browser
		driver.close();

	}

	@Test
	public void student_Marks() {
		driver.get("file:///C:/Users/HP/Desktop/practice.html");
		// Count Total number of rows present in the table
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :" + totalRows);
		// count total number of columns
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		// Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		// Print ONLY the numbers
		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.println("Number is:" + number);
				countNumberValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		System.out.println("Total count of numeric values is :" + countNumberValue);
		System.out.println("Total sum of all the numeric values is :" + sum);
		// close the browser
		driver.close();

	}

}
