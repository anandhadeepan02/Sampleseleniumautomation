package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learnannatation {

	@BeforeMethod
	public void beforemethod01() {
		System.out.println("This is the before Method01");
	}	
	
@BeforeSuite
public void beforesuitem1() {
	System.out.println("This is the before Suite");
}
@BeforeTest
public void beforetestm1() {
	System.out.println("This is the before test");
}
@BeforeClass
public void beforeclassm1() {
	System.out.println("This is the before class");
}
@DataProvider
public void data() {
	System.out.println("this is a data providr");
}

@Test 
public void testmethod01() {
	System.out.println("This is the first test case");
}
@Test 
public void testmethod02() {
	System.out.println("This is the Second test case");
}
@AfterMethod
public void aftermethod01() {
	System.out.println("Method01 has been executed");
}

@AfterClass
public void afterclassm1() {
	System.out.println("This is the after class");
}
@AfterTest
public void aftertestm1() {
	System.out.println("This is the after test");
}
@AfterSuite
public void aftersuitem1() {
	System.out.println("This is the after suite");
}
}
