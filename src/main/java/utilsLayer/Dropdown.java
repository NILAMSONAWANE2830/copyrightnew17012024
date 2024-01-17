package utilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import baseLayer.BaseClass;

public class Dropdown extends BaseClass{
	
	public static void selectByVisibleText(WebElement wb ,String value) {
		new Select(waits.focusOnElement(wb)).selectByVisibleText(value);
	}
	public static void selectByIndex(WebElement wb,int index) {
		new Select(waits.focusOnElement(wb)).selectByIndex(index);
	}
	public static void selectByValue(WebElement wb,String value) {
		new Select(waits.focusOnElement(wb)).selectByValue(value);
	}
	public static int size(WebElement wb) {
		return new Select(waits.focusOnElement(wb)).getOptions().size();
		}
	public static void getFirstSlectedOption(WebElement wb) {
		new Select(waits.focusOnElement(wb)).getFirstSelectedOption();
	}
	
	public static void getOption(WebElement wb) {
		List<WebElement> ls = new Select(waits.focusOnElement(wb)).getOptions();
		
		 for(WebElement wb1: ls) {
			 
			 String a = wb1.getText();
			 
			 System.out.println(a);
		 }
	}
	
}
