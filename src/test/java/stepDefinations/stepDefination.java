package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.CartPage;
import pageObjects.HomePage;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;


import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	public CartPage c;
	public HomePage h;

  @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    
    	System.out.println("navigated to login url");
    	
    }
  @Given("^validate the browser$")
  public void validate_the_browser() throws Throwable {
	  System.out.println("deciding the browser to open");
  }

  @When("^Browser is triggered$")
  public void browser_is_triggered() throws Throwable {
	  System.out.println("Browser is triggered");
  }

  @Then("^check if browser is started$")
  public void check_if_browser_is_started() throws Throwable {
	  System.out.println("Browser is started");
  }
    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
      //code to login
    	System.out.println("Logged in success");
    }

   
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String arg1, String arg2) throws Throwable {
    	 System.out.println(arg1);
    	 System.out.println(arg2);
    	 
    	
    	 
    }
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		System.out.println("Cards are displayed= " + arg1);
	}


    

    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
       List<List<String>>  obj=data.raw();
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      System.out.println(obj.get(0).get(2));
      System.out.println(obj.get(0).get(3));
      System.out.println(obj.get(0).get(4));
      
      
                                                
    	
    }
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
       
    }
    
    @When("^User searched for (.+) vegetables$")
    public void user_searched_for_vegetables(String name) throws Throwable {
    	h=new HomePage(driver);
 	   h.getSearch().sendKeys(name);
    }

    @Then("^Verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
    	c=new CartPage(driver);
    	Assert.assertTrue(c.getProceed().getText().contains(name));
    }
}