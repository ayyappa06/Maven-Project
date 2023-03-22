package com.testingfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	
	
	@Test(dataProvider="inputData")
	public void Credentials(String Username, String Password) {
		
		System.out.println("Username:"+Username);
		System.out.println("Password:"+Password);
		
	}
	
	@DataProvider
   public Object[][] inputData() {
	   
         return new Object[][] {
        	 
        	 {"Ayyapa", "sastha"},
        	 {"Manikandan","hariharasudhan"},
        	 {"Mahaprabho","kaliyugavaradhan"}
        	 
        	 
         };

   
   
   }
   
	
	

}
