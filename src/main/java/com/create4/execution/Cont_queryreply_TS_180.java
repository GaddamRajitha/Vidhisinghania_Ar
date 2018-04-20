package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_180;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Cont_queryreply_TS_180 {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}
	

	/*@Test
	public void CRe4_1466_1467_1468() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1466_1467_1468();

	}

	@Test
	public void CRe4_1476_1477_1478() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1476_1477_1478();

	}

	@Test
	public void CRe4_1481_1482_1483() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1481_1482_1483();

	}*/

	@Test
	public void CRe4_1486_1487_1488() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1486_1487_1488();

	}

	/*@Test
	public void CRe4_1491_1492_1493() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1491_1492_1493();

	}

	@Test
	public void CRe4_1496_1497_1498() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1496_1497_1498();

	}

	@Test
	public void CRe4_1501_1502_1503() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1501_1502_1503();

	}

	@Test
	public void CRe4_1506_1507_1508() throws Exception {

		TS_180 i1 = new TS_180();
		i1.CRe4_1506_1507_1508();

	}

	
*/
	/*@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}*/

}
