package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethod {
 // it is use to get the source code.
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.get("https://www.instagram.com/");
		  
		   String scode = driver.getPageSource();
		   System.out.println(scode);
	} 

}
