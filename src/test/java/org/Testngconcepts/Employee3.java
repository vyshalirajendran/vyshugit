package org.Testngconcepts;

import org.testng.annotations.Test;

public class Employee3 {
	                              // grouping  Employee 3 and user 3   press ctrl two classes and run as convert to testng
	                             // create th egrouping xml make changes in that file and run the groupinf xml .file
	                             // include  or we can exclude in the grouping file
	
	                          
	
	@Test(groups="sanity")
	private void tc33() {
		System.out.println("test33");

	}
	
	@Test(groups="sanity")
	private void tc22() {
		System.out.println("test22");

	}
	
	@Test(groups="regression")
	private void tc11() {
		System.out.println("test11");

	}
	

}
