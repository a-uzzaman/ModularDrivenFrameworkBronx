package TestScript;

import org.testng.annotations.Test;

public class dependsOnTests {
	// Sometimes, you may need to invoke methods in a Test case in a particular order 
		// or you want to share some data and state between methods. 
		// This kind of dependency is supported by TestNG as it supports the declaration of explicit dependencies between test methods.

		@Test
		public void OpenBrowser() {
			System.out.println("This will execute first (Open Browser)");
		}

		@Test (dependsOnMethods = { "OpenBrowser" })
		public void SignIn() {
			System.out.println("This will execute second (SignIn)");
		}

		@Test (dependsOnMethods = { "SignIn" })
		public void LogOut() {
			System.out.println("This will execute third (Log Out)");
		}
}
