package pageObjectModel;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import utils.BaseClass;
	
	
	
	
	public class LoginPage extends BaseClass {
		
		//private static String txtUsername="username";
		private static String txtUsername="form-control"; //className
		
		private static String txtPassword="password";  //name
		private static String btnlogin="//button[text()='Sign in']";  //xpath
		
		
		
		
		public static void enteruserName(String value) {
			driver.findElement(By.className(txtUsername)).sendKeys(value);
		}
		public static void enterPassword(String value) {
			driver.findElement(By.name(txtPassword)).sendKeys(value);
		}
		
		public static void submitClick() {
			driver.findElement(By.xpath(btnlogin)).click();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
