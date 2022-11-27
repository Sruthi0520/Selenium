package classess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fish {
	
	WebDriver deriver;
	
	public Fish(WebDriver driver) { 
		
		this.deriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "div:nth-child(2) div:nth-child(1) div:nth-child(1) a:nth-child(1) > img:nth-child(1)")
	private WebElement fishpage;
	@FindBy(xpath = "//body/div[@id='Header']/div[@id='QuickLinks']/a[1]/img[1]")
	private WebElement fishlink;
	@FindBy(xpath = "//body/div[@id='Content']/div[@id='Main']/div[@id='MainImage']/div[@id='MainImageContent']/map[1]/area[2]")
	private WebElement fishimage;
	
	//Type 1
	@FindBy(xpath = "//a[contains(text(),'FI-SW-01')]")
	private WebElement Angelfish;
	@FindBy(xpath = "//a[contains(text(),'EST-1')]")
	private WebElement 	LargeAngelfish;
	@FindBy(xpath = "//a[contains(text(),'EST-2')]")
	private WebElement SmallAngelfish;
	//Type 2
	@FindBy(xpath = "//a[contains(text(),'FI-SW-02')]")
	private WebElement TigerShark;
	@FindBy(css = "table:nth-child(2) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) > a:nth-child(1)")
	private WebElement ToothlessTigerShark;
	//Type 3
	@FindBy(xpath = "//a[contains(text(),'FI-FW-01')]")
	private WebElement 	Koi;
	@FindBy (xpath = "//a[contains(text(),'EST-4')]")
	private WebElement SpottedKoi;
	@FindBy(xpath = "//a[contains(text(),'EST-5')]")
	private WebElement SpotlessKoi;
	//Type 4
	@FindBy(xpath = "//a[contains(text(),'FI-FW-02')]")
	private WebElement Goldfish;
	@FindBy(xpath = "//a[contains(text(),'EST-20')]")
	private WebElement AdultMaleGoldfish;
	@FindBy(xpath = "//a[contains(text(),'EST-21')]")
	private WebElement AdultFemaleGoldfish;
	
	//REturn fishPage links
	@FindBy(linkText = "Return to Main Menu")
	private WebElement ReturnToMainMenu;
	//Return Fish
	@FindBy(linkText = "Return to FISH")
	private WebElement ReturnToFish;
	@FindBy(linkText = "Return to FI-SW-01")
	private WebElement ReturnToFISW01;
	@FindBy(xpath = "//a[contains(text(),'Return to FI-SW-02')]")
	private WebElement ReturnToFISW02;
			
	//Methods
	public WebElement fishpage() { 
		fishpage.click();
		return fishpage;	
	} 
	public WebElement fishlink() { 
		fishlink.click();
		return fishlink;	
	} 
	public WebElement fishimage() { 
		fishimage.click();
		return fishimage;	
	}
	
	//Fish Methods Type 1
	public WebElement Angelfish() { 
		Angelfish.click();
		return Angelfish;
	}	
	public WebElement LargeAngelfish() {
		LargeAngelfish.click();
		return LargeAngelfish;
	}
	public WebElement SmallAngelfish() { 
		SmallAngelfish.click();
		return SmallAngelfish;	
	}
	//Type 2
	public WebElement TigerShark() { 
		TigerShark.click();
		return TigerShark;	
	}
	public WebElement ToothlessTigerShark() { 
		ToothlessTigerShark.click();
		return ToothlessTigerShark;	
	}
	//Type 3
	public WebElement Koi() { 
		Koi.click();
		return Koi;	
	}
	public WebElement SpottedKoi() { 
		SpotlessKoi.click();
		return SpottedKoi;	
	}
	public WebElement SpotlessKoi() { 
		SpotlessKoi.click();
		return SpotlessKoi;	
	}
	//Type 4
	public WebElement Goldfish() { 
		Goldfish.click();
		return Goldfish;	
	}
	public WebElement AdultMaleGoldfish() { 
		AdultMaleGoldfish.click();
		return AdultMaleGoldfish;	
	}
	public WebElement AdultFemaleGoldfish() {
		AdultFemaleGoldfish.click();
		return AdultFemaleGoldfish;	
	}
	//Return Fish Methods
	public WebElement ReturnToMainMenu() { 
		ReturnToMainMenu.click();
		return ReturnToMainMenu;
	}
	public WebElement ReturnToFish() { 
		ReturnToFish.click();
		return ReturnToFish;
	}
	public WebElement ReturnToFISW01() { 
		ReturnToFISW01.click();
		return ReturnToFISW01;
	}
	public WebElement ReturnToFISW02() {
		ReturnToFISW02.click();
		return ReturnToFISW02;
	}	
	
	
}
