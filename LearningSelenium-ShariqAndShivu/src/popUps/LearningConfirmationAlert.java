package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningConfirmationAlert {
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
		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		WebElement login = driver.findElement(By.partialLinkText("Login"));
		Actions action=new Actions(driver);
		action.moveToElement(login).perform();
		driver.findElement(By.linkText("Agent Portal")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	}
}
