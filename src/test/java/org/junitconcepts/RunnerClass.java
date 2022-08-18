package org.junitconcepts;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)    // method 1
//@SuiteClasses({SampleSuite.class,ClientSuite.class})// method 1

public class RunnerClass {
	
	                        // method 2 
	@Test
	public void tc10() {
		Result rs = JUnitCore.runClasses(SampleSuite.class,ClientSuite.class);
		
		System.out.println("My Run Count is:"+rs.getRunCount());
		
		System.out.println("My Failure Count is"+rs.getFailureCount());
		
		System.out.println("My Ignore Count is"+rs.getIgnoreCount());
		
		List<Failure> fail = rs.getFailures();
		for (Failure x : fail) {
			
			System.out.println(x);
			
		}

	}

}
