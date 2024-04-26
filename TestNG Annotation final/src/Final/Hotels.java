package Final;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hotels {
	@BeforeSuite
	public void firstoutput() {
		System.out.println("Ist of this suite");
	}

	@BeforeClass
	public void firstclass() {
		System.out.println("1st beforeclass-this will run in each class before the first method of the class");
	}
	
	@BeforeMethod
	public void firstbeforemethod() {
		System.out.println("1st beforemethod-this will run before each test method inside a class- class level");
	}

	@BeforeTest
	public void firsttest() {
		System.out.println(
				"1st beforetest-this will run before all the  test methods in the test folder is completed (all the class present in the class ");
	}

	@Test
	public void addHotels() {
		System.out.println("AddHotel 1st test case");
	}

	@Test(groups= {"Editing"})
	public void editHotels() {
		System.out.println("editHotel 2 test case");
	}

	@Test
	public void viewHotels() {
		System.out.println("ViewHotel 3 test case");
	}
	
	@AfterMethod
	public void firstAftermethod() {
		System.out.println("1st Aftermethod-this will run After each test method inside a class- class level");
	}
	@AfterClass
	public void firstafterclass() {
		System.out.println("1 after class-this will run in each class After running all test method in a  class");
	}

}
