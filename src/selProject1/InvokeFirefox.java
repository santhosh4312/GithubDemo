package selProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.deccanchronicle.com");
		
	}

}
