package com.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.DataProfilingPage;

public class TC_08_DataProfiling extends BaseClass {

	DataProfilingPage DPpage;

	@Test
	public void Rulecollectionpage() throws InterruptedException, AWTException {
		DPpage = new DataProfilingPage(driver);

		DPpage.hitDataSources();
		DPpage.hitAdd();
		DPpage.hitAddNewDB2();
		DPpage.enterDatasourceName();
		DPpage.enterServerName();
		DPpage.enterDataBaseName();
		DPpage.enterUserName();
		DPpage.enterPassword();
		DPpage.hitTestBtn(driver);
		DPpage.clkDataProfiling();
	//	DPpage.selectDB1();
		DPpage.selectReport();
		DPpage.selectDataProfiling();
		DPpage.hitConnection();
		DPpage.hitTable();
		DPpage.hitColoumn();
		DPpage.clkSubmit();
		
		

	}

}
