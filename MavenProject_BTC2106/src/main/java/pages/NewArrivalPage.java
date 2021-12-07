package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumHelper;

public class NewArrivalPage {
	
	WebDriver dr;
	
	public NewArrivalPage(WebDriver x) {
		dr = x;
	}

	public void clickFirstProduct() {
		SeleniumHelper.clickOnElement(dr.findElement(By.id("")));
	}
	
	public void clickOnAllNewProduct() {
		SeleniumHelper.clickOnElement(dr, dr.findElements(By.xpath("")));
	}
	
	
}
