package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));

	    driver.get("http://127.0.0.1/login.do;jsessionid=2r3l2k9geued0");
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    
	    //click on setting
	    driver.findElement(By.xpath("//A[@class='content administration']/IMG[@class='sizer']")).click();
	    
	   //click on logo & color 
	    driver.findElement(By.xpath("//a[contains(.,'Logo & Color Scheme')]")).click();
	    
	    Thread.sleep(2000);
	    
	    //click on radio button
	    driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	    
	    //click on choose file button
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	   
	   //create obj of Actions class
	   Actions act = new Actions(driver);
	   
	   //use this method of doubleClick...
	   act.moveToElement(target).doubleClick(target).build().perform();
	   
	   Thread.sleep(2000);
	
	   
	   driver.quit();
	   
	   

	}

}
