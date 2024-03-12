package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceBetweenFindElementAndFindElements {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> ele = driver.findElements(By.name("giftcard_2.RecipientName"));
		System.out.println(ele);

		String text = driver.findElement(By.xpath("//strong[text()='Categories']/../..//li")).getText();
		System.out.println(text);
	}
}
