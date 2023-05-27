package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/multipleDropdown.html");
		 
		 
		 //to identify dropdown
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 
		 
		 //to select multiple option
		  Select sel = new Select(dropdown);
		
		 for(int i=0; i<8; i++)
		 {
			 if(i%2==0)
			 {
				 Thread.sleep(2000);
				 sel.selectByIndex(i);
			 }
			 else
			 {
				 System.out.println("its odd place");
			 }
		 }
		 
		 
		 
		 Thread.sleep(2000);
		 
		 
		 //to deselect multiple option
		 for(int i=0; i<8; i++)
		 {
			 if(i%2==0)
			 {
				  Thread.sleep(2000);
				  sel.deselectByIndex(i);
			 }
		 }

	}

}
