package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_137;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Othr_profile_update_TS_137 {

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
	public void CRe4_706_707() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_706_707();
	}

	@Test
	public void CRe4_708() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_708();
	}

	@Test
	public void CRe4_709() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_709();
	}

	@Test
	public void CRe4_710() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_710();
	}
	@Test
	public void CRe4_711_712() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_711_712();
	}
	@Test
	public void CRe4_713() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_713();
	}
	@Test
	public void CRe4_714() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_714();
	}
	@Test
	public void CRe4_715() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_715();
	}
	@Test
	public void CRe4_716() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_716();
	}
	@Test
	public void CRe4_717() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_717();
	}
	@Test
	public void CRe4_718() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_718();
	}
	@Test
	public void CRe4_721_722() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_721_722();
	}

	@Test
	public void CRe4_724_725_726_727() throws Exception {

		TS_137 MemberMyAccount = new TS_137();

		MemberMyAccount.CRe4_724_725_726_727();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
