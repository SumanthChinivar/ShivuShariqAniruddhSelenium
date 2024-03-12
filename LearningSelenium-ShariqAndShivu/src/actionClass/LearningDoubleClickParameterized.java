package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDoubleClickParameterized {
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
		driver.get("https://demoapp.skillrary.com/");
		
		Actions action=new Actions(driver);
		WebElement selenium = driver.findElement(By.linkText("Selenium"));
		action.click(selenium).perform();
		
		WebElement plus = driver.findElement(By.id("add"));
		action.doubleClick(plus).perform();
	}
}