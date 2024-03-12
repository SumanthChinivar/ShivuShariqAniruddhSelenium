package readingDataFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./TestData/Demo.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String v1=(String)prop.get("No.7");
		System.out.println(v1);
		
		String v2=prop.getProperty("No.10");
		System.out.println(v2);
	}
}
