package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LearningAlertPopup {
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
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame(0);
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String data = alert.getText();
		System.out.println(data);
		alert.accept();
	}
}
