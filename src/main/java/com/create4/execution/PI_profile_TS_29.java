package com.create4.execution;

import java.io.FileInputStream;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_29;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class PI_profile_TS_29  {

	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_95() throws Exception {

		TS_29 MyProfile = new TS_29();

		MyProfile.CRe4_95();

	}

	@Test
	public void CRe4_96() throws Exception {

		TS_29 MyProfile = new TS_29();

		MyProfile.CRe4_96();

	}

	@Test
	public void CRe4_97_98() throws Exception {

		TS_29 MyProfile = new TS_29();

		MyProfile.CRe4_97_98();

	}

	@Test
	public void CRe4_99() throws Exception {

		TS_29 MyProfile = new TS_29();

		MyProfile.CRe4_99();

	}

	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
