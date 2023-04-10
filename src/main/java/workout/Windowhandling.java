package workout;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String baseurl="https://erail.in/";
driver.get(baseurl);
String mainwindow=driver.getWindowHandle();

System.out.println(mainwindow);
driver.findElementByXPath("//*[@href='http://www.indianrail.gov.in\']").click();
Set<String> nofwindows=driver.getWindowHandles();
int totalwindows=nofwindows.size();
System.out.println(totalwindows);
List<String> windows=new ArrayList<String>(nofwindows);
driver.switchTo().window(windows.get(0));
System.out.println(driver.getTitle());
driver.switchTo().window(windows.get(1));
System.out.println(driver.getTitle());
driver.switchTo().window(windows.get(0));


	}

}

