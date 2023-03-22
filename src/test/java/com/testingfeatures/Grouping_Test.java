package com.testingfeatures;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Meals")
	public void SambarRice() {
      System.out.println("SambarRice");
	}
	@Test(groups = "Meals")
	public void CurdRice() {
       System.out.println("CurdRice");
	}
	@Test(groups = "ChatItems")
	public void PaniPoori() {
       System.out.println("PaniPoori");
	}
	@Test(groups = "ChatItems")
	public void BhelPoori() {
         System.out.println("BhelPoori");
	}
	@Test(groups = "Juice")
	public void MintLemon() {
       System.out.println("MintLemon");
	}
	@Test(groups = "Juice")
	public void WaterMelon() {
     System.out.println("WaterMelon");
	}
	
	

}
