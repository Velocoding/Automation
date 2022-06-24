package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPassword {
	
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement Forgot;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement UserId;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement PAN;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement ID;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement Reset;

	public ZerodhaForgotPassword(WebDriver driver) {
  	  PageFactory.initElements(driver,this);
    }
	
	 public void clickOnForgotPassword() {
		  Forgot.click();
	  }
	  public void enterUserId(String user) {
		  UserId.sendKeys(user);
	  }
	  
	  public void enterPAN(String Pan) {
		  PAN.sendKeys(Pan);
	  }
	 public void enterID(String EID) {
		ID.sendKeys(EID);
	  }
	  public void clickOnReset() {
		  Reset.click();
	  }
	  
	
	
	
}
