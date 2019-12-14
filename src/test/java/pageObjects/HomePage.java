package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Automation.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	By search=By.xpath("//input[@type='search']");
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	public WebElement getSearch(){
		 return driver.findElement(search);
		 }

}
