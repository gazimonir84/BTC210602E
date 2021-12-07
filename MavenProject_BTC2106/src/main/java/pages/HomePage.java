package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class HomePage {
	
	WebDriver dr;
	
	public HomePage(WebDriver x) {
		dr = x;
		PageFactory.initElements(dr, this);
	}

	public void verifyHomePageLogo() {
		SeleniumHelper.verifyElement(dr.findElement(By.xpath("value of logo")));
	}
	
	public void hoverOverOnmenMenu() {
		SeleniumHelper.hoverOver(dr, dr.findElement(By.id("")));
	}
	
	public NewArrivalPage clickOnNewArrival () {
		SeleniumHelper.clickOnElement(dr.findElement(By.xpath("")));
		return  new NewArrivalPage(dr);
	}
	
	public WomenPage ClickOnWomenLink() {
		SeleniumHelper.clickOnElement(dr.findElement(By.xpath("")));
		return new WomenPage(dr);
		
	}
	
	
}
