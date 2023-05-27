package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/LinkWebElement.Html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("FlipkartLink")).click();
		

	}

}
