package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAuthenticationPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			
	}
}
