package org.Testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee4 { // employee 4 and user 4 parallel execution using method and class
	WebDriver driver;

	@Parameters({ "browser" })
	@Test // used employee class for using parallel test
	private void tc1(String name) {

		if (name.equals("chrome")) {
			System.out.println("Launch Chrome");
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();

		}

		else if (name.equals("ff")) {
			System.out.println("Launch FireFox");
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();

		}

		else {
			System.out.println("Launch Edge");
			WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();

		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.id("pass")).sendKeys("greens@12345");
		

	}
}
