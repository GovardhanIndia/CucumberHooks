package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import cucumber.api.java.*;
import cucumber.api.Scenario;

import lib.selenium.WebDriverServiceImpl;

public class Hooks extends WebDriverServiceImpl {
	
	@Before
	public void beforeScenario(Scenario sc) {
		startReport();
		startTestCase(sc.getName(), sc.getId());		
		startTestModule("Leads for Leaftaps");
		test.assignAuthor("Smoke");
		test.assignCategory("Govardhan");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webDriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webDriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void afterScenario(Scenario sc) {
		closeActiveBrowser();
		endResult();
	}

}
