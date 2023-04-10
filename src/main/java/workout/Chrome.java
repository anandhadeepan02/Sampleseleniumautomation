package workout;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String baseurl="http://demo.automationtesting.in/Register.html";
driver.get(baseurl);
driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);

String curl=driver.getCurrentUrl();
System.out.println(curl);

driver.findElementByXPath("//input[@value='Male']").click();
WebElement element=driver.findElementByXPath("//input[@value='Male']");
System.out.println(element.isSelected());



	}

}
