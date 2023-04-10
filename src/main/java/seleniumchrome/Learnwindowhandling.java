package seleniumchrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwindowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String baseURL=("https://erail.in/");
		driver.get(baseURL);
		driver.manage().window().maximize();
		String firstwindow=driver.getWindowHandle();

		System.out.println(firstwindow);
		driver.findElementByXPath("//*[@href='http://www.indianrail.gov.in\']").click();
		Set<String> allwindow=driver.getWindowHandles();//set does not allow duplicates
		System.out.println("total no of windows "+allwindow.size());
		List<String> list=new ArrayList<String>(allwindow);//list maintain insertion order
		driver.switchTo().window(list.get(0));
		System.out.println("title"+driver.getTitle());
		System.out.println("URL"+driver.getCurrentUrl());
		driver.switchTo().window(list.get(1));
		System.out.println("title"+driver.getTitle());
		System.out.println("URL"+driver.getCurrentUrl()); 
		
		

	}

}
