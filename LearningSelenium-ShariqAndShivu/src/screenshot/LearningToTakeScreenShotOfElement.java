package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningToTakeScreenShotOfElement {
	public static void main(String[] args) throws IOException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement navBar=driver.findElement(By.xpath("//ul[@class='top-menu']"));
		File src=navBar.getScreenshotAs(OutputType.FILE);
		File target=new File("./snapShots/DWS.png");
		FileHandler.copy(src, target);
	}
}
