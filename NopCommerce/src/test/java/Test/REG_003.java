package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.WelcomePage;

public class REG_003 extends BaseTest{
	@Test
	public void reg_003() throws EncryptedDocumentException, IOException, InterruptedException {
		WelcomePage wp=new WelcomePage(driver);
		WebElement searchbox = wp.getSearchbox();
		ReadExcel r=new ReadExcel();
		for(int i=0;i<26;i++) {
			String value = r.readDataFromSearchboxExcel("Sheet1",i,0);
			searchbox.sendKeys(value);
			searchbox.clear();
		}
	}
}