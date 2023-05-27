package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

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
		  sel.selectByVisibleText("Wadapav");
		  Thread.sleep(2000);
		  sel.selectByVisibleText("dosa");
		  
		  //deselct the option
		  
		  Thread.sleep(2000);
		  sel.deselectByVisibleText("Wadapav");
		  Thread.sleep(2000);
		  sel.deselectByVisibleText("dosa");

	}

}
