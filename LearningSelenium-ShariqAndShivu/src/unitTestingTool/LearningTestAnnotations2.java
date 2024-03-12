package unitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningTestAnnotations2 {

	@Test
	public void setProperty() {
		System.out.println("Setting the property");
	}

	@Test
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}

	@Test
	public void launchURL() {
		System.out.println("Url is launched");
	}

	@Test
	public void browserQuit() {
		System.out.println("Browser is closed");
	}
}
