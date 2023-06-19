package selProject1;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrollpractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		List <WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int i ;
		for(i = 0; i<values.size();i++)
		{
			values.get(i);
		}
		System.out.println("no.of rows :"+i);
		
		List <WebElement> colms = driver.findElements(By.xpath("//tbody/tr/th"));
		
		int j;
		for( j=0 ;j<colms.size();j++)
		{
			colms.get(j);
		}
		System.out.println("no.of colms :"+j);
		
	   
		WebElement cols = driver.findElement(By.xpath("//tbody/tr[3]"));
		System.out.print(cols.getText());
		
	}

}
