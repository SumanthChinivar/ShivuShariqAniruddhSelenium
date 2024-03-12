package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSizeMethod {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.flipkart.com/");
		//to maximize
		driver.manage().window().maximize();
		//to fetch the size of the window
		System.out.println(driver.manage().window().getSize());
		//to close the browser
		driver.quit();
	}
}
