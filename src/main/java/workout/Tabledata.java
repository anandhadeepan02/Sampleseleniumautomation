package workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		String baseURL =("https://erail.in/");
		driver.get(baseURL);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("vri",Keys.ENTER);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("tbm",Keys.ENTER);
		WebElement date=driver.findElementById("chkSelectDateOnly");
		driver.findElementById("buttonFromTo").click();

if (date.isSelected()) {
	date.click();
}
WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']");
List<WebElement> row=table.findElements(By.tagName("tr"));
int nofrow=row.size();
System.out.println(nofrow);
for(int i=1;i<nofrow;i++) {
	WebElement rows=row.get(i);
	List<WebElement> columns=rows.findElements(By.tagName("td"));
	String data=columns.get(1).getText();
	System.out.println(data);
}


	}

}
