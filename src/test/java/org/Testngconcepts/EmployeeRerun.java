package org.Testngconcepts;
                                    //method 1  employeererun and userrerun
import org.testng.Assert;
import org.testng.annotations.Test;  // rerun failed test cases  using method 1 and refresh the framework project 
                                    //u will see a testng-failed.xml in the test output folder

public class EmployeeRerun {

	@Test

	private void tc33() {
		System.out.println("test33");

	}
@Test
	private void tc22() {
		Assert.assertTrue(false,"please verify tc22");
		System.out.println("test22");

	}
@Test
	private void tc11() {
		System.out.println("test11");

	}
}
