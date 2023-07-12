package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebGeneric implements IConstants{
	public static int randomNumber() {
		Random r=new Random();
		return r.nextInt(100);
	}
	public static void selectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String visibleText) {
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public static String readDataFromPropertyFile(String value) throws IOException {
		Properties property=new Properties();
		FileInputStream fis=new FileInputStream(PROPERTY_PATH);
		property.load(fis);
		return property.getProperty(value);
	}	
	public static void fetchAllOptionsInDropdown(WebElement element) throws InterruptedException {
		Select select=new Select(element);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement singleOption:allOptions) {
			singleOption.click();
		}
	}
}