package com.base;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pagefactory.LoginPage;
import com.pagefactory.PopupPage;
import com.pagefactory.RuleCollectionPage;
import com.utilities.*;
import com.utilities.PropertyFile;
import com.utilities.CreateLog;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public PropertyFile propertyfile = new PropertyFile();

	public LoginPage page;
	public PopupPage  ppage;

	public CreateLog log = new CreateLog();
	public static UtillFunctions utillfunnctions = new UtillFunctions(driver);
	public Validations validations = new Validations();
	public ReadExcelFile readexcel = new ReadExcelFile();

	String url = propertyfile.getApplicationUrl();
	String browser = propertyfile.getApplicationBrowser();
	public String userName1 = propertyfile.getApplicationUserName();
	public String password1 = propertyfile.getApplicationPassword();
	
	public String reportType1 = propertyfile.getApplicationReportType();
	//public String ruletype1  = propertyfile.getRuleType();
	public String exportType1 = propertyfile.getExportType();
	public String tableType1 = propertyfile.getTableType();
	public String coloumnname1 = propertyfile.getColoumn();
	public String report1 = propertyfile.getReporttype2();
	


	@BeforeClass
	public void setup() {
		switch (browser) {
		case "chrome":
			chromeBrowser();
			break;
		case "firefox":
			firefoxBrowser();
			break;
		case "edge":
			edgeBrowser();
			break;
		default:
			error();
		}
	}

	@BeforeMethod
	public void login() {
		page = new LoginPage(driver);
	
		page.clkLoginBtn();
		ppage=new PopupPage(driver);
		ppage.enteringUsername();
		ppage.hitclkButton();
		ppage.enteringPassword();
		ppage.hitsigninBtn();
		ppage.hityesBtn();
		ppage.hitconfirmBtn();

	}

	
	public void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("ChromeBrowser is launched");
		url();
	}

	public void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		log.info("firefoxBrowser is launched");
		url();
	}

	public void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		url();
		log.info("edge browser is launched");
	}

	public void error() {
		System.err.println("unknown Browser");
		log.info("unknown Browser");
	}

	public void url() {
		driver.get(url);
		log.info("DQG is launched");
		driver.manage().window().maximize();
		log.info("window is maximezed");

	}

	public void maximizeBrowser() {
		utillfunnctions.maximizeWindow();
	}

	public String browserName() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername = cap.getBrowserName().toLowerCase();
		return browsername;
	}

	public String browserversion() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserversion = cap.getBrowserVersion().toString();
		return browserversion;
	}
	
	
	
//	  @AfterClass public void tearDown() { driver.quit();
//	  log.info("Browser closed"); }
	 


}
