package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization1;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
	@Test
	
	public void loginwithvalidCredentialsTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		Thread.sleep(1000);
		String UserName = Parametrization1.getData(0, 1);
		String Password =Parametrization1.getData(1, 1);
		zerodhaLoginPage.enterUserId(UserName);
		zerodhaLoginPage.enterPassword(Password);
		zerodhaLoginPage.clickOnLoginPage();	
	}
	/*@Test
	
	public void ClickOnForgotLinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
}
	@Test
	 public void ClickOnSignUpTest()
	 {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();
	 }
	*/
}

