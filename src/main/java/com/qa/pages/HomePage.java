package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	WebDriver driver;
	//Page Factory -OR
		
		@FindBy(xpath = "//input[contains(@name,'searchTerm')]")
		WebElement searchbox;
		
		@FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
		WebElement searchbutton;
		
		//Initialize the Page Objects:
		
		public HomePage()
		{
			PageFactory.initElements(driver,this);
		}
		
		//Actions
		
				
		
		public ProductPage Search(String text) {
			
			searchbox.sendKeys(text);
			searchbutton.click();
			return new ProductPage();
			
									
		}
		
				
}

