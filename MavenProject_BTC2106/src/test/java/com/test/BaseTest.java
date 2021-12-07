package com.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import db.ReadFile;

public class BaseTest {
	
	WebDriver dr;
	ReadFile f = new ReadFile();
	Properties p;
	
	@Before
	public void openBrowser() throws IOException{
		p = f.readPropFile("C:\\Users\\gazim\\eclipse-workspace\\MavenProject_BTC2106\\config.properties");
		String b = p.getProperty("broser");
		if(b.equals("chrome")) {
			System.out.println("open chrome browser");
			dr = new ChromeDriver();
		}else if(b.equals("ff")) {
			System.out.println("open Firefox browser");
			dr = new FirefoxDriver();
		}
		dr.get(p.getProperty("url"));
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
	}

}
