package practisele;

import org.openqa.selenium.firefox.FirefoxDriver;

public class VIIIAJavaScriptExecutorClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
	}

}
