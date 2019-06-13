package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class HomePage extends WebDriverServiceImpl {
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Create Lead")
	WebElement eleCreateLead;
	
	@And("click on Create Leads Tab")
	public CreateLead clickCreateLead() {
		eleCreateLead.click();
		return new CreateLead();
	}

}
