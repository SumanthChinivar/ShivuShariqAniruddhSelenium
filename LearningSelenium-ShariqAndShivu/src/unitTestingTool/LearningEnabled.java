package unitTestingTool;

import org.testng.annotations.Test;

public class LearningEnabled {
	@Test(enabled=false)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
}
