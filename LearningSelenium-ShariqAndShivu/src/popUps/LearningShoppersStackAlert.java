package popUps;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningShoppersStackAlert {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://www.shoppersstack.com");
		Actions action=new Actions(driver);
		
		for(;;) {
		try {
			action.sendKeys(Keys.PAGE_DOWN).perform();
		}catch(NoSuchElementException e) {
			action.sendKeys(Keys.END).perform();
		}
		if(driver.findElement(By.linkText("Swagger documentation")).isDisplayed()) {
			break;
		}
		}
		driver.findElement(By.linkText("Swagger documentation")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.sendKeys("admin");
		alert.sendKeys("admin");
		alert.accept();
	}
}
