package selProject1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart 
{

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO); 	
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		checkList(driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");	
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
	}



	public static void checkList (WebDriver driver)
	{
		int i;
		int j = 0;
		String[] veggiList = { "Brocolli", "Cauliflower", "Beetroot", "Tomato" };
		List veggies = Arrays.asList(veggiList);


		List<WebElement>  items = driver.findElements(By.cssSelector("h4.product-name"));

		for (i = 0; i < items.size(); i++)
		{
			String[] formatted =  items.get(i).getText().split("-");
			String  name = formatted[0].trim();

			if (veggies.contains(name))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggiList.length)
				{
					break;
				}
			}
		}

	}
}
