package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToEnterDataIntoHiddenField {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		WebElement customGender = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='Male';", customGender);
	}
}
