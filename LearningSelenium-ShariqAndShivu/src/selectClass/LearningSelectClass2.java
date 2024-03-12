package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectClass2 {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		// maximize the screen
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Books")).click();

		WebElement dropdown = driver.findElement(By.name("products-pagesize"));
		Select select=new Select(dropdown);
		select.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4");
	}
}
