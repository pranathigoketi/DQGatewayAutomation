package com.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.DQRulesPage;

public class TC_09_DQRules extends BaseClass {

	DQRulesPage Drpage;

	@Test
	public void MastersData() throws InterruptedException, AWTException {
		Drpage = new DQRulesPage(driver);

		Drpage.hitDataSources();
		Drpage.hitAdd();
		Drpage.hitAddNewDB1();
		Drpage.enterDatasourceName();
		Drpage.enterServerName();
		Drpage.enterDataBaseName();
		Drpage.enterUserName();
		Drpage.enterPassword();
		Drpage.hitTestBtn(driver);
		Drpage.hitDqrules();
		Drpage.createRuleBtn();
		Drpage.sourceDataBase();
		Drpage.selectFilter();
		Drpage.nxtBtn();
		Drpage.selectTable();
		Drpage.selectCategory();
		Drpage.hitGo();
		Drpage.selectColumns();
		
	}
}