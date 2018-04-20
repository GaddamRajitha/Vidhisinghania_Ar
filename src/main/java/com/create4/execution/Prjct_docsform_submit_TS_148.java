package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_148;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Prjct_docsform_submit_TS_148 {
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
	public void CRe4_2015() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2015();

	}

	@Test
	public void CRe4_2026() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2026();

	}

	@Test
	public void CRe4_2027() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2027();

	}

	@Test
	public void CRe4_2039() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2039();

	}

	@Test
	public void CRe4_2040() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2040();

	}

	@Test
	public void CRe4_2041() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2041();

	}

	@Test
	public void CRe4_2042() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2042();

	}

	@Test
	public void CRe4_2043() throws Exception {

		TS_148 i1 = new TS_148();
		i1.CRe4_2043();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
