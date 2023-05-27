package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodFlag5
{
	 @Test(description = "login method")
	  public void loginmethod() 
	  {
		  Reporter.log("login performed",true);
	  }
	  
	  @Test(description = "createuser testcase", dependsOnMethods = "loginmethod")
	  public void createuser() 
	  {
		  Reporter.log(" user created",true);
	  }
	  
	  @Test(description = "logout testcase",dependsOnMethods = "createuser")
	  public void logoutmethod() 
	  {
		  Reporter.log("logout performed",true);
	  }
}
