package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.ScheduleTestPage;

public class TC_02_ScheduleTest extends BaseClass {

	public ScheduleTestPage Spage;

	@Test
	public void scheduleTest() throws InterruptedException {

		Spage = new ScheduleTestPage(driver);

		Spage.hitscheduleTest();
		Spage.hitcreatenewscheduleTest();
		Spage.enterTestName();
		Spage.enterDescription();
		Spage.enterRuleType();
		Spage.selectRuleType();
		Spage.selectDQRuleType();
		Spage.hitruleno();
//		Spage.selectDQRulesType();
		Spage.selectDate();
		Spage.hitSaveBtn();

	}

}
