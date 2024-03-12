package assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	@Test
	public void demo() {
		String url = "https://demowebshop.tricentis";
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
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(driver.getCurrentUrl(), url,"DWS is not launched");
		System.out.println("DWS is launched");
		
		driver.findElement(By.linkText("Register")).click();
		softAssert.assertAll();
	}
}
