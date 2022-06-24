package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaForgotPassword;
import Utility.Parametrization1;

public class ZerodhaForgotPasswordTest {
WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
	@Test
	
	public void clickOnForgotPasswordTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotPassword();
		String UserId = Parametrization1.getData(0, 1);
		String PAN =Parametrization1.getData(1, 1);
		zerodhaForgotPassword.enterUserId(UserId);
		zerodhaForgotPassword.enterPAN(PAN);
		String ID = Parametrization1.getData(2, 1);
		zerodhaForgotPassword.enterID(ID);
        zerodhaForgotPassword.clickOnReset();
		
	}
	
	
	
	

}
