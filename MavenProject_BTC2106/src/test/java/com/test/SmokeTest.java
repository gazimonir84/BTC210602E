package com.test;

import org.junit.Test;

import pages.HomePage;
import pages.JweleryPage;
import pages.NewArrivalPage;
import pages.ProductDetailPage;
import pages.ProductPage;
import pages.WomenPage;

public class SmokeTest extends BaseTest {
	
	NewArrivalPage nap;
	WomenPage wp;
	JweleryPage jp;
	ProductPage pd;
	ProductDetailPage pdp;
		
	
	@Test
	public void test1 () {
		System.out.println("my test");
		HomePage hp = new HomePage(dr);
		hp.verifyHomePageLogo();
		hp.hoverOverOnmenMenu();
		wp=hp.ClickOnWomenLink();
		jp=wp.clickJwelery();
		pd=jp.clickJweleryProd();
		pdp=pd.clickJweleryProd();
		//nap = hp.clickOnNewArrival();//new NewArrivalPage
		//nap.clickFirstProduct();
	}

	@Test
	public void test11 () {
		System.out.println("my test");
		HomePage hp = new HomePage(dr);
		hp.verifyHomePageLogo();
		hp.hoverOverOnmenMenu();
		nap = hp.clickOnNewArrival();//new NewArrivalPage
		nap.clickOnAllNewProduct();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
