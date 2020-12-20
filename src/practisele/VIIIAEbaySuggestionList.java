package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VIIIAEbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		Thread.sleep(3000);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(searchResults.size());
		
		for (WebElement KP: searchResults) {
			System.out.println(KP.getText());
		}
		
		
	}

}
