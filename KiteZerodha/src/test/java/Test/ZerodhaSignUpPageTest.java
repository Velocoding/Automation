package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaSignUpPage;
import Utility.Parametrization1;

public class ZerodhaSignUpPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void Lbrowsers() {
		driver= Browser.openBrowser();
	}

     @Test
	
	public void clickOnSignUpTest() throws EncryptedDocumentException, IOException, InterruptedException {
    	 ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
    	 zerodhaSignUpPage.clickOnSignUp();
    	 Thread.sleep(5000);
    	String a = driver.getWindowHandle();
    	driver.switchTo().window(a);
    	System.out.println(a);
    	String MobileNo = Parametrization1.getData(4,1);
    	 System.out.println(MobileNo);
    	 zerodhaSignUpPage.enterMobileNo(MobileNo);
    	 zerodhaSignUpPage.clickOnSumbit();
    	 
     }
}
    /* @Test
     public void clickOnOpenAccountTest() {
     ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
     zerodhaSignUpPage.clickOnOpenAccount();
     
     
      ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
    	 a.get(0);
    	 driver.switchTo().window(a.get(0));
    	 
     }*/
     /*Set<String> a = driver.getWindowHandles();
		Iterator<String> i = a.iterator();
     
}
*/