package utilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;

public class waits extends BaseClass {

	public static WebElement focusOnElement(WebElement wb) {
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static  void sendKeys(WebElement wb,String value) {
		waits.focusOnElement(wb).sendKeys(value);
	}
	public static  String getText(WebElement wb) {
		return waits.focusOnElement(wb).getText();
	}
	public static  String getAttribute(WebElement wb,String value) {
		return waits.focusOnElement(wb).getAttribute(value);
	}
	public static  void click(WebElement wb) {
		waits.focusOnElement(wb).click();
	}
	public static  void clear(WebElement wb) {
		waits.focusOnElement(wb).clear();
	}
	
	public static void selectGender(List<WebElement>lw,String gender) {
		for(WebElement wb:lw)
		{
			if(wb.getText().equalsIgnoreCase(gender)) {
				wb.click();
				break;
			}
		}
	}
	public static boolean isSelected(WebElement wb) {

		return focusOnElement(wb).isSelected();
	}
}
