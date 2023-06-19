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

public class Sorted {

	public static void main(String[] args) {
		String[] S = {"--start-maximized","--remote-allow-origins=*"};
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
//		List<String> List2 = List1.stream().map(s->s.getText()).collect(Collectors.toList());
//		List<String> List3 = List2.stream().sorted().collect(Collectors.toList());
//		Assert.assertTrue(List2.equals(List3));
		
		List<String> price;
		
		do{
			List<WebElement>  List1= driver.findElements(By.xpath("//tr/td[1]"));
			price = List1.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label*='Next']")).click();
		}
	
		}
		while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
