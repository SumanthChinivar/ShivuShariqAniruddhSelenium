package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFullScreenMethod {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.youtube.com/");
		//open the browser in full screen
		driver.manage().window().fullscreen();
		//to quit the browser
		Thread.sleep(2000);
		driver.quit();
	}
}
