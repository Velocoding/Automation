package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath = ("//input[@icon='search']"))private WebElement Search;
	@FindBy(xpath=("(//span[@class='symbol'])[2]"))private WebElement TataMotors;
    @FindBy(xpath=("//button[@class='button-blue']"))private WebElement Buy;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[6]"))private WebElement RadioIntraday;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[7]"))private WebElement RadioLongTerm;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[8]"))private WebElement RadioMarket;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[9]"))private WebElement RadioLimit;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[10]"))private WebElement RadioSL;
	@FindBy(xpath=("(//label[@class='su-radio-label'])[11]"))private WebElement RadioSLM;
	
      public ZerodhaHomePage(WebDriver driver) {
    	  PageFactory.initElements(driver,this);}
     
      public void enterShareName(String Share) {
    	  Search.click();
		  Search.sendKeys(Share);}
      
      public void clickOnBuyShare(WebDriver driver) {
    	  Actions action = new Actions(driver);
    	  action.moveToElement(TataMotors).perform();
    	  action.moveToElement(Buy);
    	  action.click();
    	  action.perform();}
      
      public void RadioIntradayClick() throws InterruptedException {
    	  Thread.sleep(2000);
    	  RadioIntraday.click();
      }
      public void RadioLongTermClick() throws InterruptedException
      {   Thread.sleep(2000);
    	  RadioLongTerm.click();
      }
      
      public void RadioMarketClick() throws InterruptedException
      {   Thread.sleep(2000);
    	  RadioMarket.click();
      }
      public void RadioLimitClick() throws InterruptedException
      {   Thread.sleep(2000);
    	  RadioLimit.click();
      }
      public void RadioSLClick() throws InterruptedException
      {   Thread.sleep(2000);
    	  RadioSL.click();
      }
      public void RadioSLM() throws InterruptedException
      {   Thread.sleep(2000);
    	  RadioSLM.click();
      }
      
      
      
}
