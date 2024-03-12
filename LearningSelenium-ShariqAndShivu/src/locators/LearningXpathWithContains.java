package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathWithContains {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		//clicking on login button using xpath contains
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		//clicking on login button
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();

	}
}
