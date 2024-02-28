package com.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.MastersDataPage;

public class TC_04_MastersData extends BaseClass {

	MastersDataPage Mpage;

	@Test
	public void MastersData() throws AWTException {
		Mpage = new MastersDataPage(driver);

		Mpage.hitMastersData();
		Mpage.hitUploadBtn();
		Mpage.enterMasterName();
		Mpage.enterDescription();
		Mpage.uploadRobotfile();
		Mpage.hitUploadFileBtn();
	}
}
