package practisele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractPrintTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> drop = driver.findElements(By.xpath("((//aside[@class='widget'])[1]/ul/li/a)[1]"));
		System.out.println(drop.size());
		
		for (WebElement k : drop) {
			
			System.out.println(k.getText());
		}
		//driver.findElement(By.xpath("(//aside[@class='widget'])[1]/ul/li/a")).getText();

	}

}
