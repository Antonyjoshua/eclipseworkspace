package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {

	@BeforeTest
	public void beforetest3() {
		System.out.println("beforetest3 from class 3");
	}

	@BeforeClass // This will run once before executing all the other testcases in the class
	// level which means for this particular class
	public void beforeclass3() {
		System.out.println("beforeclass3 test case");
	}

	@Test
	public void firsttest3() {
		System.out.println("First test case from third class");
	}
	@AfterTest // method marked as @test will be considered as a test case in testng
	public void aftertest3() {
		System.out.println("aftertest3 from from third class");
	}
}
