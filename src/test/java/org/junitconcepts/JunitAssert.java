package org.junitconcepts;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAssert extends BaseClass {

	@BeforeClass

	public static void browserLaunch() {
		launchChrome();
		winMax();

	}

	@Before

	public void startTime() {
		loadUrl("https://www.facebook.com");
		Date d = new Date();
		System.out.println(d);

	}

	@After
	public void endTime() {
		System.out.println(new Date());

	}

	@AfterClass

	public static void browserClose() {
		closeChrome();

	}

	// invalid user name and invalid password

	@Test

	public void tc1() throws IOException, InterruptedException {
		String title = driver.getTitle();

		Assert.assertTrue("Verify the title", title.contains("gmail"));
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(2, 3));
		fill(l.getTxtPass(), getData(4, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
	}

	// valid username and invalid password
	@Test

	public void tc2() throws IOException {

		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(1, 2));
		fill(l.getTxtPass(), getData(2, 3));
		btnClick(l.getBtnLogin());

	}
	// valid username and valid password

	@Test

	public void tc3() throws IOException, InterruptedException {
		String expect = "https://www.facebook.com";

		String title = driver.getTitle();
		String actual = driver.getCurrentUrl();
		Assert.assertTrue("Verify the title", title.contains("Facebook"));
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtUser(), getData(1, 2));
		Assert.assertEquals("Verify the Url", expect, actual);  //assertequals string arg 1,2, 3
		fill(l.getTxtPass(), getData(2, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);

	}

}
