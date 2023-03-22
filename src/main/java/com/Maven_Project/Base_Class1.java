package com.Maven_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class1 {
	
	public static WebDriver driver;
	public static WebDriver browserlaunch(String name) {

		if (name.equalsIgnoreCase("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
				}
		
		else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		return driver;
	}

	
	
	//close
	public static void close() {
      driver.close();
	}
	
	
	//quit
	
	public static void quit() {
      driver.quit();
	}
	
//	url
	
	public static void launchurl(String url) {
		driver.get(url);

	}
	
//	clickonelement
	
	public static void clickingtheelement(WebElement element) {
		element.click();
	}
	
	
	//sendkeys
	
	public static void inputvalues(WebElement element,String name) {
		element.sendKeys(name);

	}
	

	
//javascriptexecutor
public static void javascriptexecutor() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 600);");
}

//select days
 public static void select(WebElement element,String name) {
  

}


//select date and years	
 
 public static void select(WebElement element,int i) {
	  

 }
 
 
 
 
 
} 	
