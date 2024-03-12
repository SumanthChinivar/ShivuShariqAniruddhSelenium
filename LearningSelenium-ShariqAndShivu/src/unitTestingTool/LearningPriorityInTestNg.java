package unitTestingTool;

import org.testng.annotations.Test;

public class LearningPriorityInTestNg {
	@Test(priority=1)
	public void setProperty() {
		System.out.println("Setting the property");
	}

	@Test(priority=2)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}

	@Test(priority=3)
	public void launchURL() {
		System.out.println("Url is launched");
	}

	@Test(priority=4)
	public void browserQuit() {
		System.out.println("Browser is closed");
	}
}
