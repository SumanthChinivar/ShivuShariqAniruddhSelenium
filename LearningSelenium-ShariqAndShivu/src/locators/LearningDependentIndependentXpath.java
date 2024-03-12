package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDependentIndependentXpath {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		//locating the element using dep and ind xpath and click on it
		driver.findElement(By.xpath("//strong[text()='Featured products']/../..//a[text()='$25 Virtual Gift Card']")).click();
		
	}
}
