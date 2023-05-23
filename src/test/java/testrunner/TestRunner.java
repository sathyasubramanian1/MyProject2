package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Selvaraha\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature", glue= {"stepdef"},
plugin= {"pretty","json:target/Htmlreports.json"}, monochrome=true,dryRun=true)
public class TestRunner {

}
