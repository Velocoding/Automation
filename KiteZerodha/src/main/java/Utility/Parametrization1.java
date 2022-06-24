package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Parametrization1 {
	
	/*public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\Forgot Pass.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(cell).getStringCellValue();
		return value;

	}
	}
	*/
public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\TestData.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Testing1").getRow(row).getCell(cell).getStringCellValue();
	return value;

}
}