package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class WomenPage {
	
	WebDriver dr;
	
	public WomenPage (WebDriver x) {
		dr = x;
	}
	
	public JweleryPage clickJwelery() {
	
	SeleniumHelper.clickOnElement(dr.findElement(By.xpath("")));
	return new JweleryPage(dr);
	
	}
	
}
