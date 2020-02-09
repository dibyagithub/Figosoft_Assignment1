package com.figosoft.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.figosoft.qa.base.TestBase;
import com.figosoft.qa.pages.Amazone_page;
import com.figosoft.qa.util.Testutil;

public class Amazonepagetest extends TestBase {
	
	Amazone_page amznpage;
    public Amazonepagetest(){
		
	}

	@BeforeMethod
	public void setUp(){
	System.setProperty("driver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIY_TIMEOUT, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");	
	}
	
	@Test
	public void productsearchTest(){
		amznpage.searchProduct("iPhone XR (64GB) - Yellow");	
	}
	@Test
	public void veryfyProdPrice(){
		 amznpage.getPrice();	
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
