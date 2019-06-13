package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends WebDriverServiceImpl {
	public CreateLead() {		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCompName;
	
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(name = "submitButton")
	WebElement eleSubmit;
	
	@And("Enter Company Name as (.*)")
	public CreateLead enterCompanyName(String compName) {
		eleCompName.sendKeys(compName);
		return this;
	}
	
	@And("Enter First Name as (.*)")
	public CreateLead enterFirstName(String firstName) {
		eleFirstName.sendKeys(firstName);
		return this;
	}
	
	@And("Enter Last Name as (.*)")
	public CreateLead enterLastName(String lastName) {
		eleLastName.sendKeys(lastName);
		return this;
	}
	
	@And("click on create lead")
	public ViewLead clickOnCreateLead() {
		eleSubmit.click();
		return new ViewLead();
	}

	
}
