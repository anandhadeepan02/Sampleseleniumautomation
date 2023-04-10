package workout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGcrossbrowsertesting {
public static WebDriver driver;
@Parameters("browser")
@Test
public void crssbrowser(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	String baseURL =("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get(baseURL);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.close()	;
}
}
