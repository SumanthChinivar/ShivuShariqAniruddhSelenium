package readingDataFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSingleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/Demo3.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		Sheet sheet=workBook.getSheet("Practice");
		
		String name=sheet.getRow(0).getCell(0).toString();
		System.out.println(name);
	}
}
