package com.create4.execution;

import java.io.FileInputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_164;
import com.global.methods.GlobalMethods;
import jxl.Sheet;
import jxl.Workbook;

public class Int_prjctflw_queryreply_TS_164  {
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
	public void CRe4_1263() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1263();

	}

	@Test
	public void CRe4_1268() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1268();

	}

	@Test
	public void CRe4_1273() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1273();

	}

	@Test
	public void CRe4_1278() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1278();

	}
	@Test
	public void CRe4_1283() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1283();

	}


   @Test
	public void CRe4_1288() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1288();

	}

	@Test
	public void CRe4_1293() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1293();

	}

	@Test
	public void CRe4_1298() throws Exception {

		TS_164 i1 = new TS_164();
		i1.CRe4_1298();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
