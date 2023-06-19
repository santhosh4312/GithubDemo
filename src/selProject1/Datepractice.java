package selProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Datepractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		
		ChromeOptions CO = new ChromeOptions();
		
		CO.addArguments(S);
		
		WebDriver driver = new ChromeDriver(CO);
		
//		driver.manage().window().fullscreen();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		
		Actions act =new Actions(driver);
		
		act.moveToElement(driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']"))).build().perform();
		
//		driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();
		
		List<WebElement> dlist = driver.findElements(By.className("flatpickr-day"));
		
		int count = driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			
			if (text.equalsIgnoreCase("20"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				
				break;
			}
		}
		
		
		
		
	}

}
