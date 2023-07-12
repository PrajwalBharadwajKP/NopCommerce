package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import Generic.WebGeneric;
import POM.RegisterPage;

import POM.WelcomePage;

public class REG_001 extends BaseTest{
	@Test
	public void reg_001() throws EncryptedDocumentException, IOException {
		ReadExcel r=new ReadExcel();
		String firstname = r.readDataFromExcel("Sheet1",0,0);
		String lastname = r.readDataFromExcel("Sheet1",0,1);
		String date = WebGeneric.readDataFromPropertyFile("date");
		String month = WebGeneric.readDataFromPropertyFile("month");
		String year=WebGeneric.readDataFromPropertyFile("year");
		String company=r.readDataFromExcel("Sheet1",0,5);
		String password = r.readDataFromExcel("Sheet1",0,6);
		int randomNumber=WebGeneric.randomNumber();
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegister().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getMaleRadioBTN().click();
		rp.getFirstname().sendKeys(firstname);
		rp.getLastname().sendKeys(lastname);
		WebElement dateOfBirth = rp.getDateOfBirth();
		WebGeneric.selectByVisibleText(dateOfBirth, date);
		WebElement monthOfBirth = rp.getMonthOfBirth();
		WebGeneric.selectByVisibleText(monthOfBirth, month);
		WebElement yearOfBirth = rp.getYearOfBirth();
		WebGeneric.selectByVisibleText(yearOfBirth, year);
		rp.getEmail().sendKeys("prajwal"+randomNumber+"@gmail.com");
		rp.getCompanyName().sendKeys(company);
		rp.getPassword().sendKeys(password);
		rp.getConfirmPassword().sendKeys(password);
	}
}