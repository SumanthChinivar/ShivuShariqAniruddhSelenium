package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMaximize {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();

		// to launch a web application
		driver.get("https://www.youtube.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//close the browser
		driver.quit();
	}
}
