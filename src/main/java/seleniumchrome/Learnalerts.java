package seleniumchrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
String baseURL=("https://demo.automationtesting.in/Alerts.html");
driver.get(baseURL);
//simple alert
/*driver.findElementByLinkText("Alert with OK").click();
driver.findElementByXPath("//button[@class='btn btn-danger']").click();
driver.switchTo().alert().accept();*/
//confirmation alert
/*driver.findElementByLinkText("Alert with OK & Cancel").click();
driver.findElementByXPath("//button[@class='btn btn-primary']").click();
driver.switchTo().alert().accept();//to accept the alert
driver.switchTo().alert().dismiss();//to cancel the alert*/

driver.findElementByLinkText("Alert with Textbox").click();
driver.findElementByXPath("//button[@class='btn btn-info']").click();


Alert alert=driver.switchTo().alert();
alert.sendKeys("demo user");
   
alert.accept();
System.out.println("Alert is accepted");

WebElement primary=driver.findElementById("demo1");
String text=primary.getText();
System.out.println(text);



	}

}
