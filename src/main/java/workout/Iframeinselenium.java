package workout;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeinselenium {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		driver.get(baseURL);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		String name="anand";
		driver.switchTo().alert().sendKeys("anand");
		driver.switchTo().alert().accept();
		WebElement displayedcontent=driver.findElementById("demo");
		String content=displayedcontent.getText();
		if(content.contains(name)) {
			System.out.println("name is verified");
		}
		else {
			System.out.println("mismatch");
		}
		File screenshot=driver.getScreenshotAs(OutputType.FILE);
		File shot=new File(".//snaps/img1.png");
		FileUtils.copyFile(screenshot, shot);
		
		driver.switchTo().defaultContent();
		
	}

}
