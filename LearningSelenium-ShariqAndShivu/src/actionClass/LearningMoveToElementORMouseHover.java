package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMoveToElementORMouseHover {
	public static void main(String[] args) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		
		//creating object of actions class
		Actions action=new Actions(driver);
		//move the cursor on saree element in the nav bar
		WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		action.moveToElement(shoppingCart).perform();

	}
}
