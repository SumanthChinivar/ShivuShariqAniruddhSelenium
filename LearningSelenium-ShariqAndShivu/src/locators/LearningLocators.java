package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		//to fetch the text
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//th[@scope='row'] | //td[contains(text(),'%')]"));
		System.out.println(elements);
		int count=1;
		for(WebElement ele:elements) {
			if(count %2 ==0)
			System.out.println(ele.getText());
			else 
			System.out.print(ele.getText() + " ");
			count++;
			
		}
		
	}
}
