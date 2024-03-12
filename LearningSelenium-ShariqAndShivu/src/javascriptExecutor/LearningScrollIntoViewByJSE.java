package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScrollIntoViewByJSE {
		public static void main(String[] args) throws InterruptedException {
			// to set and path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// to launch empty browser--Upcasting
			WebDriver driver = new ChromeDriver();
			// maximize the browser
			driver.manage().window().maximize();
			// adding implicit wait
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			// launching the web site
			driver.get("https://omayo.blogspot.com/");
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('alert1').scrollIntoView(arguments[0]);",true);
		}
}
