package org.water;

import org.junitconcepts.LoginPojo1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WaterStonesLaunch extends BaseClassWater {

	public static void main(String[] args) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		launchChrome();

		winMax();

		loadUrl("https://www.waterstones.com/");

		Thread.sleep(4000);

		WebElement cookies = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));

		acceptCookies(cookies);

		WebElement btnClick = driver.findElement(By.xpath("//li[@class='nav-account']"));
		btnClick.click();
		
		LoginPojo1 l = new LoginPojo1();
		WebElement txtUser = l.getTxtUser();
		
		

	}

}
