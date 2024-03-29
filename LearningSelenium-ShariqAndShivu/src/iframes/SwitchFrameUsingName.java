package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrameUsingName {
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
		driver.get("file:///C:/Users/user/Downloads/iframe.html");

		driver.switchTo().frame("frame2");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
}
}
