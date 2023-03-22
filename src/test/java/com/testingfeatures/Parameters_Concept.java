package com.testingfeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters_Concept {
	
	
	
	@Test
	@Parameters({"username","password"})
	public void Login(String username, @Optional("Manikandan")String password) {
		
		System.out.println("email:"+username);
		System.out.println("password:"+password);
		
       
	}
	
	
	

}
