package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Checkout {
	public WebDriver driver;
	
	@FindBy(xpath= "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement pc;

	public Proceed_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPc() {
		return pc;
	}
}
