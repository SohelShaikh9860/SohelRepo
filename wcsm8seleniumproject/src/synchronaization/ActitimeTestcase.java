package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestcase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
	    driver.get("http://127.0.0.1/login.do;jsessionid=2r3l2k9geued0");
	    
	    
	    if(driver.getTitle().equals("actiTIME - Login"))
	    {
	    	System.out.println("Login page title is matched !! test case passed");
	    	
	    	  driver.findElement(By.name("username")).sendKeys("admin");
	    	  driver.findElement(By.name("pwd")).sendKeys("manager");
	    	  driver.findElement(By.id("loginButton")).click();
	    }
	    
	    

	}

}
