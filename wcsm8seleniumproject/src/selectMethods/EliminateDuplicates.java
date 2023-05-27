package selectMethods;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates
{
//by using TreeSet from DropDown
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver	driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.get("file:///C:/Users/LENOVO%20L460/Desktop/HTML%20FILE/Dropdown.html");
		 WebElement dropdown = driver.findElement(By.name("menu"));
		 
		 
		  //to handle dropdown create object of select class
		   Select sel = new Select(dropdown);
		 
		 
		 //to get all the options from Dropdown
          List<WebElement> allOptions = sel.getOptions();
          
          //to eliminate the duplicates & maintain the order of insertion we use
           TreeSet<String> ts = new TreeSet<String>();
           
           
           //to read the list by eliminating duplicates        
          for(int i=0; i<allOptions.size(); i++)
          {
        	  //get the options & text of options
        	  String op = allOptions.get(i).getText();
        	  
        	  
        	  //add the text of options to treeset
        	  ts.add(op);
          }
          
          
          // to read the options from set
          for(String options:ts)
          {
        	  Thread.sleep(2000);
        	  System.out.println(options);
          }
	}

}
