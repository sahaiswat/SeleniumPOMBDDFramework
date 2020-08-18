
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import com.qa.util.TestBase;

public class SearchProductTest extends TestBase{
	
LoginPage loginPage;
HomePage homepage;
ProductPage product;
	
	public SearchProductTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage= new LoginPage();
	}
	
	
	@Test()
	public void LoginTest()
	{
		loginPage.loginapplication(pro.getProperty("username"), pro.getProperty("password"));
		
	}
	
	
		
	@Test()
	public void VerifyProductPresentTest()
	{
		homepage.Search("Coconut Milk");
		Boolean flag=product.equals("COCONUT MILK");
		Assert.assertTrue(flag);
	
	}
	
	@AfterMethod
	public void CloseApplication()
	{
		TearDown();
	}


}
