package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.DataSourcesPageDB;

public class TC_06_DataSourcesDB extends BaseClass {
	
	DataSourcesPageDB snowflakepage;
	
	@Test
	public void Snowflakepage ()  {
		snowflakepage = new DataSourcesPageDB(driver);
		
		snowflakepage.hitDataSources();
		snowflakepage.hitAdd();
		snowflakepage.hitAddNewDB();
		snowflakepage.enterDatasourceName();
		snowflakepage.enterServerName();
		snowflakepage.enterDataBaseName();
		snowflakepage.enterUserName();
		snowflakepage.enterPassword();
		snowflakepage.hitTestBtn();
		
		
		
		
		

}
}
