package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NineteenJulDropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.canada.ca/en/department-finance/economic-response-plan.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/button[1]")).click();
		
		WebElement menu = driver.findElement(By.partialLinkText("MENU"));
		List<WebElement> allLinks = menu.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement a:allLinks) {
			System.out.println(a.getText());
		}
		
	}

}
