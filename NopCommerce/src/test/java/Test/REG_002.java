package Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.WebGeneric;
import POM.RegisterPage;
import POM.WelcomePage;

public class REG_002 extends BaseTest{
	@Test
	public void reg_002() throws InterruptedException {
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegister().click();
		RegisterPage rp=new RegisterPage(driver);
		WebElement dateOfBirth = rp.getDateOfBirth();
		WebGeneric.fetchAllOptionsInDropdown(dateOfBirth);
	}
}