package seleniumchrome;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Learnseleniumgrid {

	
		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			
			DesiredCapabilities ds = new DesiredCapabilities();
			ds.setBrowserName("chrome");
			ds.setPlatform(Platform.ANY);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);

	}

}
