package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
  @Test
  public void f() 
  {
	  //System.out.println("Hii TestNG!!!");
	  Reporter.log("Hii TestNG!!!",true);
  }
}
