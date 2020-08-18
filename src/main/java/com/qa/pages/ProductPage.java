package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ProductPage extends TestBase{
	
	
	WebDriver driver;

	//Page Factory -OR
	
	@FindBy(xpath="//span[@class='productName']//a[1]")
	WebElement product;
	
		
	//Initialize the Page Objects:
	
	public ProductPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
		
	public boolean ProductDisplayed()
	{
		
		product.isDisplayed();
		return true;
		
	}
	
	

}
