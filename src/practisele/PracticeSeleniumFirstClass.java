package practisele;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe"); // have to type this because its a applcation and not a jar
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("rfegrgdvse");
		driver.findElement(By.id("pass")).sendKeys("cewfwgvsdcxsa");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		

	}

}
