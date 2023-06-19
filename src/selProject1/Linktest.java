package selProject1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Linktest {

	public static void main(String[] args) throws IOException {
		String[] S = {"--start-maximized","--remote-allow-origins=*"};
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(CO);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link: links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection  con = (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respCode = con.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The failed link is "+link.getText()+" and resp code is "+respCode);
	
		}
		a.assertAll();
	}

}
