package com.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.github.dockerjava.api.model.Ulimit;

public class DashBoardPage extends BaseClass {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	WebElement dashboard;

	public void hitDasboard() {
		utillfunnctions.ClickOnElement(dashboard);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//div[text() ='Dashboard']")
	WebElement title;

	public void hitTitle() {
		utillfunnctions.Title(driver, title);
		System.out.println("Title is Dashboard");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

		utillfunnctions.scrollDown(driver);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}

	}

	@FindBy(xpath = "//*[local-name()='svg'] [@data-testid='AccessTimeOutlinedIcon']")
	WebElement scheduleruleset;

	public void hitScheduleRuleSet() {
		utillfunnctions.ClickOnElement(scheduleruleset);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
		utillfunnctions.ClickOnElement(dashboard);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "//*[local-name()='svg'] [@data-testid='CalendarIcon'] ")
	WebElement fromdate;

	public void hitFromDate() {
		utillfunnctions.ClickOnElement(fromdate);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {

		}
	}

	@FindBy(xpath = "	//button[normalize-space()='19']")
	WebElement pickthedate;

	public void pickDate() {
		utillfunnctions.ClickOnElement(pickthedate);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

	}

	@FindBy(xpath = "(//*[local-name()='svg'] [@data-testid='CalendarIcon'])[2]")
	WebElement todate;

	public void toDate() {
		utillfunnctions.ClickOnElement(todate);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

	}

	@FindBy(xpath = "//button[normalize-space()='1']")
	WebElement pickthedate1;

	public void pickDate1() {
		utillfunnctions.ClickOnElement(pickthedate1);
		try {
			Thread.sleep(9000);
		} catch (Exception e) {
		}

	}

	@FindBy(css = "[class=\"dx-export-menu-button\"]")
	WebElement export;

	public void exportButton() {
		utillfunnctions.ClickOnElement(export);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}

	}

	@FindBy(xpath = "//*[text()='JPEG file']")
	WebElement file;

	public void exportJPEG() {
		utillfunnctions.ClickOnElement(file);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

	}

	public void export() throws InterruptedException {
		WebElement li = driver.findElement(By.xpath("//*[@class='dx-export-menu-list']"));
		System.out.println("elements are there");
		Thread.sleep(13000);
		List<WebElement> Options = li.findElements(By.tagName("g"));
		for (WebElement selectG : Options) {
			if (selectG.getText().contains(exportType1)) {
				System.out.println(selectG.getText());
				selectG.click();

			}
		}
	}
}
