package browserSetUp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase extends OpenBrowser {

	WebDriver driver;
	
	@Test
	public void main1() {
	
		
	
        driver.get( "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html" );
      // String title= driver.getTitle();
       
      // System.out.println(title);
       System.out.println(driver.getTitle());
       
       
       OpenBrowser open=new OpenBrowser();
       
      
	}
	
}