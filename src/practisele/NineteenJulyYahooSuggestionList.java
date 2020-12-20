package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NineteenJulyYahooSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("canada");
		Thread.sleep(1000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(searchResult.size());
		
		/*for (int i=0; i<searchResult.size(); i++) {
			System.out.println(searchResult.get(i).getText());
		}*/	
		
		for (WebElement a:searchResult) {
			System.out.println(a.getText());
		}

	}

}
