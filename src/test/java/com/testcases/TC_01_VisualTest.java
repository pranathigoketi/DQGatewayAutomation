package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.VisualTestPage;

public class TC_01_VisualTest extends BaseClass {

	public VisualTestPage Vpage;

	@Test
	public void visualTest() {

		Vpage = new VisualTestPage(driver);

		Vpage.hitvisualTest();
		Vpage.hitcreateNewBtn();
		Vpage.entertestName();
		Vpage.selectTreshold();
		Vpage.selectValue();
		Vpage.selectDifferences();
		Vpage.enterAppURL();
		Vpage.enterAppName();
		Vpage.hitSubmit();

	}
}
