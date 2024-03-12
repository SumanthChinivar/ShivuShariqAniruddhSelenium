package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFindElementsMethod {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		//to locate multiple web elements of nav bar
		List<WebElement> navBar = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		for(WebElement ele:navBar) {
			System.out.println(ele.getText());
		}
	}
}
