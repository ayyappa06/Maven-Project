package com.testingfeatures;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	
	@Test(timeOut=8000)
 public void Demo() throws Throwable {
      
	 Thread.sleep(2000);
	 System.out.println("BrowserLaunch");
	 
	 Thread.sleep(3000);
	 System.out.println("Url");
	 
	 Thread.sleep(2000);
	 System.out.println("Click Login");
	 
	 
	 
}
	
	
	
}
