package learningParameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningAtParameter {
	@Parameters({ "a", "b"} )
	@Test
	public void add(@Optional("10") int a,@Optional("2")int b) {
		System.out.println(a + b);
	}
}
