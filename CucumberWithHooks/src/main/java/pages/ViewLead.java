package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.*;
import lib.selenium.WebDriverServiceImpl;

public class ViewLead extends WebDriverServiceImpl {
	public ViewLead() {
		PageFactory.initElements(driver, this);
	}
	
	boolean flag = false;
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleFirstName;
	
	@When("Validate the first name as (.*)")
	public void validateFirstName(String firstName) {
		String appFristName = eleFirstName.getText();
		
		if(appFristName.equals(firstName)) {
			flag = true;
		}
	}
	
	@Then("Lead Created Successfully")
	public ViewLead leadCreation() {
		if(flag==true) {
			reportSteps("Lead Created Successfully", "Pass");
		}
		return this;
	}

}
