package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver","./drivdriver.exe");
	//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
     WebDriver	driver=new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
	//WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	 driver.navigate().to("https://www.google.com/");
	 Thread.sleep(2000);
	 
	driver.switchTo().activeElement().sendKeys("Ms Dhoni",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.switchTo().activeElement().sendKeys("Sharukh khan image",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
    
    driver.switchTo().activeElement().sendKeys("Amir khan image",Keys.ENTER);
    Thread.sleep(2000);
    driver.navigate().back();
    
    
	driver.close();
	

	}

	
}
