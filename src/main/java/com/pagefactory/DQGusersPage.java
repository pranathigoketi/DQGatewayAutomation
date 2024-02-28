package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utilities.UtillFunctions;

public class DQGusersPage extends BaseClass {

	WebDriver driver;

	public DQGusersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='DQG Users']")
	WebElement clkDqg;

	public void hitDQGUsers() {
		utillfunnctions.ClickOnElement(clkDqg);
		utillfunnctions.Styling(driver, clkDqg);
		utillfunnctions.ScrollElementdown(driver, clkDqg);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {
		}
	}
	@FindBy(xpath = "(//*[text()='DQG Users'])[2]")
	WebElement verifytitle;

	public void getTitle() {
		utillfunnctions.ClickOnElement(verifytitle);
		utillfunnctions.Styling(driver, verifytitle);
		System.out.println("Title is DQG Users");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//div[@id='demo-simple-select']")
	WebElement page;

	public void selectPage() {
		utillfunnctions.ClickOnElement(page);
		utillfunnctions.Styling(driver, page);
		utillfunnctions.ScrollElementdown(driver, page);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//li[@data-value='50']")
	WebElement selectuser;

	public void selectUsers() {
		utillfunnctions.ClickOnElement(selectuser);
		utillfunnctions.Styling(driver, selectuser);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			utillfunnctions.ScrollElementUp(driver, selectuser);
		}
	}

}