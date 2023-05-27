package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethodNavigateMethod1 {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver","./drivdriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("Baburao aapte image",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	
	driver.switchTo().activeElement().sendKeys("Sharukh khan image",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
    
    driver.switchTo().activeElement().sendKeys("Amir khan image",Keys.ENTER);
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);    
    
     driver.switchTo().activeElement().sendKeys("Rashmika mandana image",Keys.ENTER);
     Thread.sleep(2000);
     driver.navigate().back();
       Thread.sleep(2000);
       
     driver.switchTo().activeElement().sendKeys("allu arjun",Keys.ENTER);
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     
     driver.switchTo().activeElement().sendKeys("salman khan",Keys.ENTER);
     Thread.sleep(2000);
     driver.close();
     
    

	}

}
