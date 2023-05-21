package com.GCMS.testbase;

import com.GCMS.pages.LoginPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;

	public static void Initialize() {

		loginPage = new LoginPage();
		
	}
}
