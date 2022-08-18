package org.Testngconcepts;

import java.io.IOException;
import java.util.Date;

import org.junitconcepts.BaseClass;
import org.junitconcepts.LoginPojo1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee2 extends BaseClass {             // using data provider we can send bulk of data and we can run the class 
	@BeforeClass
	private void browserlaunch() {
		launchChrome();
		winMax();

	}

	@AfterClass
	private void browserClose() {
		closeChrome();
	}

	@BeforeMethod
	private void startTime() {
		loadUrl("https://www.facebook.com");
		System.out.println(new Date());

	}

	@AfterMethod

	private void endTime() {
		System.out.println(new Date());

	}

	// invalid and valid
	@Test(priority = -1, enabled = false)

	public void tc1() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(2, 3));
		fill(l.getTxtPass(), getData(4, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);

	}

	// valid username and invalid password

	@Test(priority = -12, invocationCount = 10, enabled = false)

	public void tc2() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(1, 2));
		fill(l.getTxtPass(), getData(3, 2));
		btnClick(l.getBtnLogin());

	}

	// valid username and valid password
	
	@Test(dataProvider="login")
	//@Test(dataProvider="login,dataPoviderClass=User2.Class")   // if we have data in the other user2 class we have add this line

	public void tc3(String s1,String s2)
			throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), s1);
		fill(l.getTxtPass(), s2);
		btnClick(l.getBtnLogin());

	}
	
	@DataProvider(name="login")
	private Object[][] dhoni() {
		return new Object[][]{
		
		{"sql","sql@123"},
		{"java","java@123"},
		{"oracle","oracle@123"},
		{"python","python@123"},
	};
	}

	
	// invalid username and invalid password //after running and automatically( test
	// output folder will be created )

	@Test(priority = 5, enabled = false)

	public void tc4() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(2, 2));
		fill(l.getTxtPass(), getData(1, 2));
		btnClick(l.getBtnLogin());
	}

}
