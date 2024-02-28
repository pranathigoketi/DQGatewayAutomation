package com.utilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtillFunctions {
	Actions action;
	Select select;

	WebDriver driver;
	WebDriverWait wait;

	public UtillFunctions(WebDriver driver) {
		this.driver = driver;
	}

	public void explicitWaitToVisibilityOfElement(int time, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void ClickOnElement(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void selectValue(WebElement element) {
		select = new Select(element);
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");

	}

	public void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void windowHandle(String title) {
		Set<String> allwindowhandleID = driver.getWindowHandles();
		for (String wind : allwindowhandleID) {
			String currentTitle = driver.switchTo().window(wind).getTitle();
			if (currentTitle.contains(title)) {
				break;
			}
		}
	}

	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		// js.executeScript("window.scrollBy(x,y)");

	}

	@SuppressWarnings("null")
	public void scrollDown1(WebDriver driver, WebElement element) {
		WebElement scroll = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		scroll.click();

	}

	public static void ElementHightlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	public void ScrollElementdown(WebDriver driver, WebElement element) {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,2000)", "");
	}

	public void ScrollElementUp(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public static void ScrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void ClickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();", element);
	}

	public void Title(WebDriver driver, WebElement element) {
		driver.getTitle();

	}

	public void Styling(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}
	
	public void ElementClick(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	
}
