package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NineteenJulGoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("canada");
		Thread.sleep(1000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(searchResult.size());
		
		/*for (int i=0; i<searchResult.size(); i++) {
			System.out.println(searchResult.get(i).getText());
		}*/
		
		///// DIFFERENT type of FOR loop ((((GOOD ONE))))
		
		for (WebElement a : searchResult) {
			System.out.println(a.getText());
			
		}

	}

}
