package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetRectMethod {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.linkText("Register")).getRect();
		System.out.println(rect.height);
		System.out.println(rect.getWidth());
		System.out.println(rect.y);
		System.out.println(rect.x);
	}
}
