package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	     WebDriver	driver=new ChromeDriver(co);
	     
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("hp laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	    
	}

}
