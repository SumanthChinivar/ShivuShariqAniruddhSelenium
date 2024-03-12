package learningWebdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTitle {
	public static void main(String[] args) {
		//to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//to launch empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//to launch a web application
		driver.get("https://demowebshop.tricentis.com/");
		
		//to fetch the title
		System.out.println(driver.getTitle());
		
//		String title=driver.getTitle();
//		System.out.println(title);
	}
}
