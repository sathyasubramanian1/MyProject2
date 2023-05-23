package stepdef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
 WebDriver driver;
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get(string);
		
	}

	@When("User clicks on signup button")
	public void user_clicks_on_signup_button() {
	    driver.findElement(By.id("signin2")).click();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   
	  
	   
	}

	@Then("Signup dialogue box should be displayed")
	public void signup_dialogue_box_should_be_displayed() {
		
	boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//boolean actual=  driver.findElement(By.id("signInModalLabel")).isDisplayed();
		//System.out.println("The actual value is " +actual);
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Assert.assertEquals(true, actual);
	
	}

}
