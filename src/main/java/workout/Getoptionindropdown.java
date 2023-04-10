package workout;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptionindropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String baseurl="http://demo.automationtesting.in/Register.html";
		driver.get(baseurl);
		WebElement skill=driver.findElementById("Skills");
		Select alloptions=new Select(skill);
List<WebElement> allskills=alloptions.getOptions();
for(WebElement element:allskills) {
	System.out.println(element.getText());
}
	

	}

}
