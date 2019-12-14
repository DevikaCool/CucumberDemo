package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;


public class MyStepDefinition {
	public WebDriver driver;
	public HomePage h;

	@Given("^User is on greenkart landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {

	    driver=Base.getDriver();
	    Thread.sleep(2000);
	    

	}

	@When("^User searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_vegetable(String arg1) throws Throwable {
	    h=new HomePage(driver);
	   h.getSearch().sendKeys(arg1);
	    Thread.sleep(3000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {
Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
	    
	}
	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
	    driver.findElement(By.cssSelector("a.increment")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}
	
	@And("^User proceed to checkout page for purchase$")
	public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    
	}



}
