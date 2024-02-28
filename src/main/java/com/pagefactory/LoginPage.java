package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

		/**
		 * Constructor created in java initialization takes place from right hand hence
		 * we are initializing this for the entire project
		 **/

	}

	@FindBy(xpath = "//button[contains(text(),'Login with Azure AD')]")
	public WebElement AzureAD;
	
	public void clkLoginBtn() {
		utillfunnctions.ClickOnElement(AzureAD);
	}
	
}
