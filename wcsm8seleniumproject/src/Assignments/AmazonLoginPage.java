package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLoginPage 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver	driver=new ChromeDriver(co);
    	driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D2560364533286383389%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26k%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_newcust&prevRID=R97SWG2VSJARY8ZGS78X&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        Thread.sleep(2000);
    
        driver.findElement(By.id("ap_customer_name")).sendKeys("Admin");
         Thread.sleep(2000);
    
        driver.findElement(By.id("ap_phone_number")).sendKeys("7823026123");
        Thread.sleep(2000);
    
        driver.findElement(By.id("ap_password")).sendKeys("Manager@123");
     Thread.sleep(2000);
    
    driver.findElement(By.id("continue")).click();
	}

}
