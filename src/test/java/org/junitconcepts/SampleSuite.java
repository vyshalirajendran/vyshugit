package org.junitconcepts;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SampleSuite { // Suite level Execution // Runner class acts as a main method

	@Test
	public void tc3() {
		System.out.println("test 3");

	}

	@Ignore
	@Test
	public void tc2() {
		System.out.println("test 2");

	}

	@Test

	public void tc1() {
		Assert.assertTrue(false);
		System.out.println("test 1");

	}

}
