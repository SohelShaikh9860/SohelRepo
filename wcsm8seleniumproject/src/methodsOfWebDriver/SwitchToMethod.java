
package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     
     
     //will launch WebApplication by using navigate method
    driver.navigate().to("https://www.google.com/");
    Thread.sleep(2000);
    
    //switch the control to activeElement
    driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
    
    
    //use back operation
    Thread.sleep(2000);
 driver.navigate().back();
    
   driver.switchTo().activeElement().sendKeys("manual testing",Keys.ENTER);
    driver.navigate().back();
    Thread.sleep(2000);
    
    //use forward operation
    driver.navigate().forward();
    Thread.sleep(2000);
    
    //use refresh operation
    driver.navigate().refresh();
    driver.quit();

	}

}
