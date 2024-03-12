package learningWebdriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		//to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//to launch empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//to launch a web application
		driver.get("file:///C:/Users/user/Downloads/TestPage.html");
		
		//to click on click here button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//creating a delay
		Thread.sleep(5000);
		
		//to fetch window handles
		Set<String> allWindowID=driver.getWindowHandles();
		System.out.println(allWindowID);
	}
}
