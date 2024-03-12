package actionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningSendKeys {
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
		driver.get("https://celloworld.com/");
		
		//creating object of actions class
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.id("Search-In-Modal-Utility"));
		action.sendKeys(search,"travel-mug").pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(1000);
//		action.sendKeys(search,Keys.ESCAPE).perform();
	}
}
