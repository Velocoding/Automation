package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;

public class ZerodhaPinPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		 driver = Browser.openBrowser();
	}
	@Test
	public void ZerodhaLoginWithPinTest() throws InterruptedException, EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String UserName = Parametrization1.getData(0, 1);
		System.out.println(UserName);
		String Password =Parametrization1.getData(1, 1);
		System.out.println(Password);
		Thread.sleep(1000);
		zerodhaLoginPage.enterUserId(UserName);
		zerodhaLoginPage.enterPassword(Password);
		zerodhaLoginPage.clickOnLoginPage();
		Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String PinNumber = Parametrization1.getData(2, 1);
		System.out.println(PinNumber);
		zerodhaPinPage.enterpin(PinNumber);
	   	zerodhaPinPage.clickOnSumbit();
	   	
	}
}