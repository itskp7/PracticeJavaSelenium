package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NineteenJulWebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//// All 20 or 21 links printing
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		
		//for (int i=0; i<allLinks.size(); i++) {
		//System.out.println(allLinks.get(i).getText());
		
		
		
		//// Only 3 links by WebElement
		
		WebElement footer = driver.findElement(By.id("fsl"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		
		
		
		///// Only 3 links by not creating WebElement by XPATH 
		
		//List<WebElement> LeftFooter = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		//System.out.println(LeftFooter.size());
		
		//for (int i=0; i<LeftFooter.size(); i++) {
		//	System.out.println(LeftFooter.get(i).getText());
		//}
	}
}
