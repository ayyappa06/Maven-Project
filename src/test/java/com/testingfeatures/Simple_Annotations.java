package com.testingfeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	
//	@BeforeSuite
//	public void Property() {
//    System.out.println("Property");
//	}
//	
//	@BeforeTest
//	public void Browser() {
//      System.out.println("Browser");
//	}
//	
//	
//	@BeforeClass
//	public void Url() {
//    System.out.println("Url");
//	}
	
	@BeforeMethod
	public void Signin() {

		System.out.println("Signin");
	}
	
	@Test (priority = 0)
	public  void Mobile() {
    System.out.println("Mobile");
     }
	
	@Test(priority = 1,invocationCount = 3)
	public void Laptop() {
    System.out.println("Laptop");
	}

	@Test (priority = -2)
	public void Tv() {
   System.out.println("Tv");
	}
	
	
	@AfterMethod
	public void Signout() {
     System.out.println("Signout");
	}
	
	
	@AfterClass
	public void HomePage() {
      System.out.println("HomePage");
	}
	
	@AfterTest
	public void DeleteCookies() {
     System.out.println("DeleteCookies");
	}
	
	@AfterSuite
	public void CloseBrowser() {
     System.out.println("CloseBrowser");
	}
}
