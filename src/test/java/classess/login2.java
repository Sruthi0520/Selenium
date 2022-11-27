package classess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	
WebDriver deriver;
	
	public login2(WebDriver driver) { 
		
		this.deriver = driver;
		//PageFactory.initElements(driver, this);
		
	}
	
//	@FindBy(name = "username")
//	private WebElement enterusername;
//	
//	@FindBy(name = "password")
//	private WebElement enterpassword;
//	
//	@FindBy(name = "signon")
//	private WebElement signon;
//	
//	public WebElement enterusername() {
//		enterusername.sendKeys();
//		return enterusername;
//		
	By enterusername = By.xpath("/driver.findElement(By.xpath(\"\"))");
	By enterpassword = By.xpath("//body/div[@id='Content']/div[@id='Catalog']/form[1]/p[2]/input[2]");
	By signon = By.xpath("//body/div[@id='Content']/div[@id='Catalog']/form[1]/input[1]");
	
	
	
//	public WebElement enterpassword() {
//		enterpassword.clear();
//		enterpassword.sendKeys();
//		return enterpassword;
//
//	}
//	
//	 public void loginvaliduser(String username , String password) {
//	    	enterusername.sendKeys(username);
//	    	enterpassword.sendKeys(password);
//
//	    }
//
//	
//    public WebElement signon() {
//		signon.click();
//    	return signon;
//	}
//    
//    public void enterusername(String string) {
//		enterusername.sendKeys(string);
//		
//		
//	}
//	
//	public void enterpassword(String string) {
//		enterpassword.clear();
//		enterpassword.sendKeys(string);
//		
//
//	}
	
	public void enterusername(String username) {
		//enterusername.sendKeys(username);
		deriver.findElement(enterusername).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		//enterpassword.clear();
		//enterpassword.sendKeys(password);
		deriver.findElement(enterpassword).sendKeys(password);
		deriver.findElement(enterpassword).clear();
		deriver.findElement(enterpassword).sendKeys(password);
	}
    
    
	

}
