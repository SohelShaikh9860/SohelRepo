package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag3 
{
	//it use to execute annotation or method multiple time
	
  @Test(invocationCount = 10)
  public void method1() 
  {
	  Reporter.log("login test case",true);
  }
}
