package seleniumchrome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnwebelements {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="http://demo.automationtesting.in/Register.html";
		driver.get(baseURL);
WebElement skilldrpdwn = driver.findElementById("Skills");
		
		Select drpobj = new Select(skilldrpdwn);
		
	    //drpobj.selectByVisibleText("Analytics");
	    
	    drpobj.selectByValue("APIs");
	    
	    //drpobj.selectByIndex(12);
	}

}
