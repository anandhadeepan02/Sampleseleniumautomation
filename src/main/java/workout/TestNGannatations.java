package workout;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannatations {
	@Test
	public void test() {
		System.out.println("this is the test data");
	}
@BeforeSuite
	public void suit() {
	System.out.println("this is a before suit");
}
@BeforeTest
public void tst() {
	System.out.println("this is a before test");
}
@BeforeClass
public void clas() {
System.out.println("this is a before class");	
}
@BeforeMethod
public void mtd() {
	System.out.println("this is a before method");
}
@AfterMethod
public void amtd() {
	System.out.println("this is a after method");
}
@AfterClass
public void aclas() {
	System.out.println("this is a after classs");
}
@AfterTest
public void atst() {
	System.out.println("this is a after test");
}
@AfterSuite
public void asuit() {
	System.out.println("this is a after suite");
}
@Test
public void test1() {
	System.out.println("this is test data 2");
}
}
