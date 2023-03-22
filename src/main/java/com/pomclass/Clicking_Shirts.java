package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clicking_Shirts {
	public WebDriver driver;

	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement type;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	private WebElement size;
	
	@FindBy(xpath="//*[@id=\"color_13\"]")
	private WebElement color;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addtocart;
	
	public Clicking_Shirts(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
