package popUps;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningCalendarPopUp {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime time=LocalDateTime.now();
		String month=time.getMonth().toString();
		month=month.substring(0,1)+month.substring(1,month.length()).toLowerCase();
		int date=time.getDayOfMonth();
		int year=time.getYear();
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://www.agoda.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		
		driver.findElement(By.id("textInput")).sendKeys("Bangalore");
		for(;;)
		{
			Thread.sleep(1000);
			if(driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).isDisplayed()) {
				break;
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+date+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+(date+1)+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='SEARCH']")).click();
	}
}
