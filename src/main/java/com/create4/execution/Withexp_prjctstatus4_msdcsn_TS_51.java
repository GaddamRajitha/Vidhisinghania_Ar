package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.create4.scenarios.TS_51;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Withexp_prjctstatus4_msdcsn_TS_51 {
	
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
	public void CRe4_1221() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1221();

	}
	@Test
	public void CRe4_1226() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1226();

	}
	@Test
	public void CRe4_1231() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1231();

	}
	@Test
	public void CRe4_1236() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1236();

	}
	@Test
	public void CRe4_1241() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1241();

	}
	@Test
	public void CRe4_1246() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1246();

	}
	@Test
	public void CRe4_1251() throws Exception {

		TS_51 ProjectStatus = new TS_51();

		ProjectStatus.CRe4_1251();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
