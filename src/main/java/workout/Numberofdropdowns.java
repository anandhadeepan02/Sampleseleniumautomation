package workout;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numberofdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String baseurl="http://demo.automationtesting.in/Register.html";
driver.get(baseurl);
List<WebElement> nofdropdowns = driver.findElementsByTagName("select");
int count= nofdropdowns.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	String attributes=nofdropdowns.get(i).getText();
	System.out.println(attributes);
}

	}

}
