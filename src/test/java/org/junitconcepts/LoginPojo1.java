package org.junitconcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo1 extends BaseClass {

	// 1. Non para Constructor

	public LoginPojo1() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);

	}

	 @FindBy(id = "email")
	 private WebElement txtUser;
	
	 @FindBy(id="pass")
	 private WebElement txtPass;
	
	 @FindBy(xpath = "//button[@name='login']")
	 // before closing } here generate getters and setters
	 private WebElement btnLogin;
	
	 public WebElement getTxtUser() {
	 return txtUser;
	 }
	
	 public WebElement getTxtPass() {
	 return txtPass;
	 }
	
	 public WebElement getBtnLogin() {
	 return btnLogin;
	 }
	// AND OPERATOR

//	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']") })
//	private WebElement txtUser;
//
//	// OR operator
//	@FindBys({ @FindBy(id = "tennis"), @FindBy(xpath = "//input[@type='password']") })
//	private WebElement txtPass;
//
//	@FindBy(xpath = "//button[@name='login']")
//	// before closing } here generate getters and setters
//	private WebElement btnLogin;
//
//	public WebElement getTxtUser() {
//		return txtUser;
//	}
//
//	public WebElement getTxtPass() {
//		return txtPass;
//	}
//
//	public WebElement getBtnLogin() {
//		return btnLogin;
//	}

}
