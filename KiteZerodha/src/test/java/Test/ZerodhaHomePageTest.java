package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import Utility.Parametrization1;
import Utility.Screenshot;
import POM.ZerodhaPinPage;

public class ZerodhaHomePageTest {
WebDriver driver;
	
	@BeforeMethod
	public void browser() {
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

		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		String ShareName = Parametrization1.getData(3, 1);
		System.out.println(ShareName);
		Thread.sleep(2000);
		zerodhaHomePage.enterShareName(ShareName);
		zerodhaHomePage.clickOnBuyShare(driver);
		zerodhaHomePage.RadioIntradayClick();
		zerodhaHomePage.RadioLongTermClick();
		zerodhaHomePage.RadioMarketClick();
		zerodhaHomePage.RadioLimitClick();
		zerodhaHomePage.RadioSLClick();
		zerodhaHomePage.RadioSLM();
		Screenshot.screenShot(driver,"HomePage.png");
	}
	
    	
}