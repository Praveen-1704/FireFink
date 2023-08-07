package frameworkTraining;

import org.testng.annotations.Test;

import common_Repository.LoginPage;
import common_Repository.WelcomePage;


public class LoginTest extends Base_Test{

	
	@Test
	public void login()
	{
		
		WelcomePage page = new WelcomePage(Base_Test.driver);
		page.LoginLink.click();
		LoginPage login = new LoginPage(Base_Test.driver);
		login.emailTextField.sendKeys("Mannni123@gmail.com");
		login.passwordTestfield.sendKeys("BalaMani");
		login.LoginButton.click();
		
	}
}
