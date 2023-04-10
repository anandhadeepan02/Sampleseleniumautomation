package seleniumchrome;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaengetoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver(); 
				String baseURL ="http://demo.automationtesting.in/Register.html";
				driver.get(baseURL);
				WebElement skills = driver.findElementById("Skills");
				Select skillsdrpdwn = new Select(skills);
			     
			     List<WebElement> AllOpt = skillsdrpdwn.getOptions();
			     System.out.println("The total number of elements are:" +AllOpt.size());
			     
			    for (WebElement eachele:AllOpt) {
			    	System.out.println(eachele.getText());
			    }

	} 

}
