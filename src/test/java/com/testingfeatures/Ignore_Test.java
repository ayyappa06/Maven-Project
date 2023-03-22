package com.testingfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	
	@Test
	public  void Rock() {
        System.out.println("Rock");
	}
	
	
	@Test (enabled = false)
	public void StoneCold() {
        System.out.println("StoneCold");
	}
	
	@Ignore
	@Test
	public void JohnCena() {
        System.out.println("JohnCena");
	}
	@Test
	public void Undertaker() {
      System.out.println("Undertaker");
	}
	
	
	
	
	
	

}
