package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/multipleDropdown.html");
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 Select sel = new Select(dropdown);
		 
		 for(int i=3; i<6; i++)
		 {
			 Thread.sleep(2000);
			 sel.selectByIndex(i);
		 }
		 
		 Thread.sleep(2000);
		 WebElement firstOption = sel.getFirstSelectedOption();
		String value = firstOption.getText();
		System.out.println(value);
	}

}
