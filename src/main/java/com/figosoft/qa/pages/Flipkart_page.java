package com.figosoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.figosoft.qa.base.TestBase;

public class Flipkart_page extends TestBase{
	
	//Page Factory
	@FindBy (xpath="//input[@type='text']")
	WebElement searchbar;
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbtn;
	@FindBy (xpath="//div[@class='_1vC4OE _2rQ-NK']")
	WebElement prodprice;
	
	public Flipkart_page(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void searchProduct(String prodname){
		searchbar.sendKeys(prodname);
		searchbtn.click();
	}
	public String getPrice(){
		return prodprice.getText();
	}
}
