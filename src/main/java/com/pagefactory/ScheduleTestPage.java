package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ScheduleTestPage extends BaseClass {

	WebDriver driver;

	public ScheduleTestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Scheduled Test']")
	WebElement clkschedule;

	public void hitscheduleTest() throws InterruptedException {
		System.out.println("Click on Schedule Test");
		Thread.sleep(3000);
		utillfunnctions.ClickOnElement(clkschedule);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Create New Execution Schedule for DQ Rules']")
	WebElement createnew;

	public void hitcreatenewscheduleTest() {
		utillfunnctions.ClickOnElement(createnew);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//textarea[@name='Title']")
	WebElement nametest;

	public void enterTestName() {
		utillfunnctions.sendText(nametest, "Rule no 1100");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//textarea[@name='Description']")
	WebElement descp;

	public void enterDescription() {
		utillfunnctions.sendText(descp, "Executing the rule of 1100");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//div[text()= 'Data Quality Rules']")
	WebElement ruletype;

	public void enterRuleType() {
		utillfunnctions.ClickOnElement(ruletype);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//li[@data-value='Validation Test']")
	WebElement dqruletype;

	public void selectRuleType() {
		utillfunnctions.ClickOnElement(dqruletype);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@placeholder='Select Data Quality Rules']")
//	@FindBy(xpath = "//button[@title='Open']//*[name()='svg']")
	WebElement selectrule;

	public void selectDQRuleType() {
//		utillfunnctions.sendText(selectrule, "Rule no 909");
		utillfunnctions.ClickOnElement(selectrule);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

//	@FindBy(xpath = "//input[@value='Rule no 909']")
	@FindBy(xpath = "(//input[@type='checkbox'])[19]")
	WebElement hitrule;

	public void hitruleno() throws InterruptedException {
		Thread.sleep(2000);
		utillfunnctions.ClickOnElement(hitrule);
//		try {
//			Thread.sleep(8000);
//		} catch (Exception e) {
//
//		}
	}

	@FindBy(xpath = "//div[@class='MuiAutocomplete-endAdornment css-2iz2x6']")
	WebElement dqrules;

	public void selectDQRulesType() {
		utillfunnctions.ClickOnElement(dqrules);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@id='datetime-local']")
	WebElement date;

	public void selectDate() {
		utillfunnctions.sendText(date, "26-12-2023,  16:58");
		try {
			Thread.sleep(7000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	public void hitSaveBtn() {
		utillfunnctions.ClickOnElement(save);
		try {
			Thread.sleep(7000);
		} catch (Exception e) {

		}
	}

}
