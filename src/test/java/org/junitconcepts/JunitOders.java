package org.junitconcepts;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;  // add the dependency hamcrest all 1.3 and  junit 4.12
import org.junit.Ignore;
import org.junit.Test;

public class JunitOders extends BaseClass{

	@BeforeClass

	public static void browserlaunch() {

		System.out.println("chrome");

	}

	@AfterClass

	public static void CloseBrowser() {
		System.out.println("close");

	}

	@Before

	public void startTime() {

		System.out.println("Start");
	}

	@After

	public void endTime() {
		System.out.println("end");

	}

	@Test
	public void tc1() {
		System.out.println("test1");

	}
    @Ignore          // if we want we can skip the test case using ignore case 
	@Test
	public void tc3() {
		System.out.println("test3");

	}

	@Test
	public void tc2() {
		System.out.println("test2");

	}
	@Test

	public void tc4() throws IOException, InterruptedException {
		LoginPojo1 l = new LoginPojo1();

		fill(l.getTxtUser(), getData(2, 3));
		
		fill(l.getTxtPass(),getData(4, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
		System.out.println("success");

	}

}
