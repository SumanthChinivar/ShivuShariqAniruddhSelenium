package readingDataFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromAFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/Demo3.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("Practice");

		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=1;i<rowNum;i++) {
			for(int j=0;j<colNum;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				System.out.print(data[i-1][j]+" ");
			}
			System.out.println();
		}
	}
}
