package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClearMethod {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		//entering data into search text field
		driver.findElement(By.name("q")).sendKeys("Monika");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
	}
}
