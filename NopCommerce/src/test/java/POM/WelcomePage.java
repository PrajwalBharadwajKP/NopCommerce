package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Register")
	private WebElement register;
	@FindBy(name="q")
	private WebElement searchbox;
	public WebElement getRegister() {
		return register;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
}