package com.create4.execution;

import java.io.FileInputStream;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_01;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Institute_Creation_TS_01  {

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
	public void CRe4_789() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_789();

	}
	
	@Test
	public void CRe4_790() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_790();

	}
	
	@Test
	public void CRe4_791_792_793_794_795_801_A() throws Exception {

		TS_01 Institute = new TS_01();
		
		Institute.CRe4_791_792_793_794_795_801_A();
		

	}
	
	@Test
	public void CRe4_796() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_796();

	}
	
	@Test
	public void CRe4_797() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_797();

	}
	
	@Test
	public void CRe4_798() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_798();

	}
	
	@Test
	public void CRe4_799() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_799();

	}
	
	@Test
	public void CRe4_800() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_800();

	}
	
	@Test
	public void CRe4_801() throws Exception {

		TS_01 Institute = new TS_01();

		Institute.CRe4_801();

	}
	
	

	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
