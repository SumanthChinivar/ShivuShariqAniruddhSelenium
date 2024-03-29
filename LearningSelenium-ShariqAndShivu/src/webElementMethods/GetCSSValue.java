package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		//to fetch css value
		String font=driver.findElement(By.xpath("//input[@value='Search']")).getCssValue("font");
		System.out.println(font);
	}
}
