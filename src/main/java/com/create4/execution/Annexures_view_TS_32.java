package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_32;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Annexures_view_TS_32  {
	
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
	public void CRe4_1109() throws Exception {

		TS_32 DownloadAnnex = new TS_32();

		DownloadAnnex.CRe4_1109();
	}

	@Test
	public void CRe4_1123() throws Exception {

		TS_32 DownloadAnnex = new TS_32();

		DownloadAnnex.CRe4_1123();
	}

	@Test
	public void CRe4_1124() throws Exception {

		TS_32 DownloadAnnex = new TS_32();

		DownloadAnnex.CRe4_1124();
	}

	@Test
	public void CRe4_1125() throws Exception {

		TS_32 DownloadAnnex = new TS_32();

		DownloadAnnex.CRe4_1125();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
