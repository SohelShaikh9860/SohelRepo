package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag4 
{
	//it is use to execute the annotation or method according to priority
  @Test
  public void f() 
  {
	  Reporter.log("f method",true);
  }
  
  @Test
  public void a() 
  {
	  Reporter.log("a method",true);
  }
  
  @Test(priority = 1)
  public void b() 
  {
	  Reporter.log("b method",true);
  }
  @Test
  public void n() 
  {
	  Reporter.log("n method",true);
  }
  
  @Test
  public void m() 
  {
	  Reporter.log("m method",true);
  }
  
  @Test(priority = 1)
  public void k() 
  {
	  Reporter.log("k method",true);
  }
  
  @Test
  public void g() 
  {
	  Reporter.log("g method",true);
  }
}
