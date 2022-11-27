package classess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

WebDriver deriver;
	
	public Cart(WebDriver driver) { 
		
		this.deriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Add to Cart")
	private WebElement AddtoCart;
	@FindBy(linkText = "Proceed to Checkout")
	private WebElement ProceedToCheckout;
	@FindBy(name = "newOrder")
	private WebElement continu;
	@FindBy(linkText = "Confirm")
	private WebElement Confirm;
	@FindBy(linkText = "Return to Main Menu")
	private WebElement ReturnToMainMenu;
	
	//Methods
	public WebElement AddtoCart() {
		AddtoCart.click();
		return AddtoCart;	
	}
	public WebElement ProceedToCheckout() { 
		ProceedToCheckout.click();
		return ProceedToCheckout;	
	}
	public WebElement continu() {
		continu.click();
		return continu;	
	}
	public WebElement Confirm() { 
		Confirm.click();
		return Confirm;	
	}
	public WebElement ReturnToMainMenu() {
        ReturnToMainMenu.click();		
		return ReturnToMainMenu;	
	}
	
}
