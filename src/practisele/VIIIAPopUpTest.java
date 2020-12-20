package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VIIIAPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//if popup comes then close it and type iphone
		//if no popup then type iphone directly
		// both case should work
		
		Thread.sleep(3000);  // bcz popUp takes some time to appear on screen so sleep after website opens
		
		List<WebElement> popUp = driver.findElements(By.linkText("x"));
		
		if (popUp.size()>0) {
			popUp.get(0).click();    /// see driver.findElement(By.)
		}
		
		// there is no need of else bcz .... just think a bit
		
		driver.findElement(By.id("search-key")).sendKeys("iphone");
		
	}

}
