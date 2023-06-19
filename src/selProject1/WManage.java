package selProject1;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WManage {

	public static void main(String[] args) {
		String[] S = {"--start-maximized","--remote-allow-origins=*"};
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments(S);
//		CO.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		File src = (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copyfile(src,new file("F:\\Santhosh\\screenshot.png"));
	}

}
