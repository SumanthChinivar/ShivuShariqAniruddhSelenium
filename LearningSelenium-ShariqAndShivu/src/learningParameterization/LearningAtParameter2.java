package learningParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningAtParameter2 {

	@Parameters({"a","b"})
	@Test
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
}
