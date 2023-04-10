package seleniumchrome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="http://demo.automationtesting.in/Register.html";
		driver.navigate().to(baseURL);
		//driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@placeholder='First Name']").sendKeys("anandhadeepan");
		driver.findElementByXPath("//input[@placeholder='Last Name']").sendKeys("S");	
		driver.findElementByXPath("//textarea[@rows='3']" ).sendKeys("74/1B,Thiruvalluvar nagar,13th Cross street,virudhachalam-606001");
		driver.findElementByXPath("//input[@type='email']").sendKeys("anandhadeepan02@gmail.com");
		driver.findElementByXPath("//input [@type='tel']").sendKeys("9566554652");
		//driver.findElementByXPath("//input[@value='FeMale']").click();
		driver.findElementByXPath("//input[@value='Male']").click();
		WebElement radiomale=driver.findElementByXPath("//input[@value='Male']");
		WebElement radiofemale=driver.findElementByXPath("//input[@value='FeMale']");
		System.out.println(radiomale.isSelected());
		System.out.println(radiofemale.isSelected());
		driver.findElementById("checkbox1" ).click();
		driver.findElementById("checkbox2" ).click();
		//driver.close();
		//		driver.quit();
		//driver.findElementByXPath("//button[@type='button']").click() ;
	}

}
