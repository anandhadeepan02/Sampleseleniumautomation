package learntestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learncssselector {
	@Test
	public void applaunch() {

	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
	String baseURL ="https://phptravels.org/login";
	driver.navigate().to(baseURL);
	//driver.get(baseURL);
	driver.manage().window().maximize();
	//driver.findElementByCssSelector("input#inputEmail").sendKeys("anandhadeepan02@gmail.com");
		//driver.findElementByCssSelector("input[name=username]").sendKeys("anandhadeepan02@gmail.com");
		//driver.findElementByCssSelector("input.form-control").sendKeys("anandhadeepan02@gmail.com");
	driver.findElementByCssSelector("input.form-control[name='username']").sendKeys("anandhadeepan02.com");
	
	}
}
 