package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckFunctionalityOfShoppingCart {
	@Test
	public void shoppingcart() {
		String expectedUrl = "https://demowebshop.tricentis.com/cart";

		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Shoping cart link is working correctly");
		} else
			System.out.println("Shoping cart link is not working");

	}
}
