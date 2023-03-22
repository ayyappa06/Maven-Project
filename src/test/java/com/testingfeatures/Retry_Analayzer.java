package com.testingfeatures;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Analayzer {
	
	@Test(retryAnalyzer = Rerun_1.class)
	public void Login() {
		
		String act_Username  = "Ayyapa";
		String exp_Username =  "ayyapa";
		
		Assert.assertEquals(act_Username, exp_Username);
		
		}
	
	@Test
	public void Password() {
       
		String act_Password = "Sastha1";
		String exp_Password = "Sastha1";
		
		Assert.assertEquals(act_Password, exp_Password);
		
	}
	
	

}
