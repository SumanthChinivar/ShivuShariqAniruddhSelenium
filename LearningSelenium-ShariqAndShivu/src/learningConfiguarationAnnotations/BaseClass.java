package learningConfiguarationAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			// to set and path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// to launch empty browser--Upcasting
			driver = new ChromeDriver();
			Reporter.log("Browser is launched",true);
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

	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("komalgupta121@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shakuni123.@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}
}
