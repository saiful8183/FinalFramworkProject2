package browserSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	 WebDriver driver;
	
	public OpenBrowser() {

   
		
	
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();

		
		
		
		
		
		
		
		
		
	}

}
