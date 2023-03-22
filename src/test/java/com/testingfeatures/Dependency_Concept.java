package com.testingfeatures;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	
	@Test
	public void Ug() {
       System.out.println("Ug");
	}
	
	@Test(dependsOnMethods ="Ug"
			)
	public void Pg() {
        System.out.println("Pg");
	}
	
	

}
