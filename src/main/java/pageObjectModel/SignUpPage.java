package pageObjectModel;


	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import utils.BaseClass;

	
	public class SignUpPage extends BaseClass {
		 private static String ddTitle = "title";  //name
		
		 private static String txtFirstnmae = "firstName";  //name
		 private static String lastname = "lastName"; //name
		
		 private static String rdgender = "gender";
		
		 private static String textssn = "ssn";  //id
		 private static String txtDob = "dob";  //name
		
		 private static String TxtEmeil = "emailAddress";  //id
		
		 private static String txtpassword = "password";  //id
		 private static String confirmpassword = "confirmPassword";  //id
		
		 private static String Nextbtn = "//button[text()='Next']";  //xpath
		
		
		
		
		
		
			
			
		
			
			
		public static void selectTitle(String title) {
			WebElement element = driver.findElement(By.name(ddTitle));
			Select select = new Select(element);
			select.deselectByVisibleText(title);
		}
		public static void enterFirstName(String value) {
			 driver.findElement(By.name(txtFirstnmae)).sendKeys("value");
		}
		public static void enterLastName(String value) {
		driver.findElement(By.name(lastname)).sendKeys("value");
		}
		public static void enterSSn(String value) {
			driver.findElement(By.id(textssn)).sendKeys("value");
		}
		public static void enterDob(String value) {
		driver.findElement(By.name(txtDob)).sendKeys("value");
		}
		public static void enterEmail(String value) {
			driver.findElement(By.id(TxtEmeil)).sendKeys("value");
		}
		public static void enterPassword(String value) {
			 driver.findElement(By.id(txtpassword)).sendKeys("value");
		}
		public static void enterConfirmPassword(String value) {
			driver.findElement(By.id(confirmpassword)).sendKeys("value");
		}
		public static void selectGender() {
			driver.findElement(By.name(rdgender)).click();
		}
		public static void SubmitClick() {
			driver.findElement(By.xpath(Nextbtn)).click();
		}

}
