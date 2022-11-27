package classess;

//import java.sql.Driver;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Signin {
	
WebDriver deriver;
	
	public Signin(WebDriver driver) { 
		
		this.deriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "username")
	private WebElement enterusername;
	
	@FindBy(name = "password")
	private WebElement enterpassword;
	
	@FindBy(name = "signon")
	private WebElement signon;
	
		
	
	public void enterusername(String string) {
		enterusername.sendKeys(string);
		//deriver.findElement(enterusername).sendKeys(string);
	}
	
	public void enterpassword(String string2) {
		enterpassword.clear();
		enterpassword.sendKeys(string2);
//		deriver.findElement(enterpassword).sendKeys(string2);
//		deriver.findElement(enterpassword).clear();
//		deriver.findElement(enterpassword).sendKeys(string2);
	}
//	public void enterpassword(int password) {
//		//enterpassword.clear();
//		//enterpassword.sendKeys(password);
//		String s=String.valueOf(password);
//		deriver.findElement(enterpassword).sendKeys(s);
//		deriver.findElement(enterpassword).clear();
//		deriver.findElement(enterpassword).sendKeys(s);
//	}
    public void signon() {
		signon.click();
    	//deriver.findElement(signon).click();
	}
    
    public void loginvaliduser(String username , String password) {
    	enterusername.sendKeys(username);
    	enterpassword.sendKeys(password);
//    	deriver.findElement(enterusername).sendKeys(username);
//    	deriver.findElement(enterpassword).sendKeys(password);
//    	deriver.findElement(signon).click();
    }

	
}
