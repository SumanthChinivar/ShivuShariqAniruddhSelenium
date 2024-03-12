package launchingEmptyBrowser;

import javax.imageio.plugins.tiff.TIFFDirectory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmptyChromeBrowser {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	ChromeDriver driver=new ChromeDriver();
	
//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//	FirefoxDriver driver=new FirefoxDriver();
	
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
}
}
