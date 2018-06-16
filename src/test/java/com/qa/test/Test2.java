//from kotha110705
package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test2 {
  @Test
  public void f() {
	  
	  System.out.println("This is Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method in t2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method in t2");
  }

}
