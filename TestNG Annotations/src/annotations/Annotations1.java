package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {

	@BeforeSuite // This will run once before executing all the other testcases in the entire
					// suite. This is the first to execute
	public void beforesuite() {
		System.out.println("beforesuite test case");
	}

	@BeforeClass // This will run once before executing all the other testcases in the class
					// level which means for this particular class
	public void beforeclass() {
		System.out.println("beforeclass test case");
	}

	@BeforeTest // This will run once before executing all the other testcases (methods) marked
				// as @test in the test folder including all the classes in a test folder
	// This is xml file level
	public void beforetest() {
		System.out.println("beforetest test case");
	}

	@BeforeMethod // This will run once before executing every testcases (methods) marked
					// as @test in the current class. If 4 test methods are inside the class, it
					// will run four times before it will execute test method
					// This is class level
	public void beforemethod() {
		System.out.println("beforemethod test case");
	}

	@Test // method marked as @test will be considered as a test case in testng
	public void firsttest() {
		System.out.println("First test case");
	}

	@Test
	public void secondtest() {
		System.out.println("Second test case");
	}

	@Test
	public void thirdtest() {
		System.out.println("third test case");
	}

	@AfterTest // This will run once after executing all the other methods marked as @test in
				// the particular test folder
	public void aftertest() {
		System.out.println("Aftertest test case");
	}

	@AfterSuite // This will run once after executing all the other testcases in the entire
				// suite. This is the first to execute
	public void aftersuite() {
		System.out.println("aftersuite test case");
	}

	@AfterClass // This will run once after executing all the other testcases in the class
				// level which means for this particular class
	public void Afterclass() {
		System.out.println("Afterclass test case");
	}

	@AfterMethod // This will run once after executing every testcases (methods) marked
	// as @test in the current class. If 4 test methods are inside the class, it
	// will run four times after it will execute test method
	// This is class level
	public void Aftermethod() {
		System.out.println("Aftermethod test case");
	}
}
