package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Automation.Base;

public class CartPage extends Base {
	
	public WebDriver driver;
	By product=By.cssSelector("p.product-name");
	
	public CartPage(WebDriver driver){
		this.driver=driver;
	}
	public WebElement getProceed(){
		 return driver.findElement(product);
		 }

}
