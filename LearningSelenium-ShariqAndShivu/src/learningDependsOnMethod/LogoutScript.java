package learningDependsOnMethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogoutScript {

	@Test(dependsOnMethods ={"learningDependsOnMethod.LoginScript.login","learningDependsOnMethod.SearchingAProduct.search"})
	public void logout()
	{
		LoginScript.driver.findElement(By.linkText("Log out")).click();;
	}
}
