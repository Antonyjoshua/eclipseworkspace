package Final;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	
	//need min 1 @test method in a class to run a program
	@BeforeMethod
	public void fourthbeforemethod() {
		System.out.println("4 beforemethod-this will run before each test method inside a class- class level");
	}
	@BeforeClass
	public void fourthbeforeclass()
	{
		System.out.println("4 beforeclass-this will run in each class before the first method of the class");
	}
	@Test
	public void sendreview()
	{
		System.out.println("sendreview 1st test case");
	}
}
