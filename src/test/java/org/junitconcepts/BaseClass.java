package org.junitconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
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

	public static void vyshu() {
		// TODO Auto-generated method stub

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

	// 8 Read the Excel
	public static String getData(int rowno, int cellno) throws IOException {
		// 1. file path == excel sheet
		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2. read the excel sheet

		FileInputStream fi = new FileInputStream(f);

		// 3.file format workbook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("number");

		// to get row

		Row row = sheet.getRow(rowno);

		// 5.to get a cell

		Cell cell = row.getCell(cellno);

		int cellType = cell.getCellType();

		String value = "";

		if (cellType == 1) {

			value = cell.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(cell)) {

			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
			value = sim.format(d);

		} else {
			double d = cell.getNumericCellValue();// 7.876547

			// newDataType ref=(newDataType)oldvariable;// syntax

			long l = (long) d;// downcasting

			value = String.valueOf(l);

		}
		return value;

	}

}
