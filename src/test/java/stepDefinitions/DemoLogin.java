package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classess.Chromelaunch;
import classess.login2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoLogin {

	WebDriver driver;
	WebDriver login;
	login2 c;

	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		login = Chromelaunch.link();

	}

//	@When("I enter (.*) and (.*) ")
//	public void i_enter_and(String string, String string2) throws InterruptedException {
//     c = new login2(driver); 
//     c.loginvaliduser(string, string2);
//	}
      
	@When("I enter as {string} and {string}")
	public void i_enter_username_as(String string, String string2) {
	    c = new login2(driver);
	    c.enterusername(string);
	    c.enterpassword(string2);
	}
	@And("I enter password as {string}")
	public void i_enter_password_as(String string) {
		c.enterpassword(string);
	}
	    
	
//	@When("I enter username")
//	public void i_enter_username() {
//		c = new login2(driver);
//		c.enterusername();
//		//driver.findElement(By.name("username")).sendKeys("sruthi");
//	}
//	
//
//	@When("I enter password")
//	public void i_enter_password() {
//	   //c.enterpassword();
//		
//	}
//
//	@And("I click on the login button")
//	public void i_click_on_the_login_button() {
//		//c.signon();
//		c.
//	}

	@Then("I am taken to the home page")
	public void i_am_taken_to_the_home_page() {
		boolean web = driver.findElement(By.id("WelcomeContent")).isDisplayed();
		if (web) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");

		}
	}

}
