package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueActiTime 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=2r3l2k9geued0");

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
		
		WebElement dropdown = driver.findElement(By.name("usersSelector.selectedUser"));
		Select sel = new Select(dropdown);
		Thread.sleep(4000);
		sel.selectByValue("3");

	}

}
