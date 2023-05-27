package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/Dropdown.html");
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 Select sel = new Select(dropdown);
		 List<WebElement> alloption = sel.getOptions();
		 
		 for(int i=0; i<=alloption.size(); i++)
		 {
	        String option = alloption.get(i).getText();
	        System.out.println(option);
		 }
		 
	}

}
