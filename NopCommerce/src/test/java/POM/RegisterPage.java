package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver,this);;
	}
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(name="DateOfBirthDay")
	private WebElement dateOfBirth;
	@FindBy(name="DateOfBirthMonth")
	private WebElement monthOfBirth;
	@FindBy(name="DateOfBirthYear")
	private WebElement yearOfBirth;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Company")
	private WebElement companyName;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id="register-button")
	private WebElement registerBTN;
	@FindBy(id="gender-male")
	private WebElement maleRadioBTN;
	@FindBy(id="gender-female")
	private WebElement femaleRadioBTN;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	public WebElement getMonthOfBirth() {
		return monthOfBirth;
	}
	public WebElement getYearOfBirth() {
		return yearOfBirth;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCompanyName() {
		return companyName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterBTN() {
		return registerBTN;
	}
	public WebElement getMaleRadioBTN() {
		return maleRadioBTN;
	}
	public WebElement getFemaleRadioBTN() {
		return femaleRadioBTN;
	}
}