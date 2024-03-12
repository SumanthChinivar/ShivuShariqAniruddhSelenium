package POM;

import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningStaleElementException {
	@Test
	public void reister() {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
		
		//storing on register link
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		//click on register link
		registerLink.click();
		//refreshing web page
		driver.navigate().refresh();
		//clicking on register link again
		registerLink.click();
	}
}
