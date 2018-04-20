package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_147;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Prjct_summary_validation_TS_147  {
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
	public void CRe4_1993() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_1993();

	}

	@Test
	public void CRe4_1996() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_1996();

	}

	@Test
	public void CRe4_1997() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_1997();

	}

	@Test
	public void CRe4_1998() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_1998();

	}

	@Test
	public void CRe4_2001() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2001();

	}

	@Test
	public void CRe4_2002() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2002();

	}

	@Test
	public void CRe4_2003() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2003();

	}

	@Test
	public void CRe4_2006() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2006();

	}

	@Test
	public void CRe4_2007() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2007();

	}

	@Test
	public void CRe4_2010_2013() throws Exception {

		TS_147 i1 = new TS_147();
		i1.CRe4_2010_2013();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
