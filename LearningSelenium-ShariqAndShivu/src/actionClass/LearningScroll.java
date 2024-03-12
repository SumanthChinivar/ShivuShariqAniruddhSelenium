package actionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningScroll {
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
		driver.get("https://sarahfatmi.com/en");

		WebElement i = driver.findElement(By.cssSelector("ellipse[cx='190.8']"));

		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ellipseElement = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ellipse[cx='190.8']")));

		Actions action = new Actions(driver);
		action.pause(Duration.ofSeconds(10)).moveToElement(i,0,50).perform();
	}
}
