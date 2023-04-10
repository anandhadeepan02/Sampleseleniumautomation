package learntestng;

import org.testng.annotations.Test;

public class Learngroups {
	@Test (groups = {"smoketest","sanitytest"})
	public void method1() {
	System.out.println("This is first method");

	}
	@Test (groups = "smoketest")
	public void method2() {
	System.out.println("This is second method");

	}
	@Test (groups = "Functionaltest")
	public void method3() {
	System.out.println("This is third method");

	}
@Test (groups = "Functionaltest")
	public void method4() {
	System.out.println("This is fourth method");

	}
	@Test (groups = "Functionaltest")
	public void method5() {


	}
	@Test (groups = "Functionaltest")
	public void method6() {

	//throws IO exception
	System.out.println("This is sixth method");
	}
@Test (dependsOnGroups = "Functionaltest")
	public void method7() {
	System.out.println("This is seventh method");
	}
	@Test (groups ="UATTest", dependsOnGroups ="Functionaltest")
	public void method8() {
	System.out.println("This is eighth method");
	}
	@Test (groups ="UATTest",dependsOnGroups = {"smoketest","Functionaltest"})
	public void method9() {
	System.out.println("This is ninth method");
	

}
}
