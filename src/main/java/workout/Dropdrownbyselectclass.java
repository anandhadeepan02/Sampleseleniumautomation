package workout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdrownbyselectclass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String baseurl="http://demo.automationtesting.in/Register.html";
		driver.get(baseurl);
		WebElement skilldropdown=driver.findElementById("Skills");
		Select object=new Select(skilldropdown);
		//object.selectByIndex(4);
		//object.selectByValue("C++");
		object.selectByVisibleText("CSS");
		

	}

}
