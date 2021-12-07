package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumHelper;

public class ProductPage {
	
	WebDriver dr;
	public ProductPage(WebDriver x) {
	dr = x;
	}

	public ProductDetailPage clickJweleryProd() {
		SeleniumHelper.clickOnElement(dr.findElement(By.xpath("")));
		return new ProductDetailPage(dr);
	}
	
}
