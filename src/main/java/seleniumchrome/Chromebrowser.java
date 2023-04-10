package seleniumchrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="http://www.google.com";
		driver.get(baseURL);
		Dimension a=new Dimension(2000 ,600);
		driver.manage().window().setSize(a);
		String title = driver.getTitle(); 
		System.out.println("Title of the page is:" +title); 
		String CURL= driver.getCurrentUrl(); 
		System.out.println("The Current URL is:" +CURL);


	} 

}
