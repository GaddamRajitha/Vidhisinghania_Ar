package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_52;
import com.create4.scenarios.TS_53;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Devexp_prjctstatus4_msdcsn_TS_53 {
	
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
	public void CRe4_1389() throws Exception {

		TS_53 ProjectStatus = new TS_53();

		ProjectStatus.CRe4_1389();

	}
	@Test
	public void CRe4_1394() throws Exception {

		TS_53 ProjectStatus = new TS_53();

		ProjectStatus.CRe4_1394();

	}
	@Test
	public void CRe4_1399() throws Exception {

		TS_53 ProjectStatus = new TS_53();

		ProjectStatus.CRe4_1399();

	}
	@Test
	public void CRe4_1404() throws Exception {

		TS_53 ProjectStatus = new TS_53();

		ProjectStatus.CRe4_1404();

	}
	@Test
	public void CRe4_1409() throws Exception {

		TS_53 ProjectStatus = new TS_53();

		ProjectStatus.CRe4_1409();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
