package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod 
  // it is use to launch the WebApplication.
 // it accept string as an argument
// returnType is void


  {
	
    public static void main(String[] args) throws InterruptedException
    
	  {
	
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("http://omayo.blogspot.com/");
		
		
		}

}
