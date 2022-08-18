package org.Testngconcepts;

import org.testng.annotations.Test;

public class User3 {
	
	@Test(groups="sanity")
	private void tc3() {
		System.out.println("test3");

	}
	
	@Test(groups= {"sanity,regression"})   // and operator
	private void tc2() {
		System.out.println("test2");

	}
	
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("test1");

	}

}
