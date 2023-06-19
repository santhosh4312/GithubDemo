package selProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cartpractice 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO); 	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("okayBtn")).click();
//		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input.btn.btn.btn-info.btn-md")).click();
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)
		{
			products.get(i).click();
		}

		driver.findElement(By.partialLinkText("Checkout")).click();}

		

	
		

//	    List<WebElement>  items = driver.findElements(By.cssSelector(".card-footer .btn-info"));	
	    
//	    for(i=0;i<items.size();i++)
//	    {
//	    	if(items.contains(itemList))
//	    	{
//	    		j++;
//	    		driver.findElements(By.cssSelector("button[class*='btn-info']")).get(i).click();
	    		
//	    		if(j<itemList.length)
//	    		{
//	    			break;
//	    		}
//	    	}
//    }
		
	
	}


