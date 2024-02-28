package com.pagefactory.CSV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RuleCollectionPageCSV extends BaseClass {

	WebDriver driver;

	public RuleCollectionPageCSV(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[class='active'] span[class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-16kocxl']")
	WebElement datasources;

	public void hitDataSources() {
		utillfunnctions.ClickOnElement(datasources);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//*[@src='/assets/uploads/csv.png']")
	WebElement CSV;

	public void hitCsvFile() {
		utillfunnctions.ClickOnElement(CSV);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Add new']")
	WebElement addnew1;

	public void hitAddNew1() {
		utillfunnctions.ClickOnElement(addnew1);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement filename;

	public void enterFileName() {
		utillfunnctions.sendText(filename, "CSV_File_No_98");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Browse']")
	WebElement uploadcsvfile;

	public void uploadRobotfile1() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(uploadcsvfile);
		Thread.sleep(6000);

		Robot robot = new Robot();

		StringSelection str = new StringSelection(
				"Downloads\\annual-enterprise-survey-2021-financial-year-provisional-csv.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@FindBy(xpath = "//button[normalize-space()='Upload']")
	WebElement upload;

	public void hitUpload() {
		utillfunnctions.ClickOnElement(upload);
		try {
			Thread.sleep(5000);
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
		utillfunnctions.sendText(enternameofrule, "Rule_CSV_11");
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement enterdescp;

	public void enterDescription() {
		utillfunnctions.sendText(enterdescp, "To create the new Rule collection for CSV File");
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

}