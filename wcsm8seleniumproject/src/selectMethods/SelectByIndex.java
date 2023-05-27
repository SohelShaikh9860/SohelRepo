package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex 
{
//single select DropDown...
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/Dropdown.html");
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 Select sel = new Select(dropdown);
		 
		 Thread.sleep(4000);
		 sel.selectByIndex(0);
		 
		 

	}

}
