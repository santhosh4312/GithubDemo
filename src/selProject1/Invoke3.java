package selProject1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Invoke3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
//		String[] S = {"--start-maximized","--remote-allow-origins=*"};
//		ChromeOptions CO = new ChromeOptions();
//		CO.addArguments(S);
		
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver(CO);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("santhosh");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Santhosh123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("santhoshch");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("santhoshchelimela10@gmail.com");
//      driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//      driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("santhoshchelimela10@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9978965321");
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        String password3 = getPassword(driver);
        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password3);
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
  //      Thread.sleep(2000);
//        System.out.println(driver.findElement(By.tagName("P")).getText());
 //       Assert.assertEquals(driver.findElement(By.tagName("P")).getText(), "You are successfully logged in.");
 //       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello rahul,");
//		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//		driver.close();
		
	}
	
	public static String getPassword(WebDriver driver)
	{
		String passwordText = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		String[] passwordSplit = passwordText.split("'");
		String password = passwordSplit[1];
		String[] passwordSplit1 = password.split("'");
		String password1 = passwordSplit1[0];
		return password1;
		
		
	}

}
