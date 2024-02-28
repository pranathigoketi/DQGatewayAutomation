package com.testcases.CSV;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.CSV.DataProfilingPageCSV;

public class TC_02_DataProfiling_CSV extends BaseClass {

	DataProfilingPageCSV Dpagecsv;

	@Test
	public void Rulecollectionpage() throws InterruptedException, AWTException {
		Dpagecsv = new DataProfilingPageCSV(driver);

		Dpagecsv.hitDataSources1();
		Dpagecsv.hitCsvFile1();
		Dpagecsv.hitAddNew();
		Dpagecsv.enterFileName();
		Dpagecsv.uploadRobotfile1();
		Dpagecsv.hitUpload();
		Dpagecsv.clkDataProfiling();
		Dpagecsv.selectFile1();
		Dpagecsv.selectReport();
		Dpagecsv.selectDataProfiling();
		
		
		
	}
}
