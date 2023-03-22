package com.testingfeatures;

import org.testng.annotations.Test;

public class Exception_1 {
	
	
	@Test(expectedExceptions =NullPointerException.class )
	public void demo() {
      
		String a= null;
		int i = a.length();
		
		System.out.println(i);
	}

}
