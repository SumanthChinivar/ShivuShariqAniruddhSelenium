package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningSendKeys2 {
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
		driver.get("https://demowebshop.tricentis.com/");

		//locating search field
		driver.findElement(By.id("small-searchterms")).sendKeys("Smartphone");
		Thread.sleep(1000);
		driver.findElement(By.id("small-searchterms")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		//creating action object
//		Actions action=new Actions(driver);
//		action.sendKeys(search,"smartphone").perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
	}
}
