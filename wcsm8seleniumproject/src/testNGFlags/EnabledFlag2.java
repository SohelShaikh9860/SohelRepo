package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag2 
{
	//method or annotation is enabled or disabled
	
  @Test(enabled = false,description = "login method")
  public void method1() 
  {
	Reporter.log("login performed");  
  }
  
  @Test(enabled = true,description = "logout method")
  public void method2() 
  {
	Reporter.log("login performed");  
  }
 
}
