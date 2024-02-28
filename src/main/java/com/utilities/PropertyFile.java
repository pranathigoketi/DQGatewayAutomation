package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	constants constantutility = new constants();
	FileInputStream fis;
	Properties pro;

	public PropertyFile() {
		File f = new File(constantutility.getPropertyFilePath());
		try {
			fis = new FileInputStream(f);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationUrl() {
		String url = pro.getProperty("Url");
		return url;
	}

	public String getApplicationUserName() {
		String username = pro.getProperty("Username");
		return username;
	}

	public String getApplicationPassword() {
		String password = pro.getProperty("Password");
		return password;
	}

	public String getApplicationBrowser() {
		String browser = pro.getProperty("Browser");
		return browser;
	}

	public String getApplicationReportType() {
		String reporttype = pro.getProperty("ReportType");
		return reporttype;
	}

//public String getRuleType() {
//	String ruletype = pro.getProperty("SelectRuleType");
//	return ruletype;
//}

	public String getExportType() {
		String exporttype = pro.getProperty("ExportType");
		return exporttype;
	}

	public String getTableType() {
		String tabletype = pro.getProperty("TableType");
		return tabletype;
	}

	public String getColoumn() {
		String coloumn = pro.getProperty("Coloumn");
		return coloumn;
	}

	public String getReporttype2() {
		String report = pro.getProperty("Detailed Profiling");
		return report;
	}

}