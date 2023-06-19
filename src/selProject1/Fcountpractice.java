package selProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fcountpractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO); 	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		String val =  driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).getText();
		System.out.println(val);
	    WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(val);
		
		
		
	}

}
