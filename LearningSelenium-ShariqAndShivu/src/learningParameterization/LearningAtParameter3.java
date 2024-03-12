package learningParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningAtParameter3 {
	@Parameters("browserName")
	@Test
	public void launchDWS(@Optional("chrome") String browserName) {
		WebDriver driver=null;
		if (browserName.equalsIgnoreCase("chrome")) {
			// to set and path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// to launch empty browser--Upcasting
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			// to set and path
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			// to launch empty browser--Upcasting
			 driver= new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			// to set and path
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			// to launch empty browser--Upcasting
			 driver= new FirefoxDriver();
		}
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
	}
}
