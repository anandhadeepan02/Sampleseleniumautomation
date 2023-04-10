package workout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String baseURL =("http://demo.guru99.com/test/drag_drop.html");
driver.get(baseURL);
WebElement From=driver.findElementByXPath("//li[@id='credit2']/a");
 
 WebElement To=driver.findElementByXPath("//ol[@id='bank']/li");
 Actions builder=new Actions(driver);
 builder.dragAndDrop(From, To).perform();
 
	}

}
