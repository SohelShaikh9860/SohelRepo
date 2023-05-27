package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	//it is use to get the title of current WebPage.
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.instagram.com/");
	  
	   String loginPageTitle = driver.getTitle();
	   System.out.println(loginPageTitle);

	   
	  
	}

}
