package com.create4.execution;

import java.io.FileInputStream;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_01A;

import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Institution_View_Edit_Status_TS_01A  {

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
	public void CRe4_762_763_764_765_766_767_768() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_762_763_764_765_766_767_768();

	}
	
	@Test
	public void CRe4_768() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_768();

	}
	@Test
	public void CRe4_769() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_769();

	}
	@Test
	public void CRe4_770() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_770();

	}
	@Test
	public void CRe4_771_772() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_771_772();

	}
	
	@Test
	public void CRe4_773() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_773();

	}
	@Test
	public void CRe4_774() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_774();

	}
	@Test
	public void CRe4_776() throws Exception {

		TS_01A Institute = new TS_01A();
		
		

		Institute.CRe4_776();

	}
	@Test
	public void CRe4_777() throws Exception {

		TS_01A Institute = new TS_01A();

		Institute.CRe4_777();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
