package com.testingfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	
	
	@Test
	public void demoUsername() {
         
		String act = "Narayana";
		String exp = "narayananan";
		SoftAssert Soft = new SoftAssert();
		Soft.assertNotEquals(act, exp);
		
		System.out.println("Verification");
		changes done
		
	}

}
