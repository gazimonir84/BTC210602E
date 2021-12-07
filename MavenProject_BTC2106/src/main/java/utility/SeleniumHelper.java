package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumHelper {
	
	public static WebElement waitForElement(WebElement element) {
		ExpectedConditions.visibilityOf(element);
		return element;
	}
	
	public static void verifyElement(WebElement element) {
		if(waitForElement(element).isDisplayed()) {
			System.out.println("element is present");
		}else {
			System.out.println("not present");
		}
	}
	
	public static void hoverOver(WebDriver dr, WebElement element) {
		Actions a = new Actions(dr);
		a.moveToElement(element).build().perform();
	}
	
	public static void clickOnElement(WebElement element) {
		waitForElement(element).click();
	}
	
	public static void clickOnElement(List<WebElement> elements, int i ) {
		elements.get(i).click();
	}
	
	public static void clickOnElement(WebDriver dr, List<WebElement> elements) {
		for(int i=0; i<=elements.size(); i++) {
			elements.get(i).click();
			dr.navigate().back();
		}
	}
	
	
	
	
}
