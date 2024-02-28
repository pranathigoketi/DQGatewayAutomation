package com.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RuleCollectionPage extends BaseClass {

	WebDriver driver;

	public RuleCollectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Data Sources']")
	WebElement datasources;

	public void hitDataSources() {
		utillfunnctions.ClickOnElement(datasources);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//*[name()='svg'][@aria-label='Add'])[1]")
	WebElement snowDB;

	public void hitAdd() {
		utillfunnctions.ClickOnElement(snowDB);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement datasourcename;

	public void enterDatasourceName() {
		utillfunnctions.sendText(datasourcename, "CSV_NO_01");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id=':r1h:']")
	WebElement servername;

	public void enterServerName() {
		utillfunnctions.sendText(servername, "kj73292.central-india.azure");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id=':r1i:']")
	WebElement databasename;

	public void enterDataBaseName() {
		utillfunnctions.sendText(databasename, "KAIROS");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@name='user']")
	WebElement username;

	public void enterUserName() {
		utillfunnctions.sendText(username, "Lakshmi");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	public void enterPassword() {
		utillfunnctions.sendText(password, "Inilan1@");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[@id=':r1n:']")
	static WebElement testbtn;

	@SuppressWarnings("static-access")
	public void hitTestBtn(WebDriver driver) {

		utillfunnctions.ClickElement(driver, testbtn);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//span[normalize-space()='Rule Collection']")
	WebElement hitrulecollection;

	public void hitRuleCollection() {
		utillfunnctions.ClickOnElement(hitrulecollection);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[normalize-space()='Create New Rule Collection']")
	WebElement hitcreate;

	public void hitCreateNewRule() {
		utillfunnctions.ClickOnElement(hitcreate);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@name='title']")
	WebElement enternameofrule;

	public void enterRuleName() {
		utillfunnctions.sendText(enternameofrule, "Rule JavaPoint17");
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement enterdescp;

	public void enterDescription() {
		utillfunnctions.sendText(enterdescp, "To create the new Rule collection for Snowflake DataBase");
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@placeholder='Select Rules']")
	WebElement select;

	public void selectRule() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(select);
		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "[class*='MuiChip-label MuiChip-labelSmall']")
	WebElement hitrule1;

	public void selectRuleNo() {
		utillfunnctions.ClickOnElement(hitrule1);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//*[local-name( )='svg'][@data-testid='ArrowDropDownIcon'])[2]")
	WebElement ruleselected;

	public void ruleGotSelected() {
		utillfunnctions.ClickOnElement(ruleselected);
		try {
			Thread.sleep(16000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;

	public void hitSaveBtn() {
		utillfunnctions.ClickOnElement(save);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//*[local-name()='svg'] [@data-testid='NotStartedSharpIcon'])[1]")
	WebElement execute;

	public void hitExecute() {
		utillfunnctions.ClickOnElement(execute);
		try {
			Thread.sleep(20000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//*[local-name()='svg'] [@data-testid='AnalyticsIcon'])[1]")
	WebElement result;

	public void hitResult() {
		utillfunnctions.ClickOnElement(result);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Row Comparision Results']")
	WebElement dqrules;

	public void hitDQrules() {
		utillfunnctions.ClickOnElement(dqrules);
		utillfunnctions.scrollDown(driver);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}
}
