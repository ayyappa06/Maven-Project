package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shirt {
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	 private WebElement Shirt;

	public Shirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getShirt() {
		return Shirt;
	}
	
	
	
	
}
