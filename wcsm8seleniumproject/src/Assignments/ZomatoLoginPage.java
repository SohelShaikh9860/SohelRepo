package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZomatoLoginPage {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      ChromeOptions co = new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      
     WebDriver driver=new ChromeDriver(co);
     driver.get("https://www.zomatobook.com/account/login.aspx");
     Thread.sleep(2000);
     driver.findElement(By.id("ctl00$MainContent$LoginControl$UserName")).sendKeys("Katiya");
     Thread.sleep(2000);
     driver.findElement(By.id("MainContent_LoginControl_Password")).sendKeys("katiya@123");
     Thread.sleep(2000);
     driver.findElement(By.id("MainContent_LoginControl_btnLogin")).click();
     Thread.sleep(2000);
     
     
	}

}
