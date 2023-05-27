package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 driver.get("https://www.selenium.dev/downloads/");
		 WebElement Target = driver.findElement(By.linkText("4.9.0"));
		 
		 //to perform mouse action we need to create obj..
		  Actions act = new Actions(driver);
		  
		 //to use right click action..
		 act.contextClick(Target).perform();
		 
//		 act.contextClick(Target).build().perform();
		 

	}

}
