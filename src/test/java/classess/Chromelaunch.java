package classess;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelaunch {

private static WebDriver driver;


public static WebDriver link(){
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	return driver;
}  

public static WebDriver close() { 
	
	driver.quit();
	return driver;
	
}
public static WebDriver back() { 
	
	driver.navigate().back();
	return driver;
	
}



//public static WebDriver openBrowser() {
//	driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
//	return null;
//}


}


