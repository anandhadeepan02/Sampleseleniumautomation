package learntestng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestng {
@Test	
	public void applaunch() {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String baseURL=("https://www.irctc.co.in/eticketing/userSignUp");
	driver.get(baseURL);
	driver.manage().window().maximize();
	String firstwindow=driver.getWindowHandle();

	System.out.println(firstwindow);
	driver.findElementByLinkText("Contact Us").click();
	Set<String> allwindow=driver.getWindowHandles();
	System.out.println("total no of windows "+allwindow.size());
	List<String> list=new ArrayList<String>(allwindow);
	driver.switchTo().window(list.get(0));
	System.out.println("title"+driver.getTitle());  
	System.out.println("URL"+driver.getCurrentUrl());
	driver.switchTo().window(list.get(1));
	System.out.println("title"+driver.getTitle());
	System.out.println("URL"+driver.getCurrentUrl()); 
	
	}
}
