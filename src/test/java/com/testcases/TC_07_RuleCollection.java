package com.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.RuleCollectionPage;

public class TC_07_RuleCollection extends BaseClass {

	RuleCollectionPage Rpage;

	@Test
	public void Rulecollectionpage() throws AWTException, InterruptedException {
		Rpage = new RuleCollectionPage(driver);
		
		
		Rpage.hitDataSources();
		Rpage.hitAdd();
		Rpage.enterDatasourceName();
		Rpage.enterServerName();
		Rpage.enterDataBaseName();
		Rpage.enterUserName();
		Rpage.enterPassword();
		Rpage.hitTestBtn();
		Rpage.hitRuleCollection();
		Rpage.hitCreateNewRule();
		Rpage.enterRuleName();
		Rpage.enterDescription();
		Rpage.selectRule();
		Rpage.selectRuleNo();
	Rpage.ruleGotSelected();
		Rpage.hitSaveBtn();
		Rpage.hitExecute();
		Rpage.hitResult();
		Rpage.hitDQrules();

	}

}
