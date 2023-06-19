package selProject1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Sorted1 {

	public static void main(String[] args) {
		String[] S = {"--start-maximized","--remote-allow-origins=*"};
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredrows = rows.stream().filter(veggies->veggies.getText().contains("Rice")).
				collect(Collectors.toList());
		
		Assert.assertEquals(rows.size(), filteredrows.size());
		
		
	}

}
