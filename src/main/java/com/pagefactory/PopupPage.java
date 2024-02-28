package com.pagefactory;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PopupPage extends BaseClass {

	WebDriver driver;

	public PopupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name='loginfmt']")
	private WebElement emailform;

	public void enteringUsername() {
		try {
			Thread.sleep(7000);
		} catch (Exception e) {

		}
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		utillfunnctions.sendText(emailform, userName1);

	}

	@FindBy(xpath = "//input[@id='idSIButton9']")
	public WebElement clicknext;

	public void hitclkButton() {
		utillfunnctions.ClickOnElement(clicknext);

	}

	@FindBy(xpath = "//input[@type='password']")
	public WebElement passwordform;

	public void enteringPassword() {
		utillfunnctions.sendText(passwordform, password1);

		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id='idSIButton9']")
	public WebElement signin;

	public void hitsigninBtn() {
		utillfunnctions.ClickOnElement(signin);

		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement yesBtn;

	public void hityesBtn() {
		utillfunnctions.ClickOnElement(yesBtn);

		try {
			Thread.sleep(90000);
		} catch (Exception e) {

		}

		driver.switchTo().defaultContent();
		try {
			Thread.sleep(8000);
		} catch (Exception e) {
		}
	}

	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement confirmBtn;

	public void hitconfirmBtn() {
		utillfunnctions.ClickOnElement(confirmBtn);

		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}
}
