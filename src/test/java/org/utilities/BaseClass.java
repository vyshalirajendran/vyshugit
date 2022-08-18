package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1. browser launch
	public static void launchChrome() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	// 2. url

	public static void loadUrl(String url) {

		driver.get(url);
	}

	// 3 maximize

	public static void winMax() {

		driver.manage().window().maximize();

	}

	// 4. title print

	public static void printTitle() {

		String title = driver.getTitle();

		System.out.println(title);

	}

	// 5. pass the values

	public static void fill(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	// 6. click login

	public static void btnClick(WebElement ele) {

		ele.click();

	}

	// 7. close the chrome

	public static void closeChrome() {
		driver.close();

	}

}
