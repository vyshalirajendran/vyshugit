package org.water;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassWater {

	public static WebDriver driver;
	public static Robot r;
	public static Alert alert;
	public static Actions act;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait w;

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
		System.out.println(driver.getTitle());
	}

	// 5.Current url

	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	// 6. sendkeys
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

	// 8.quit the window

	private void windowQuit() {
		driver.quit();
	}
	// 9. to accept cookies

	public static void acceptCookies(WebElement cookies) {
		cookies.click();
	}

	// 10. to get the text

	public static void getText(WebElement textvalue) {
		textvalue.getText();
		System.out.println(textvalue);
	}

	// 11.wait time implicit wait

	public static void WaitTimeOut(int value) {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	// 12. to press enter button

	public static void buttonEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 13.to the press the tab button key

	public static void tabButton() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	// 14. to enter capslock

	public static void capsLock() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

	}

	// 15. to enter cancel button

	public static void enterCancel() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CANCEL);
		r.keyRelease(KeyEvent.VK_CANCEL);

	}

	// 16. to cleartext the

	public static void clearText() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CLEAR);
		r.keyRelease(KeyEvent.VK_CLEAR);

	}

	// 17.to press ctrl +c

	public static void CopyC() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	// 18.to press ctrl+v

	public static void pasteV() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	// 19. Press down

	public static void downBtn() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	// 20. Press Ctrl+A

	public static void ControlA() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	// 21. switch to alert

	public static void switchAlert() {

		alert = driver.switchTo().alert();

	}

	// 22. Accept the alert

	public static void acceptAlert() {
		alert.accept();

	}

	// 23.cancel the Alert .. dismiss

	public static void cancelAlert() {
		alert.dismiss();

	}

	// 24.sendkeys to alert

	public static void fillAlert(String value) {
		alert.sendKeys(value);

	}

	// 25.Print the alert

	public static void printAlert() {
		System.out.println(alert.getText());

	}

	// 26.move to Element

	public static void moveToElement(WebElement ele) {

		act = new Actions(driver);
		act.moveToElement(ele).perform();

	}

	// 27. drag and drop

	public static void dragDrop(WebElement src, WebElement des) {
		act = new Actions(driver);
		act.dragAndDrop(src, des).perform();

	}

	// 28. Double click

	public static void dobleClick(WebElement ele) {
		act = new Actions(driver);
		act.doubleClick(ele).perform();

	}

	// 29.context click(right click)

	public static void contextClick(WebElement ele) {

		act = new Actions(driver);
		act.contextClick(ele).perform();

	}

	// 30.Shift button using actions

	public static void pressShift(WebElement ele, String value) {

		act = new Actions(driver);
		act.keyDown(Keys.SHIFT).perform();
		act.sendKeys(ele, value);
		act.keyUp(Keys.SHIFT).perform();

	}
	// 31. screenshot taking

	public static void screenShot() throws IOException {
		tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File(
				"C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\src\\test\\java\\org\\water\\BaseClassWater.java\\waterstones.png");

		FileUtils.copyFile(src, des);

	}

	// 32.sending values through java scriptexecutor

	public static void jsSetattribute(String valuess, WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value'," + valuess + ")", ele);

	}

	// 33.getting attribute in java script executor

	public static void jsGetattribute(WebElement ele) {
		js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", ele);

		// 34.converting object to string

		String str = (String) obj;
		System.out.println(str);

	}

	// 35.java script click
	public static void jsClick(WebElement ele) {
		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click", ele);

	}

	// 36.To Scroll down

	public static void scrollDown(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("aruguments[0].scrollIntoViwe(true)", ele);

	}

	// 37. to scroll up
	public static void scrollUp(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("aruguments[0].scrollIntoViwe(false)", ele);

	}

	// 38.Select by value

	public static void selectValue(WebElement ele, String value) {

		s = new Select(ele);
		s.selectByValue(value);

	}

	// 39.select by visible text

	public static void visibleText(WebElement ele, String value) {

		s = new Select(ele);
		s.selectByVisibleText(value);

	}

	// 40 Select by index

	public static void selectIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);

	}

	// 41. Select is multiple(to check multiple options )

	public static void SelectMultiple(WebElement ele) {
		s = new Select(ele);
		// boolean multiple = s.isMultiple();
		System.out.println(s.isMultiple());

	}

	// 42.get all options in dropdown

	public static void getAllOptions(WebElement ele) {

		s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ops = options.get(i);
			System.out.println(ops.getText());
		}
	}

	// 43. to get all selected options

	public static void getselOption(WebElement ele) {

		s = new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ops = options.get(i);
			System.out.println("get selected all options" + ops.getText());

		}

	}

	// 44.get first selected option

	public static void getFirstSel(WebElement ele) {

		s = new Select(ele);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("first selected option:" + firstSelectedOption);
	}

	// 45.Deselect by index
	public static void deselectIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.deselectByIndex(index);
	}

	// 46.deselect by value
	public static void deselectValue(WebElement ele, String value) {
		s = new Select(ele);
		s.deselectByValue(value);
	}

	// 47.deselect by visible text

	public static void deselectVisibleText(WebElement ele, String value) {
		s = new Select(ele);
		s.deselectByVisibleText(value);
	}

	// 48.DeselectAll

	public static void deselectAll(WebElement ele) {
		s = new Select(ele);
		s.deselectAll();
	}

	// 49.switch to frame by id
	public static void frameId(String id) {
		driver.switchTo().frame(id);

	}

	// 50. switch to frame by name
	public static void frameName(String name) {
		driver.switchTo().frame(name);

	}

	// 51.switch to frame by index
	public static void frameIndex(int index) {
		driver.switchTo().frame(index);

	}

	// 52.switch into frame by webelement

	public static void frameWebEle(WebElement ele) {

		driver.switchTo().frame(ele);

	}

	// 53. switch to parent frame

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}
	// 54.switch to main frame

	private void frameMain() {
		driver.switchTo().defaultContent();

	}

	// 55. Window handling parent(title)

	public static void ParentWindow(String value) {
		driver.switchTo().window(value);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}
	// 56.window handles all window(parent and child window)title

	public static void allWind(String value) {
		driver.switchTo().window(value);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

	}

	// 57.window handling parent through id

	public static void ParentWindow1(String id) {
		driver.switchTo().window(id);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}

	// 58.window handling parent through id

	public static void ParentWindows(String id) {
		driver.switchTo().window(id);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

	}

	// 59. window handling url
	public static void Parent2Window(String url) {
		driver.switchTo().window(url);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}

	// 60. window handling url
	public static void Parent2Windows(String url) {
		driver.switchTo().window(url);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

	}

	// 61.Explicit wait

	public static void explicitWait() {

		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		alert.accept();

	}
	
	//62.Read the excel
	
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
