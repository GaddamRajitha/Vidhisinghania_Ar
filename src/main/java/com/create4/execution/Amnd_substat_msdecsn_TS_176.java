package com.create4.execution;

import java.io.FileInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_176;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Amnd_substat_msdecsn_TS_176 {
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
	public void CRe4_1313() throws Exception {

		TS_176 i1 = new TS_176();
		i1.CRe4_1313();

	}

	@Test
	public void CRe4_1318() throws Exception {

		TS_176 i1 = new TS_176();
		i1.CRe4_1318();

	}

	@Test
	public void CRe4_1323() throws Exception {

		TS_176 i1 = new TS_176();
		i1.CRe4_1323();

	}

	@Test
	public void CRe4_1328() throws Exception {

		TS_176 i1 = new TS_176();
		i1.CRe4_1328();

	}
	
	@Test
	public void CRe4_1333() throws Exception {

		TS_176 i1 = new TS_176();
		i1.CRe4_1333();

	}

	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
