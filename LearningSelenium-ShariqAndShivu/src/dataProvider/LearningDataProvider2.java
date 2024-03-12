package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider2 {
	@DataProvider
	public String[][] readingData() {
		String[][] values = { { "sumanthchinivar16@gmail.com", "Rowdy@123" },
				{ "komalgupta121@gmail.com", "Shakuni123.@" } };
		return values;
	}

	@Test(dataProvider = "readingData")
	public void login(String[] data) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(data[0]);
		driver.findElement(By.id("Password")).sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
