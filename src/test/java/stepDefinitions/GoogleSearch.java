package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	WebDriver driver;
	
	
	@Given("I am on google search page")
	public void i_am_on_google_search_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	}
    
	@When("I enter {string} in search field and click enter")
	public void i_enter_in_search_field_and_click_enter(String string) {
	    driver.findElement(By.name("username")).sendKeys(string);
	}
	
	@When("I enter {string}")
	public void i_enter(String string) throws InterruptedException {
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(string);
		driver.findElement(By.name("signon")).click();
	}

}
