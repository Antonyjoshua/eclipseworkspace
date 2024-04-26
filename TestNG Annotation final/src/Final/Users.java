package Final;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Users {
	@Test
	public void addUsers()
	{
		System.out.println("Adduser 1st test case");
	}
	@BeforeMethod
	public void secondbeforemethod() {
		System.out.println("2 beforemethod-this will run before each test method inside a class- class level");
	}
	@BeforeClass
	public void secondclass()
	{
		System.out.println("2 Beforeclass-this will run in each class before the first method of the class");
	}
	@Test(groups= {"Editing"})
	public void editUsers()
	{
		System.out.println("editHotel 2 test case");
	}
	@Test
	public void viewUsers()
	{
		System.out.println("ViewHotel 3 test case");
	}
	@AfterMethod
	public void secondAftermethod() {
		System.out.println("2nd Aftermethod-this will run After each test method inside a class- class level");
	}
	@AfterTest
	public void firstaftertest() {
		System.out.println(
				"1st aftertest-this will run after all the  test methods in the test folder is completed (all the class present in the class ");
	}
	@AfterClass
	public void Secondafterclass()
	{
		System.out.println("2 Afterclass-this will run in each class After running all test method in a  class");
	}
	
}
