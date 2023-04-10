 package seleniumchrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learnexplicitywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String baseURL=("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("Admin");
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("admin123");
		driver.findElementByXPath("//button[@type='submit']").click();
	WebDriverWait wait=new WebDriverWait(driver , 10);	
	WebElement tab=	driver.findElementByLinkText("Admin");
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(tab));
	element.click();
	

	}

}
