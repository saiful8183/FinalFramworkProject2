package browserSetUp;



	
	


import org.testng.annotations.Test;

import pageObjectModel.LoginPage;
import pageObjectModel.SignUpPage;
import utils.BaseClass;
public class FirstTest extends BaseClass {
	
	
	@Test
	
	public void signup() {
		
		SignUpPage.selectTitle("Mr");
		
		SignUpPage.enterFirstName("Saiful");
		
		
		SignUpPage.enterLastName("Chow");
		SignUpPage.selectGender();
		
		SignUpPage.enterSSn("435-77-5357");
		
		
		SignUpPage.enterDob("01/01/1988");
		
		
		SignUpPage.enterEmail("forida1995@gmail.com");
		
		
		SignUpPage.enterPassword("43748363");
		
		
		SignUpPage.enterConfirmPassword("43748363");
		
		
		SignUpPage.SubmitClick();
		
		
		
		
		
		}
	
	@Test
	public void login() {
		
		LoginPage.enteruserName("forida1995@gmail.com");
		
		LoginPage.enterPassword("43748363");
		
		LoginPage.submitClick();
		
		
		
	}

}
