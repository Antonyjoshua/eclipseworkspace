package Final;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Review {
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
	@Test(groups= {"Editing"})
	public void deleteReview()
	{
		System.out.println("deleteReview 2 test case");
	}
	@AfterTest
	public void secondaftertest() {
		System.out.println(
				"2  aftertest-this will run after all the  test methods in the test folder is completed (all the class present in the class ");
	}
	@AfterMethod
	public void fourthAftermethod() {
		System.out.println("4 Aftermethod-this will run After each test method inside a class- class level");
	}
	@AfterClass
	public void fouthclass()
	{
		System.out.println("4 afterclass-this will run in each class After running all test method in a  class");
	}
	@AfterSuite
	public void lastoutput()
	{
		System.out.println("last of this suite");
	}

}
