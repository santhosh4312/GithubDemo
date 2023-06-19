package selProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Relocators {

	public static void main(String[] args) {
		String[] S = {"--start-maximized","--remote-allow-origins=*"};
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement editBox = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(editBox)).getText());
		
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement checkbox = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		
		WebElement rbtn = driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rbtn)).getText());
	}

	

}
