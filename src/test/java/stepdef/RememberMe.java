package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RememberMe {
	WebDriver driver;
	@Given("User should be in the homepage by clicking the url {string}")
	public void user_should_be_in_the_homepage_by_clicking_the_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get(string);
	}

	@When("user clicks the remember me feature")
	public void user_clicks_the_remember_me_feature() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Remember me check box should be selected")
	public void remember_me_check_box_should_be_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
