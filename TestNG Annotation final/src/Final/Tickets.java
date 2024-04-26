package Final;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tickets {
	@BeforeClass
	public void thirdclass()
	{
		System.out.println("3 Beforeclass-this will run in each class before the first method of the current class");
	}
	@BeforeMethod
	public void thirdbeforemethod() {
		System.out.println("3 beforemethod-this will run before each test method inside a class- class level");
	}
	@BeforeTest
	public void secondtest() {
		System.out.println(
				"2 beforetest-this will run before all the  test methods in the test folder is completed (all the class present in the class ");
	}
	@Test
	public void createticket()
	{
		System.out.println("Addticket 1st test case");
	}
	@Test(groups= {"Editing"})
	public void editticket()
	{
		System.out.println("editticket 2 test case");
	}
	@AfterMethod
	public void thirdAftermethod() {
		System.out.println("3 Aftermethod-this will run After each test method inside a class- class level");
	}
	@AfterClass
	public void thirdafterclass()
	{
		System.out.println("3 Afterclass-this will run in each class After running all test method in a current class");
	}
	
}
