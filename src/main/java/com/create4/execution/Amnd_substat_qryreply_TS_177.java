package com.create4.execution;

import java.io.FileInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_177;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Amnd_substat_qryreply_TS_177
{
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
	public void CRe4_1341() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1341();

	}
/*
	@Test
	public void CRe4_1346() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1346();

	}

	@Test
	public void CRe4_1351() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1351();

	}

	@Test
	public void CRe4_1356() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1356();

	}

	@Test
	public void CRe4_1361() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1361();

	}

	@Test
	public void CRe4_1366() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1366();

	}

	@Test
	public void CRe4_1371() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1371();

	}

	@Test
	public void CRe4_1376() throws Exception {

		TS_177 i1 = new TS_177();
		i1.CRe4_1376();

	}*/

	/*@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}*/

}
