package org.Testngconcepts;

import org.testng.annotations.DataProvider;

public class User2 {
	@DataProvider(name = "login")
	private Object[][] dhoni() {
		return new Object[][] {

				{ "sql", "sql@123" },
				{ "java", "java@123" },

				{ "oracle", "oracle@123" },
				{ "python", "python@123" },
				};

	}
}
