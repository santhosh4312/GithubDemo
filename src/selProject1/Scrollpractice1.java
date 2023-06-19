package selProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrollpractice1 {

	public static void main(String[] args) {
	int t = 0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		
		for(int i=0;i<values.size();i++)
		{
//			t = Integer.parseInt(values.get(i).getText());
			t = t + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(t);
	}

}
