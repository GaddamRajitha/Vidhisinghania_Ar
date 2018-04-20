package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_128;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Allrole_menus_TS_128  {
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
	public void CRe4_596_597() throws Exception {

		TS_128 i1 = new TS_128();
		i1.CRe4_596_597();

	}

	@Test
	public void CRe4_598_99() throws Exception {

		TS_128 i1 = new TS_128();
		i1.CRe4_598_99();

	}

	@Test
	public void CRe4_600_601() throws Exception {

		TS_128 i1 = new TS_128();
		i1.CRe4_600_601();

	}

	@Test
	public void CRe4_602_603_604_605() throws Exception {

		TS_128 i1 = new TS_128();
		i1.CRe4_602_603_604_605();

	}

	@Test
	public void CRe4_606_607() throws Exception {

		TS_128 i1 = new TS_128();
		i1.CRe4_606_607();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
