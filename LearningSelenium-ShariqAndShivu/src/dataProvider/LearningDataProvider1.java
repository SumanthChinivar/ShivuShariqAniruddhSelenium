package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider1 {

	@DataProvider
	public String[][] readingData() {
		String[][] values = { { "Sumanth", "Trainer" }, { "Raman", "Manager" } };
		return values;
	}

	/*
	 * @Test(dataProvider = "readingData") public void printValues(String[] value) {
	 * System.out.println(value[0]); System.out.println(value[1]); }
	 */

	/*
	 * @Test(dataProvider = "readingData") public void printValues1(String... value)
	 * { System.out.println(value[0]); System.out.println(value[1]); }
	 */

	@Test(dataProvider = "readingData")
	public void printValues2(String value1, String value2) {
		System.out.println(value1);
		System.out.println(value2);
	}

}
