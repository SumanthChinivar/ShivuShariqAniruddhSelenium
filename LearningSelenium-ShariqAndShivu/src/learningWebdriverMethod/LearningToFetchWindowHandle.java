package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToFetchWindowHandle {
	public static void main(String[] args) {
		//to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//to launch empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//to launch a web application
		driver.get("https://celloworld.com/");
		
		//to fetch the window handle
		System.out.println(driver.getWindowHandle());
	}
}
