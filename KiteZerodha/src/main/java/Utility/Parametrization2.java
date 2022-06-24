package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Parametrization2 {
	
	public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\SignupInfo.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Info").getRow(row).getCell(cell).getStringCellValue();
		return value;

	}
	}
	
	