package com.figosoft.qa.testcases;

import org.testng.annotations.Test;

import com.figosoft.qa.pages.Amazone_page;
import com.figosoft.qa.pages.Flipkart_page;

public class Compare_Price {
	Amazone_page pageamzn;
	Flipkart_page pageflipkart;
	public Compare_Price(){
		
	}
	@Test
	public void verifyPrice(){
	String amzprice=pageamzn.getPrice();
	int value1=Integer.parseInt(amzprice);
	String flpkrtprice=pageflipkart.getPrice();
	int value2=Integer.parseInt(flpkrtprice);
	System.out.println(value1);
	System.out.println(value2);
	if(value1<value2){
		System.out.println(value1);
	}else{
		System.out.println(value2);
	}
	}
	
	

}
