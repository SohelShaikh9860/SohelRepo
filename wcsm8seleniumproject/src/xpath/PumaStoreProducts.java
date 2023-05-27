package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStoreProducts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver	driver=new ChromeDriver(co);
	    
	    driver.get("https://in.puma.com/in/en");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[text()='Men']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.className("tw-hqslau tw-xbcb1y text-base leading-6 text-puma-black-300 hover:text-puma-black")).click();
	    
	    Thread.sleep(2000);

	}

}
