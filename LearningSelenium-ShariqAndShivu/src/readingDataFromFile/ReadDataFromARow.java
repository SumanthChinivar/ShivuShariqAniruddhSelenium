package readingDataFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromARow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("./TestData/Demo3.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook workBook=WorkbookFactory.create(fis);
	Sheet sheet=workBook.getSheet("Practice");
	
	int rowNum=sheet.getPhysicalNumberOfRows();
	int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
	
	for(int i=0;i<colNum;i++) {
		System.out.println(sheet.getRow(0).getCell(i).toString());
	}
	}
}
