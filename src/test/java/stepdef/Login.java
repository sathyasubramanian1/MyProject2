package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	@Given("user must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   /*System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver=new FirefoxDriver();*/
	    driver.get(string);
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
		
	    driver.findElement(By.id("username")).sendKeys(username);
	    Thread.sleep(5000);
	    driver.findElement(By.id("password")).sendKeys(password);
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Click on Signin button")
	public void click_on_signin_button() {
	    driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to hisor her account")
	public void user_must_be_navigated_to_hisor_her_account() {
	    String actualresult=driver.getCurrentUrl();
	   Assert.assertEquals("https://demo.applitools.com/app.html", actualresult);
	}




}
