package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotOfNextButton {
	public static void main(String[] args) throws IOException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
		Actions action=new Actions(driver);
		action.moveToElement(next).perform();
		File src=next.getScreenshotAs(OutputType.FILE);
		File taget=new File("./snapShots/NextButton.png");
		FileHandler.copy(src, taget);
	}
}
