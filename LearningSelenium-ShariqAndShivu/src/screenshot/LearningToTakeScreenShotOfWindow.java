package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningToTakeScreenShotOfWindow {
	public static void main(String[] args) throws IOException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser
		WebDriver driver = new ChromeDriver();
		// to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		// maximize the screen
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./snapShots/SS1.jpeg");
		FileHandler.copy(src, target);
	}
}
