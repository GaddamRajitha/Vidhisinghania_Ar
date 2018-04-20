package com.create4.execution;

import java.io.FileInputStream;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.create4.scenarios.TS_25;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class PI_Registration_TS_25  {

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
	public void Register_CRe4_33_34_35_36() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.Register_CRe4_33_34_35_36();

	}

	@Test
	public void CRe4_37_38_39_40_41_44() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.CRe4_37_38_39_40_41_44();

	}
	
	@Test
	public void RegisterIECadmin_CRe4_46_47() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.RegisterIECadmin_CRe4_46_47();

	}

	@Test
	public void RegisterIECadmin_CRe4_45() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.RegisterIECadmin_CRe4_45();

	}
	@Test
	public void CRe4_48_49_50_51_52_54_55_55_a() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.CRe4_48_49_50_51_52_54_55_55_a();

	}
	
	//spaces its not trimming 
	/*@Test
	public void CRe4_53() throws Exception {

		TS_25 Institute = new TS_25();

		Institute.CRe4_53();

	}*/
	

  /*@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}*/

}
