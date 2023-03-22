package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.Clicking_Shirts;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.Payment2;
import com.pomclass.Payment_Page;
import com.pomclass.Proceed_Checkout;
import com.pomclass.Shipping;
import com.pomclass.Shirt;
import com.properties.File_Reader_Manager;
import com.std.Page_Object_Manager;

public class Test_Project1 extends Base_Class1 {
	public static WebDriver driver=browserlaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws Throwable {
		
		String geturl = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		launchurl(geturl);
		
		String getemail = File_Reader_Manager.getInstanceFRM().getInstanceCR().getemail();
	 clickingtheelement(pom.getInstancehome().getSignin());
   inputvalues(pom.getInstanceLogin().getEmail(), getemail);
   String getpassword = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
  inputvalues(pom.getInstanceLogin().getPasswd(), getpassword);
 clickingtheelement(pom.getInstanceLogin().getSubmitLogin());
 clickingtheelement(pom.getInstanceShirt().getShirt());
// JavascriptExecutor js = (JavascriptExecutor) driver;
//      	js.executeScript("window.scrollBy(0, 600);");
	     clickingtheelement(pom.getinstanceClicking_Shirts().getType());
	     int i =1;
        	while (i<4) 
        	{

       clickingtheelement(pom.getinstanceClicking_Shirts().getQuantity());
        	
        		i++;
        		
        	}
        
      select(pom.getinstanceClicking_Shirts().getSize(), 1);
	  clickingtheelement(pom.getinstanceClicking_Shirts().getColor());
	  clickingtheelement(pom.getinstanceClicking_Shirts().getAddtocart());
	     clickingtheelement(pom.getInstanceProceed_Checkout().getPc());
	    clickingtheelement(pom.getInstancePayment_Page().getPayment());
	     clickingtheelement(pom.getInstancePayment2().getProceed());
        clickingtheelement(pom.getInstanceShipping().getAgree());
      clickingtheelement(pom.getInstanceShipping().getFinalbill() );
//      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//    	js1.executeScript("window.scrollBy(0, 600);");

TakesScreenshot Error_signup13=(TakesScreenshot) driver;
File source12=Error_signup13.getScreenshotAs(OutputType.FILE);
File destination12=new File("C:\\Users\\balak\\Desktop\\eclipse-workspace\\Testing\\screenshot.png");
FileUtils.copyFile(source12, destination12);





	
	
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
