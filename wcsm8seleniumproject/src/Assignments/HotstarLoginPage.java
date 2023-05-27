package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotstarLoginPage {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver	driver=new ChromeDriver(co);
	    driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
	    Thread.sleep(2000);
	    driver.findElement(By.id("phoneNo")).sendKeys("7823016314");
	}

}
