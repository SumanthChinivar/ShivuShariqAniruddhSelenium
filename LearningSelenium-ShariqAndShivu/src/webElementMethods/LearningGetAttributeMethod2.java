package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetAttributeMethod2 {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		// to enter the value
		driver.findElement(By.name("q")).sendKeys("Watch");
		//to fetch the value
		String enteredText=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(enteredText);
	}
}
