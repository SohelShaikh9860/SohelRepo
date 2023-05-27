package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    
    driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/userTextBox.html");
    Thread.sleep(2000);
    
    driver.findElement(By.tagName("input")).sendKeys("Sohel Shaikh");
    Thread.sleep(2000);
    driver.navigate().to("https://www.instagram.com/");
    Thread.sleep(2000);
    driver.findElement(By.tagName("input")).sendKeys("Sohel ");
    Thread.sleep(2000);
    driver.findElement(By.tagName("input")).sendKeys("Sohel@123");
    Thread.sleep(2000);
    driver.navigate().to("https://www.netflix.com/in/login");
    Thread.sleep(2000);
    driver.findElement(By.tagName("input")).sendKeys("sohel shaikh");
    Thread.sleep(2000);
    driver.findElement(By.tagName("input")).sendKeys("sohel@123");
    Thread.sleep(2000);
    driver.navigate().to("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F%3F");
    Thread.sleep(2000);
    driver.findElement(By.tagName("input")).sendKeys("sohel shaikh");

	}

}
