package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   
		  WebDriver driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  //driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/Dropdown.html");
		 // Thread.sleep(2000);
		  //driver.findElement(By.id("i1")).click();
		  Thread.sleep(2000);
		  driver.navigate().to("https://www.netflix.com/in/login");
		  Thread.sleep(2000);
		  driver.findElement(By.id("id")).click();

	}

}
