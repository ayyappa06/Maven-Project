package com.std;

import org.openqa.selenium.WebDriver;

import com.pomclass.Clicking_Shirts;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.Payment2;
import com.pomclass.Payment_Page;
import com.pomclass.Proceed_Checkout;
import com.pomclass.Shipping;
import com.pomclass.Shirt;

public class Page_Object_Manager {
	public WebDriver driver;
	
	private Home_Page Home;
	private Login_Page Login;
	private Shirt S1;
	private Clicking_Shirts Shirts;
	private Proceed_Checkout Pc;
	private Payment_Page pc1;
	private Payment2 Pc3;
	private Shipping Pc4;
	
	
public Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
	}

public Home_Page getInstancehome() {
	if (Home==null) {
		Home = new Home_Page(driver);
	}
	
	return Home;
}

	public Login_Page getInstanceLogin() {
		if (Login==null) {
			Login =new Login_Page(driver);
			}
		return Login;

	}
	
	
    public Shirt getInstanceShirt() {
    	if (S1==null) {
    		S1= new Shirt(driver);
			}
    	return S1;

	}
	
	
	
	public Clicking_Shirts getinstanceClicking_Shirts() {
            if (Shirts==null) {
            	Shirts= new Clicking_Shirts(driver);
			}
            return Shirts;
	}
	
	
	public Proceed_Checkout getInstanceProceed_Checkout() {
          if (Pc==null) {
        	  Pc= new Proceed_Checkout(driver);
		}
          return Pc;
	}
	
	
	
	public Payment_Page getInstancePayment_Page() {
            if (pc1==null) {
            	pc1 =new Payment_Page(driver);
			}
            return pc1;
	}
	
	
	
	public Payment2 getInstancePayment2() {
            if (Pc3==null) {
            	Pc3 = new Payment2(driver);
			}
            return Pc3;
	}
	
	public Shipping getInstanceShipping() {
           if (Pc4==null) {
        	   Pc4= new Shipping(driver);
		}
           return Pc4;
	}
	



}
