package com.create4.execution;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.global.methods.*;

import jxl.Sheet;
import jxl.Workbook;

import com.create4.scenarios.*;

public class SOP_add_TS_06A{
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
	public void CRe4_855() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_855();

	}

	@Test
	public void CRe4_876() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_876();

	}
	
	@Test
	public void CRe4_877() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_877();

	}
	
	@Test
	public void CRe4_878() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_878();

	}
	
	@Test
	public void CRe4_880() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_880();

	}
	
	@Test
	public void CRe4_881() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_881();

	}
	
	@Test
	public void CRe4_882() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_882();

	}
	
	@Test
	public void CRe4_883() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_883();

	}
	
	@Test
	public void CRe4_884() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_884();

	}
	
	@Test
	public void CRe4_887() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_887();

	}
	
	@Test
	public void CRe4_888() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_888();

	}
	
	@Test
	public void CRe4_892() throws Exception{

		TS_06A i1=new TS_06A();
		i1.CRe4_892();

	}
	
	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}


}
