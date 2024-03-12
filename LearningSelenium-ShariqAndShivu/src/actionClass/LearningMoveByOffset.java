package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMoveByOffset {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// to launch a web application
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("MSDhoni");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Point point = driver.findElement(By.xpath("//*[text()='Images']")).getLocation();
		Actions action=new Actions(driver);
		action.moveByOffset(point.x,point.y).click().perform();
	}
}
