package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfErrorMessage {
	public static void main(String[] args) throws IOException, InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.shoppersstack.com/");
		// maximize the screen
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// click on login
		driver.findElement(By.id("loginBtn")).click();
		
		//enter data into email text field
		driver.findElement(By.id("Email")).sendKeys("sumanth@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		WebElement message=driver.findElement(By.xpath("//div[contains(@class,'top-right')]"));
		Thread.sleep(1000);
		File src=message.getScreenshotAs(OutputType.FILE);
		File target=new File("./snapShots/ShoppersStack.png");
		FileHandler.copy(src, target);
	}
}
