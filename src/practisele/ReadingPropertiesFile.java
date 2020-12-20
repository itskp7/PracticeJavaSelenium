package practisele;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;
		
		// how to read properties file (3 Steps)
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Selenium_Workspace\\PracticeJavaSelenium\\"
				+ "src\\practisele\\prconfig.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("no browser value is given");
		}
		
		driver.get(prop.getProperty("url"));
		//only displaying below line (the VALUE IS TAKEN FROM PROP FILE FOR LOCATOR TOO)
		driver.findElement(By.xpath(prop.getProperty("freecrm_cloudslogan_xpath"))).isDisplayed();
		
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Test 1 Test 1']//preceding-sibling::td//div")).click();
		//below does not work
		//driver.findElement(By.xpath("//td[text()='Test 1 Test 1']//preceding-sibling::td//input[@type='checkbox']")).click();
		
		
		
		
		
		
		
		
		
		
		// how to write into the properties file (also three steps but one is defined on top)
		
		/*prop.setProperty("Krunal", "Prajapati");  
		System.out.println(prop.getProperty("Krunal"));
		
		// This will only set into the memory but to print in the text/properties file below two lines
		
		FileOutputStream ot = new FileOutputStream("C:\\Selenium_Workspace\\PracticeJavaSelenium\\"
				+ "src\\practisele\\prconfig.properties");
		prop.store(ot, "adding to properties file");*/
		
	}

}
