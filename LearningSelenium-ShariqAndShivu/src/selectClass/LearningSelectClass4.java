package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectClass4 {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://demoapp.skillrary.com/");
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select=new Select(dropdown);
		select.selectByValue("99");
		select.selectByIndex(0);
		select.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
//		List<WebElement> allSelected = select.getAllSelectedOptions();
//		for(WebElement ele:allSelected) {
//			System.out.println(ele.getText());
//		}
		
//		List<WebElement> allOptions = select.getOptions();
//		for(WebElement ele:allOptions) {
//			System.out.println(ele.getText());
//		}
		
//		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("99");
		Thread.sleep(1000);
		select.deselectByVisibleText("INR 300 - INR 399 ( 1 )");
	}
}
