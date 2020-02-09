package com.figosoft.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.figosoft.qa.base.TestBase;
public class Amazone_page extends TestBase{
	
	//Page Factory
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbar;
	@FindBy(xpath="//input[@type='submit'][@class='nav-input']")
	WebElement searchbtn;
	@FindBy (xpath="(//span[contains(text(),'47,900')])[1]")
	WebElement prodprice;
	
	public Amazone_page(){
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
