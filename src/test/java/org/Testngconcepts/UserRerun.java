package org.Testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

                                                           //  Method 2 automatically-we must know whic test cases will be failed
                                                           // only we use one class i.e userrerun class and (create another class named)failed 
public class UserRerun {
                                                          // run the rerun xml file
	@Test

	private void tc3() {
		System.out.println("test3");

	}

	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
		Assert.assertTrue(false, "please verify tc2");
		System.out.println("test2");

	}

	@Test
	private void tc1() {
		System.out.println("test1");

	}

	@Test
	private void tc5() {
		Assert.assertTrue(false, "please verify tc5");
		System.out.println("tc5");

	}

	@Test
	private void tc4() {
		System.out.println("test4");

	}

}
