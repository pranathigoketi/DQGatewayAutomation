package com.testcases.CSV;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.CSV.RuleCollectionPageCSV;

public class TC_01_Rulecollection_CSV extends BaseClass {

	RuleCollectionPageCSV Rcpage;

	@Test
	public void RulecollectionpageCsv() throws AWTException, InterruptedException {
		Rcpage = new RuleCollectionPageCSV(driver);

		Rcpage.hitDataSources();
		Rcpage.hitCsvFile();
		Rcpage.hitAddNew1();
		Rcpage.enterFileName();
		Rcpage.uploadRobotfile1();
		Rcpage.hitUpload();
		Rcpage.hitRuleCollection();
		Rcpage.hitCreateNewRule();
		Rcpage.enterRuleName();
		Rcpage.enterDescription();
		Rcpage.selectRule();
		Rcpage.selectRuleNo();
		Rcpage.ruleGotSelected();
		Rcpage.hitSaveBtn();

	}

}
