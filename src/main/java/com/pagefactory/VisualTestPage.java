package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class VisualTestPage extends BaseClass {

	WebDriver driver;

	public VisualTestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Visual Test']")
	WebElement clkvisual;

	public void hitvisualTest() {
		utillfunnctions.ClickOnElement(clkvisual);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Create New Test']")
	WebElement createnew;

	public void hitcreateNewBtn() {
		utillfunnctions.ClickOnElement(createnew);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@name='TestName']")
	WebElement entertest;

	public void entertestName() {
		utillfunnctions.sendText(entertest, "DB_SF_91");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[2]")
	WebElement select;

	public void selectTreshold() {
		utillfunnctions.ClickOnElement(select);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//li[normalize-space()='100']")
	WebElement dropdown;

	public void selectValue() {
		utillfunnctions.ClickOnElement(dropdown);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	WebElement diff;

	public void selectDifferences() {
		utillfunnctions.sendText(diff, "9");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@name='ApplicationUrl']")
	WebElement url;

	public void enterAppURL() {
		utillfunnctions.sendText(url, "https://www.javatpoint.com/");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@name='ApplicationName']")
	WebElement name;

	public void enterAppName() {
		utillfunnctions.sendText(name, "Javapoint");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public void hitSubmit() {
		utillfunnctions.ClickOnElement(submit);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

}