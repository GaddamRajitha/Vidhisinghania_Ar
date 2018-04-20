package com.create4.execution;

import java.io.FileInputStream;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_03;

import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Institute_update_in_Admin_TS_03  {
	
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		//GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


   @Test
	public void CRe4_846() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_846();

	}
   @Test
	public void CRe4_847() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_847();

	}
	@Test
	public void CRe4_848() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_848();

	}
	
	@Test
	public void CRe4_849() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_849();

	}
	
    @Test
	public void CRe4_850() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_850();

	}
	
	@Test
	public void CRe4_851_852() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_851_852();

	}
	@Test
	public void CRe4_853() throws Exception {

		TS_03 ManageIEC = new TS_03();

		ManageIEC.CRe4_853();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
