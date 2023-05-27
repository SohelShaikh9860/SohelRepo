package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpotifyLoginPage {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       
      WebDriver driver=new ChromeDriver(co);
      driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F%3F");
      Thread.sleep(2000);
      
      driver.findElement(By.id("login-username")).sendKeys("Kashinath");
      Thread.sleep(2000);
      driver.findElement(By.id("login-password")).sendKeys("Kashi@123");
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("span[class='Type__TypeElement-sc-goli3j-0 kwLSIj sc-eDvSVe sc-ksBlkl sc-hBxehG itlAHd kDeouY GWoyc']")).click();
	}

}
