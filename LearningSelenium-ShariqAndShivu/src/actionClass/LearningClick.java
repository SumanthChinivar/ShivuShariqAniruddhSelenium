package actionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Learning click function
public class LearningClick {
	//learning pushing
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
		driver.get("https://sixeastern.com/");

		Thread.sleep(5000);
		Actions action=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//h5[text()='media relations']"));
		WebElement target = driver.findElement(By.xpath("//div[@data-scrollto='results']"));
		action.click(target).perform();
	}
}
