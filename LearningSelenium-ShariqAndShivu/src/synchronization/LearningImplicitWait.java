package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningImplicitWait {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.shoppersstack.com/");
		// maximize the screen
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// click on login
		driver.findElement(By.id("loginBtn")).click();
	}
}
