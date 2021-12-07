package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumHelper;

public class JweleryPage {
	
	WebDriver dr;
	
	public JweleryPage(WebDriver x) {
	dr =x;
	}
	
	public ProductPage clickJweleryProd() {
		SeleniumHelper.clickOnElement(dr.findElement(By.xpath("")));
		return new ProductPage(dr);
		
	}
	

}
