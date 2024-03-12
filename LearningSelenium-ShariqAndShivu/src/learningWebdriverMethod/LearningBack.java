package learningWebdriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningBack {
	public static void main(String[] args) throws MalformedURLException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.myntra.com/");
		// maximize the screen'
		driver.manage().window().maximize();
		// navigating to an url
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		//using back method
		driver.navigate().back();
	}
}
