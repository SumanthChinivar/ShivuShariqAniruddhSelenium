package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigateToMethod {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.myntra.com/");
		// maximize the screen'
		driver.manage().window().maximize();
		//navigating to an url
		driver.navigate().to("https://www.flipkart.com/");
	}
}
