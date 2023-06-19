package selProject1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Optional;

import org.openqa.selenium.By;


public class MobileEmulatorTest {

	public static void main(String args[]) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse workspace for selenium\\seleniumProject\\Drivers\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 55, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Library")).click();
	}
}
