package selProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\welcome\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
		)

	}

}
