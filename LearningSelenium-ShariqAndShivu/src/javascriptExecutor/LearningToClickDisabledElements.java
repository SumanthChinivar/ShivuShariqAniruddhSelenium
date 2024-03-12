package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToClickDisabledElements {
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
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		WebElement jdk= driver.findElement(By.partialLinkText("jdk-8u401-linux-aarch64.rpm"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", jdk);
		
		
		jdk.click();
		
		
		WebElement button = driver.findElement(By.partialLinkText("Download jdk-8u401-linux-aarch64.rpm"));
		jse.executeScript("arguments[0].click();", button);
	}
}
