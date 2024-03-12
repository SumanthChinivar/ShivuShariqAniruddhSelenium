package learningWebdriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSwitchToWindow {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("file:///C:/Users/user/Downloads/TestPage.html");
		//click on element using xpath
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(6000);
		Set<String> allWindowID = driver.getWindowHandles();
		for(String windowID:allWindowID) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
		}
	}
}
