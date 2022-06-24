package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void screenShot(WebDriver driver,String a) throws IOException {  // how top take screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String c = "C:\\Screenshot\\";
		File destination = new File(c+a);
		
		FileHandler.copy(source, destination);
		
	}

}



/*public static void main(String[] args) throws IOException {  // how top take screenshot
	
	WebDriver driver = Browser.openBrowser("https://vctcpune.com/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Screenshot\\Firstfile.png");
	
	FileHandler.copy(source, destination);
	*/