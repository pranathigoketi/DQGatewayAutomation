package com.pagefactory;

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

public class MastersDataPage extends BaseClass {

	WebDriver driver;

	public MastersDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Master Data']")
	WebElement clkmasters;

	public void hitMastersData() {
		utillfunnctions.ClickOnElement(clkmasters);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Upload Master Data']")
	WebElement upload;

	public void hitUploadBtn() {
		utillfunnctions.ClickOnElement(upload);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement entersource;

	public void enterMasterName() {
		utillfunnctions.sendText(entersource, "Master Data 1");
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//textarea[@aria-invalid='false']")
	WebElement enterdesc;

	public void enterDescription() {
		utillfunnctions.sendText(enterdesc, "Cleaning up the fuzzy data algorithms");
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Browse']")
	WebElement uploadfile;

	public void uploadRobotfile() throws AWTException {
		utillfunnctions.ClickOnElement(uploadfile);
		
		Robot robot = new Robot();

		StringSelection str = new StringSelection("Downloads\\SampleCSVFile_2kb.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		try {
			Thread.sleep(8000);
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
	
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement uploadbtn;
	
	
	public void hitUploadFileBtn() {
		utillfunnctions.ClickOnElement(uploadbtn);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}


}
