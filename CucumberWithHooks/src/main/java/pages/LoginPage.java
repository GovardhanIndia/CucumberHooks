package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.*;
import lib.selenium.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement eleUserName;
	
	@FindBy(id = "password")
	WebElement elePassword;
	
	@FindBy(className = "decorativeSubmit")
	WebElement eleSubmit;
	
	@FindBy(linkText = "CRM/SFA")
	WebElement crmSFA;
	
	@And("enter the username as (.*)")
	public LoginPage enterUserName(String userName) {
		eleUserName.sendKeys(userName);
		return this;
	}
	
	@And("enter the password as (.*)")
	public LoginPage enterPassword(String password) {
		elePassword.sendKeys(password);
		return this;
	}
	
	@And("click on login button")
	public LoginPage clickOnLoginButton() {
		eleSubmit.click();
		return this;
	}
	
	@And("click on CRMSFA")
	public HomePage clickOnCRMSFA() {
		reportSteps("Login Status", "Pass");
		crmSFA.click();
		return new HomePage();
	}

}

