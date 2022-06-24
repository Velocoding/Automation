package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {     // chrome browser by default method
	
	
	public static WebDriver openBrowser() {   
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Updated driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		return driver;
	}

}



/*
WebElement seleniumpractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
seleniumpractice.click();

Set<String> addresses = driver.getWindowHandles();
Iterator<String> i = addresses.iterator();    */