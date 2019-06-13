package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = {"src/test/java/feature/CLFeature.feature"}, glue = {"steps", "pages"})
@RunWith(Cucumber.class)
public class Runner {

}
