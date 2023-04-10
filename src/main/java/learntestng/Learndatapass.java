package learntestng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learndatapass {
	@Test (dataProvider ="getdata")
	public void loginHRM(String url,String username, String password) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String baseURL ="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(url);
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Title
		
		String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);
		
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		driver.findElementByXPath("//button[@type='submit']").click();
		driver.close();
	}
	@DataProvider (name ="getdata")
	public Object[][] getdata() throws IOException {

	   return Learnutilities.readdata();
	}
	}

