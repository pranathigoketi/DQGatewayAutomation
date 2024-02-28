package com.pagefactory.CSV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DataProfilingPageCSV extends BaseClass {

	WebDriver driver;

	public DataProfilingPageCSV(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Data Sources'])[1]")
	WebElement datasources1;

	public void hitDataSources1() {
		utillfunnctions.ClickOnElement(datasources1);
		try {
			Thread.sleep(11000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//*[@src='/assets/uploads/csv.png']")
	WebElement CSV1;

	public void hitCsvFile1() {
		utillfunnctions.ClickOnElement(CSV1);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}
	
	@FindBy(xpath = "//button[text()='Add new']")
	WebElement addnew;

	public void hitAddNew() {
		utillfunnctions.ClickOnElement(addnew);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}


	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement filename1;

	public void enterFileName() {
		utillfunnctions.sendText(filename1, "CSV_File_No_880");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//button[text()='Browse']")
	WebElement uploadcsvfile1;

	public void uploadRobotfile1() throws AWTException, InterruptedException {
		utillfunnctions.ClickOnElement(uploadcsvfile1);
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
	WebElement upload1;

	public void hitUpload() {
		utillfunnctions.ClickOnElement(upload1);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@FindBy(css = "a[class='active'] span[class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-16kocxl']")
	WebElement hitdataprofiling;

	public void clkDataProfiling() {
		utillfunnctions.ClickOnElement(hitdataprofiling);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}

	}

	@FindBy(css = "input[value='database']")
	WebElement selectfile1;

	public void selectFile1() {
		utillfunnctions.ClickOnElement(selectfile1);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")
	WebElement repottypefile;

	public void selectReport() {
		utillfunnctions.ClickOnElement(repottypefile);
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
			if (selectLi.getText().equals(report1)) {
				System.out.println(selectLi.getText());
				selectLi.click();
			}
		}
	}

	

}
