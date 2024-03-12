package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalenderPopup {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime time=LocalDateTime.of(2024, 4, 2, 10, 00);
		int date=time.getDayOfMonth();
		String month=time.getMonth().toString();
		month=month.substring(0,1)+month.substring(1,month.length()).toLowerCase();
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
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SEARCH")).click();
		
		
		
	}
}
