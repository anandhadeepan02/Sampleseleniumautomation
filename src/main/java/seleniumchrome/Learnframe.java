package seleniumchrome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Learnframe {  

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		driver.get(baseURL);
			
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String name="anand";
			
		//Alert handling
		driver.switchTo().alert().sendKeys("anand");
		//adding the screenshot code
		
		driver.switchTo().alert().accept();
		String acualText = driver.findElementById("demo").getText();
		System.out.println(name);
		System.out.println(acualText);
if (acualText.contains(name)) {
			System.out.println("Name is verified successfully");
		}
		else {
			System.out.println("Name not verified");
		}
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File obj = new File (".//snaps/img1.png");
		FileUtils.copyFile(scr, obj);
		
		//to return from the frame
		driver.switchTo().defaultContent();
	}
}