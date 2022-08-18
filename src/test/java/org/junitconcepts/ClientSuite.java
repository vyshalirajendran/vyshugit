package org.junitconcepts;

import org.junit.Assert;
import org.junit.Test;
                                            //  client ,sample ,main class runnerclass assert la
public class ClientSuite {
	
	@Test
	public void tc33() {
		System.out.println("test 33");

	}
	@Test
	public void tc22() {
		System.out.println("test 22");

	}
	
	@Test
	public void tc11() {
		System.out.println("test 11");
		Assert.assertTrue("Testing", false);  // failures

	}
	

}
