package org.junitconcepts;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.utilities.LoginPojo;

import bsh.classpath.BshClassPath.GeneratedClassSource;

public class BrowserLaunch extends BaseClass {

	public static void main(String[] args) throws IOException {

		launchChrome();
		loadUrl("https://www.facebook.com");

		winMax();
		printTitle();
		WebElement findElement = driver.findElement(By.id("email"));
		
		btnClick(findElement);
		
		LoginPojo1 l = new LoginPojo1();
		WebElement txtUser = l.getTxtUser();
		fill(l.getTxtUser(),getData(2,4));
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "green@12345");

		// WebElement txtPass = driver.findElement(By.id("pass"));
		// fill(txtPass, getData(2, 1));

		WebElement btnLogin = driver.findElement(By.name("login"));

		btnClick(btnLogin);
}
}
