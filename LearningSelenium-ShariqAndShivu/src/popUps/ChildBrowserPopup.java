package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
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
		driver.get("https://globalsqa.com/demo-site/frames-and-windows/");
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = driver.getWindowHandles();
		
		for(String windowID:allWindowID) {
			driver.switchTo().window(windowID);
			if(driver.getCurrentUrl().contains("#")) {
				System.out.println("You switched to a new window");
				driver.findElement(By.id("s")).sendKeys("Frames");
				driver.findElement(By.id("s")).sendKeys(Keys.ENTER);
				break;
			}
		}
	}
}
