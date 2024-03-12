package learningWebdriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSetSize {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.flipkart.com/");
		//to set size 
		Dimension d=new Dimension(200, 300);
		//pass the value to setSize method
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		//quit the browser
		driver.quit();
		
	}
}
