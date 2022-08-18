package org.Testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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

public class EmployeGrouping extends BaseClass {

	                               
	@BeforeClass(alwaysRun=true)
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
	@Test(groups="sanity")

	public void tc1() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(2, 3));
		fill(l.getTxtPass(), getData(4, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);

	}

	// valid username and invalid password

	@Test(groups="regression")

	public void tc2() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(1, 2));
		fill(l.getTxtPass(), getData(3, 2));
		btnClick(l.getBtnLogin());

	}
	// valid username and valid password
	
		@Test(groups="smoke")

		public void tc3() throws IOException, InterruptedException {
			LoginPojo1 l = new LoginPojo1();
			fill(l.getTxtUser(), getData(1, 1));
			fill(l.getTxtPass(),getData(3, 1));
			btnClick(l.getBtnLogin());

		}
		// invalid username and invalid password   
		
		@Test(groups="smoke")

		public void tc4() throws IOException, InterruptedException {
			LoginPojo1 l = new LoginPojo1();
			fill(l.getTxtUser(), getData(2, 2));
			fill(l.getTxtPass(),getData(1, 2));
			btnClick(l.getBtnLogin());
		}

}
