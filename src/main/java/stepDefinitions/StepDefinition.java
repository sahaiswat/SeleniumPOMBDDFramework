package stepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition{
	
		
	
	WebDriver driver;
	WebDriverWait wait;
	
		
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ssinha\\\\Desktop\\\\driver\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.bdirectcloud.net/");
			
	}
	
	
	@When("^User is on the BidOne Loginpage and Title of the page is BidOne$")
	public void user_is_on_the_BidOne_Loginpage_and_Title_of_the_page_is_BidOne() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "myBidfood", "Title is displayed");
		
	}
	
		
	@Then("^User logs into application$")
	public void user_enters_correct_username_and_password() {
	driver.findElement(By.id("UserName")).sendKeys("BID198450");
	driver.findElement(By.id("Password")).sendKeys("Lgm3t4");
	driver.findElement(By.xpath("//input[contains(@id,'submitBtn')]")).click();
		
	}


	@And("^User searches for Coconut Milk$")
	public void user_searches_for_Coconut_Milk() throws InterruptedException {
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[contains(@name,'searchTerm')]")).sendKeys("Coconut Milk");
		driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-search']")).click();
			
		
	}

	@And("^Search page is displayed$")
	public void search_page_is_displayed() throws InterruptedException {
		Thread.sleep(1000);	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='productName']//a[1]")));
		WebElement ele= driver.findElement(By.xpath("//span[@class='productName']//a[1]"));
		String text=ele.getText();
	       System.out.print(text);
	       Assert.assertEquals(text, "COCONUT MILK", "Page displayed");
	       
	}

	
	@Then("^Closes the application$")
	public void closes_the_application() {
		driver.quit();

}
		
}	
	
	


