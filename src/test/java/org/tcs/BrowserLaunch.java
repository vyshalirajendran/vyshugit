package org.tcs;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class BrowserLaunch extends BaseClass {

	public static void main(String[] args) {

		launchChrome();
		loadUrl("https://www.facebook.com");

		winMax();
		printTitle();

		WebElement txtUser = driver.findElement(By.id("email"));

		fill(txtUser, "greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "green@12345");

//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fill(txtPass, getData(2, 1));

		WebElement btnLogin = driver.findElement(By.name("login"));

		btnClick(btnLogin);

//		LoginPojo l = new LoginPojo();
//		WebElement txtUser = l.getTxtUser();
//
//		fill(txtUser, getData(3, 0));
//		fill(l.getTxtPass(), getData(4, 2));
//		btnClick(l.getBtnLogin());
	}

}
