package unitTestingTool;

import org.testng.annotations.Test;

public class LearningPriorityWithTestNG1 {
	@Test
	public void drakula() {
		System.out.println("Gaalipata");
	}
	
	@Test(priority = -1)
	public void pepsi()
	{
		System.out.println("Cheluvinachittara");
	}
	
	@Test(priority = 1)
	public void blackWidow()
	{
		System.out.println("Avengers");
	}
	
	@Test(priority = 0)
	public void ironMan()
	{
		System.out.println("Tony Starck");
	}
	
	@Test(priority='a')
	public void batman()
	{
		System.out.println("Dent");
	}
}
