package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
@FindBy(xpath="//*[@id=\"cgv\"]")
private WebElement agree;

@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
private WebElement finalbill;

public Shipping(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getAgree() {
	return agree;
}

public WebElement getFinalbill() {
	return finalbill;
}


}

