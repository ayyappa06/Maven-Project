package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment2 {
	public WebDriver driver;
@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
private WebElement proceed;

public Payment2(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getProceed() {
	return proceed;
}

}
