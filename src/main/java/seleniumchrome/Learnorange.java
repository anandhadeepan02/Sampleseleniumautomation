package seleniumchrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnorange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL =("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("Admin");
driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("admin123");
driver.findElementByXPath("//button[@type='submit']").click();       
		
		 
		 
		 
	}
	

}
