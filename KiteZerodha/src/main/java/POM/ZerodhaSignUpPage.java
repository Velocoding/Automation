package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy(xpath = ("//a[text()=\"Don't have an account? Signup now!\"]"))private WebElement Signup;
	@FindBy(xpath = ("//input[@type='text']"))private WebElement MobileNo;
	@FindBy(xpath = ("//button[@type='submit']"))private WebElement Sumbit;
	//@FindBy(xpath=("//a[text()='Want to open an NRI account?']"))private WebElement OpenAccount;
	


	public ZerodhaSignUpPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
	public void clickOnSignUp() {
    	Signup.click();
      }
	public void enterMobileNo(String number){
	    MobileNo.sendKeys(number);
           }
	public void clickOnSumbit() {
		Sumbit.click();
	}
	/*public void clickOnOpenAccount() {
		OpenAccount.click();
	}*/
	
}