package utils;



	
	
	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class BaseClass {
		
		
		
		
		public static WebDriver driver;
		
		
		
		
		@BeforeMethod
		public void setup() {
			
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
			 //System.setProperty("webdriver.gecko.driver", "/Users/saiful/Downloads/geckodriver");
			 //driver=new FirefoxDriver();	
				
				driver.get("http://prod.dbank.staging-apps.relicx.ai:8080/bank/signup");	
					
					driver.manage().window().maximize();
			
		}
		
		
		@AfterMethod
		public void close() {
			
			
			driver.quit();
		}
		

}
