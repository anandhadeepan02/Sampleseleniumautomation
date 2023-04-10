package seleniumchrome;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learndrowndowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="http://demo.automationtesting.in/Register.html";
		driver.get(baseURL);
		List<WebElement> nodropdown = driver.findElementsByTagName("select");  
	     int count = nodropdown.size();
	     System.out.println("no of dropdown is:" +count);
	     
	   
	     
	     for (int i=0; i < count; i++) {
	    	 	 
	    	 String attribute = nodropdown.get(i).getText();
	    	 System.out.println("attribute value is:" + attribute );
	     }

	}

}
