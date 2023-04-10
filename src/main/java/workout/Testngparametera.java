package workout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Testngparametera {
	@Parameters ({"url","username","password"})
	@Test
public void program(String url,String username,String password){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
			driver.findElementByXPath("//button[@type='submit']").click();

		
	
	
}
}
