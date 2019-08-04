package TestScript;

import org.testng.annotations.Test;

public class groupingTests {

	@Test (groups = { "talentTEK" })
	public void talentTEK1() {
		System.out.println("talentTEK - TEST CASE 1");
	}

	@Test (groups = { "talentTEK" })
	public void talentTEK2() {
		System.out.println("talentTEK - test case 2");
	}

	@Test (groups = { "Consulting" })
	public void Consulting1() {
		System.out.println("Batch Consulting - Test Consulting 1");
	}

	@Test (groups = { "Consulting" })
	public void Consulting2() {
		System.out.println("Batch Consulting - Test Consulting 2");
	}

	@Test (groups = { "talentTEK", "Consulting" })
	public void talentTEK_Consulting() {
		System.out.println("Run both talentTEK and Consulting");
	}

	
	
}
