package com.testingfeatures;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_1 implements IRetryAnalyzer {

	
	int Start= 0;
	int End = 4;
	@Override
	public boolean retry(ITestResult result) {
		
		if (Start<End) {
			
			Start++;
			return true;
		}
		return false;
	}
	
	
	

}
