package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class LearningQuitMethod {
	public static void main(String[] args) {

		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();

		// to launch a web application
		driver.get("https://purple.com/");
		
		//to quit the browser
		driver.quit();
	}
}
