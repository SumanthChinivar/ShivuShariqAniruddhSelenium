package learningDependsOnMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchingAProduct  {
	@Test(dependsOnMethods = "learningDependsOnMethod.LoginScript.login")
	public void search() {
		LoginScript.driver.findElement(By.name("q")).sendKeys("smart phone"+Keys.ENTER);
	}
}
