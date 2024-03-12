package dataProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider3 {
	@DataProvider(name = "Read")
	public String[][] readingDataFromExcel() throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/Demo4.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");

		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] values = new String[rowNum - 1][colNum];

		for (int i = 1; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				values[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return values;
	}

	@Test(dataProvider = "Read")
	public void register(String[] data) {
		// to set and path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch empty browser--Upcasting
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// launching the web site
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		if(data[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}else
			driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		driver.findElement(By.id("register-button")).click();
		
		String message=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
		if(message.equals("Your registration completed")) {
			System.out.println("Registration succcessful");
		}
		else
			System.out.println("Registration failed");
	}
}
