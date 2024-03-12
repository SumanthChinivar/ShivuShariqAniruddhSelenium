package writingTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.WelcomePage;

public class LoginAndLogoutUsingPOM {
	@Test
	public void loginAndLogout() {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLoginLink().click();
		
		LoginPage login=new LoginPage(driver);
		login.getEmailTextField().sendKeys("komalgupta121@gmail.com");
		login.getPasswordTextField().sendKeys("Shakuni123.@");
		login.getLoginButton().click();
		
		HomePage home=new HomePage(driver);
		home.getLogoutLink().click();
		
	}
}
