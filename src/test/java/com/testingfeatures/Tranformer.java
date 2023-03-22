package com.testingfeatures;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Tranformer implements IAnnotationTransformer {
	
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
		
		annotation.setRetryAnalyzer(Rerun_1.class);
	
	
	}
	
	

}
