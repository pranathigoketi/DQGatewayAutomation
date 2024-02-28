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

public class DQRulesPage extends BaseClass {

	WebDriver driver;

	public DQRulesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Data Sources'])[1]")
	WebElement datasources;

	public void hitDataSources() {
		utillfunnctions.ClickOnElement(datasources);
		try {
			Thread.sleep(7000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//*[@src='/assets/uploads/snowflake.png']")
	WebElement snowDB1;

	public void hitAdd() {
		utillfunnctions.ClickOnElement(snowDB1);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Add new']")
	WebElement addnewdb;

	public void hitAddNewDB1() {
		utillfunnctions.ClickOnElement(addnewdb);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//input[@id=':r1f:']")
	WebElement datasourcename;

	public void enterDatasourceName() {
		utillfunnctions.sendText(datasourcename, "Database_Snowflake12");
		try {
			Thread.sleep(8000);
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

	@FindBy(xpath = "//span[normalize-space()='Data Quality Rules']")
	WebElement qualityrules;

	public void hitDqrules() {
		utillfunnctions.ClickOnElement(qualityrules);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[normalize-space()='Create Rule']")
	WebElement createrule;

	public void createRuleBtn() {
		utillfunnctions.ClickOnElement(createrule);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "[src*='/static/media/database.0']")
	WebElement databasesource;

	public void sourceDataBase() {
		utillfunnctions.ClickOnElement(databasesource);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "[type='text']")
	WebElement filter;

	public void selectFilter() throws InterruptedException, AWTException {
		utillfunnctions.ClickOnElement(filter);

		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Next']")
	WebElement next;

	public void nxtBtn() {
		utillfunnctions.ClickOnElement(next);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "[role='combobox']")
	WebElement selecttable;

	public void selectTable() {
		utillfunnctions.ClickOnElement(selecttable);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	public void selectCategory() throws InterruptedException {
		WebElement ul = driver
				.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']"));
		Thread.sleep(5000);
		List<WebElement> allOptions = ul.findElements(By.tagName("li"));
		for (WebElement selectLi : allOptions) {
			if (selectLi.getText().equals(tableType1)) {
				System.out.println(selectLi.getText());
				selectLi.click();
			}
		}
	}

	@FindBy(xpath = "//button[text()='GO']")
	WebElement go;

	public void hitGo() {
		utillfunnctions.ClickOnElement(go);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "[class*='-root css-d5fg4x']")
	private WebElement columns_DB;
	@FindBy(xpath = "//table[contains(@class,'MuiTable-root css')]/tbody/tr/td[2]")
	private List<WebElement> listColumns_DB;
	@FindBy(css = "[class*='MuiTableCell-root MuiTableCell-body '] [class*='PrivateSwitchBase-input']")
	private List<WebElement> listColumnCheckboxes_DB;

	public void selectColumns() throws InterruptedException {

		Thread.sleep(5000);

		utillfunnctions.scrollDown(driver);
		utillfunnctions.ClickOnElement(columns_DB);
		for (int i = 0; i < listColumns_DB.size(); i++) {
			try {
				if (listColumns_DB.get(i).getText().equalsIgnoreCase(("coloumnname1"))) {

					listColumnCheckboxes_DB.get(i).click();
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		utillfunnctions.ScrollElementUp(driver, columns_DB);
		utillfunnctions.ClickOnElement(columns_DB);

	}

}
