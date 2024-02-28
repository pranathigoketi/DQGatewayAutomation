package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DataSourcesPageDB extends BaseClass {

	WebDriver driver;

	public DataSourcesPageDB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Data Sources']")
	WebElement datasources;

	public void hitDataSources() {
		utillfunnctions.ClickOnElement(datasources);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//*[@src='/assets/uploads/snowflake.png']")
	WebElement snowDB;

	public void hitAdd() {
		utillfunnctions.ClickOnElement(snowDB);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Add new']")
	WebElement addnewdb;

	public void hitAddNewDB() {
		utillfunnctions.ClickOnElement(addnewdb);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id=':r1f:']")
	WebElement datasourcename;

	public void enterDatasourceName() {
		utillfunnctions.sendText(datasourcename, "Database_Snowflake76");
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
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}
}
