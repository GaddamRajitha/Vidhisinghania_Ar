package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_58;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Saefllwexp_prjctstatus4_msdcsn_TS_58  {
	
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
	public void CRe4_1749() throws Exception {

		TS_58 ProjectStatus = new TS_58();

		ProjectStatus.CRe4_1749();

	}

	@Test
	public void CRe4_1754() throws Exception {

		TS_58 ProjectStatus = new TS_58();

		ProjectStatus.CRe4_1754();

	}
	@Test
	public void CRe4_1807() throws Exception {

		TS_58 ProjectStatus = new TS_58();

		ProjectStatus.CRe4_1807();

	}
	@Test
	public void CRe4_1812() throws Exception {

		TS_58 ProjectStatus = new TS_58();

		ProjectStatus.CRe4_1812();

	}


	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
