package com.testingfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	public void demoPassword() {
		
		String act = "Ayyapa";
		String exp = "Ayyapa";
		Assert.assertEquals(act, exp);
        System.out.println("Validation");
	}
	

}
