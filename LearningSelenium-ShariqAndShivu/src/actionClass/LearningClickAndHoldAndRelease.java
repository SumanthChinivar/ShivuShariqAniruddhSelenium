package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningClickAndHoldAndRelease {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		//locating the elements
		WebElement washington=driver.findElement(By.id("box3"));
		WebElement unitedStates=driver.findElement(By.id("box103"));
		
		//creating object of action class
		Actions action=new Actions(driver);
		//perform click and hold, release
		action.moveToElement(washington).clickAndHold().moveToElement(unitedStates).release().perform();
	}
}
