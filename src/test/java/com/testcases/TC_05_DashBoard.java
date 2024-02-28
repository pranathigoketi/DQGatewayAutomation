package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.DashBoardPage;

public class TC_05_DashBoard extends BaseClass {

	DashBoardPage Dspage;

	@Test
	public void MastersData() throws InterruptedException {
		Dspage = new DashBoardPage(driver);

		Dspage.hitDasboard();
		Dspage.hitTitle();
		Dspage.hitScheduleRuleSet();
		Dspage.hitFromDate();
		Dspage.pickDate();
		Dspage.toDate();
		Dspage.pickDate1();
		Dspage.exportButton();
		// Dpage.exportJPEG();
		Dspage.export();

	}

}
