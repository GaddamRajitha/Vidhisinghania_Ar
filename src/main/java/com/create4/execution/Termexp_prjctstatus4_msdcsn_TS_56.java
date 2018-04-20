package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_55;
import com.create4.scenarios.TS_56;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Termexp_prjctstatus4_msdcsn_TS_56{

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
	public void CRe4_1601() throws Exception {

		TS_56 ProjectStatus = new TS_56();

		ProjectStatus.CRe4_1601();

	}
	@Test
	public void CRe4_1606() throws Exception {

		TS_56 ProjectStatus = new TS_56();

		ProjectStatus.CRe4_1606();

	}
	@Test
	public void CRe4_1611() throws Exception {

		TS_56 ProjectStatus = new TS_56();

		ProjectStatus.CRe4_1611();

	}
	@Test
	public void CRe4_1616() throws Exception {

		TS_56 ProjectStatus = new TS_56();

		ProjectStatus.CRe4_1616();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}
}
