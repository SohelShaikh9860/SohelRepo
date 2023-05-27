package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   
		  WebDriver driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.google.com");
		  
		//  driver.switchTo().activeElement().sendKeys("Ross Geller",Keys.ENTER);
		  //Thread.sleep(2000);
		  //driver.findElement(By.className("lNPNe")).click();
		  
		 // Thread.sleep(2000);
		  //driver.switchTo().activeElement().sendKeys("Phoebe Buffay",Keys.ENTER);
		  //Thread.sleep(2000);
		  //driver.findElement(By.className("lNPNe")).click();
		  
		 // Thread.sleep(2000);
		 // driver.switchTo().activeElement().sendKeys("Monica Geller",Keys.ENTER);
		  //Thread.sleep(2000);
		 // driver.findElement(By.className("lNPNe")).click();
		  
		//  Thread.sleep(2000);
		 // driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
		  //Thread.sleep(2000);
		 // driver.findElement(By.className("lNPNe")).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		  Thread.sleep(2000);
		  driver.findElement(By.className("lNPNe")).click();

	}

}
 