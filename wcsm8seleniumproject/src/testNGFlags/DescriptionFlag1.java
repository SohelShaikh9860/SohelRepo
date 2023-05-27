package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag1 {
	//to describe the method
	
	  @Test(description = "This method performs login")
	  public void method1() 
	  {
		    Reporter.log("Method 1 Login",true);
	  }
}
