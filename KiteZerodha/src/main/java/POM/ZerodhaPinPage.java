package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
	
	@FindBy(xpath ="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Sumbit;
	@FindBy(xpath = "//a[text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement Signup;
	
	
	public ZerodhaPinPage(WebDriver driver){
	    PageFactory.initElements(driver,this);	
           }
    public void enterpin(String pinNumber) {
	    pin.sendKeys(pinNumber);
       }
    public void clickOnSumbit() {
    	Sumbit.click();
          } 
    public void clickOnForgot() {
    	Forgot.click();
       }
    public void clickOnSignUp() {
    	Signup.click();
      }
	
	}
   

