package selProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fnested {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		String[] S = { "--start-maximized", "--remote-allow-origins=*" };
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		WebDriver driver = new ChromeDriver(CO); 	
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		
	}

}
