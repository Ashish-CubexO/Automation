package scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGclass {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("I am in beforeSuit");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("I am in afterSuit");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("I am in afterClass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("I am in afterTest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in afterMethod");
	}
	@Test
	public void runTest1() {
		System.out.println("I am in Test-1");
	}
	@Test
	public void runTest2() {
		System.out.println("I am in Test-2");
	}
	
	
	
}

 class TestNGclassChild extends TestNGclass{
	
	@BeforeGroups("IT Department")  
	public void before_it()  
	{  
	System.out.println("This method will be executed before the execution of IT Department group");  
	}  
	@Test  
	public void testcase1()  
	{  
	System.out.println("HR");  
	}  
	 @Test(groups= {"IT Department"})  
	public void testcase2()  
	{  
	System.out.println("Software Developer");  
	}  
	@Test(groups= {"IT Department"})  
	public void testcase3()  
	{  
	System.out.println("QA Analyst");  
	}  
	
	
	
	
	
	
}
	

