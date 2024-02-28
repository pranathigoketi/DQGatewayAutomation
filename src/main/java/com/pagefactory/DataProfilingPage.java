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

public class DataProfilingPage extends BaseClass {

	WebDriver driver;

	public DataProfilingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Data Sources']")
	WebElement datasources;

	public void hitDataSources() {
		utillfunnctions.ClickOnElement(datasources);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//*[@src='/assets/uploads/snowflake.png']")
	WebElement snowDB;

	public void hitAdd() {
		utillfunnctions.ClickOnElement(snowDB);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}
	
	@FindBy(xpath = "//button[text()='Add new']")
	WebElement addnewdb2;

	public void hitAddNewDB2() {
		utillfunnctions.ClickOnElement(addnewdb2);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id=':r1f:']")
	WebElement datasourcename;

	public void enterDatasourceName() {
		utillfunnctions.sendText(datasourcename, "Database_Snowflake0995");
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

	@FindBy(xpath = "//span[normalize-space()='Data Profiling']")
	WebElement hitdataprofiling;

	public void clkDataProfiling() {
		utillfunnctions.ClickOnElement(hitdataprofiling);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(css = "input[value='database']")
	WebElement selectdb1;

	public void selectDB1() {
		utillfunnctions.ClickOnElement(selectdb1);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")
	WebElement repottype;

	public void selectReport() {
		utillfunnctions.ClickOnElement(repottype);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	public void selectDataProfiling() throws InterruptedException {
		WebElement ul = driver
				.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']"));
		Thread.sleep(5000);
		List<WebElement> allOptions = ul.findElements(By.tagName("li"));
		for (WebElement selectLi : allOptions) {
			if (selectLi.getText().equals(reportType1)) {
				System.out.println(selectLi.getText());
				selectLi.click();
			}
		}
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement conn;

	public void hitConnection() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(conn);
		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@placeholder='Select Table']")
	WebElement table;

	public void hitTable() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(table);

		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//input[@placeholder='Select Column']")
	WebElement coloumn;

	public void hitColoumn() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(coloumn);
	
		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement hitsubmit;

	public void clkSubmit() {
		utillfunnctions.ClickOnElement(hitsubmit);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

}
