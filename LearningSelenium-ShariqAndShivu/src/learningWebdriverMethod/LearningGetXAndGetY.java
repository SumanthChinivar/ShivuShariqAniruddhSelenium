package learningWebdriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetXAndGetY {
	public static void main(String[] args) throws InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		ChromeDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://www.myntra.com/");
		// maximize the screen'
		driver.manage().window().maximize();
		// to fecth the position
		int x= driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x);
		System.out.println(y);
		// calling sleep
		Thread.sleep(2000);
		// close the browser
		driver.quit();
	}
}
