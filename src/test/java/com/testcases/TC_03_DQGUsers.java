package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.DQGusersPage;

public class TC_03_DQGUsers extends BaseClass {

	public DQGusersPage Dpage;

	@Test
	public void DQGatewayUsers() {
		Dpage = new DQGusersPage(driver);

		Dpage.hitDQGUsers();
		Dpage.getTitle();
		Dpage.selectPage();
		Dpage.selectUsers();

	}

}
