package com.create4.execution;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_26;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Manage_Registration_Requests_TS_26 {
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
	public void Register_CRe4_58_59_60_61() throws Exception {

		TS_26 i1 = new TS_26();
		i1.Register_CRe4_58_59_60_61();

	}
	
	
	@Test
	public void Register_CRe4_64_65() throws Exception {

		TS_26 i1 = new TS_26();
		i1.Register_CRe4_64_65();

	}
	
	@Test
	public void Register_CRe4_70_71_72_73_74() throws Exception {

		TS_26 i1 = new TS_26();
		i1.Register_CRe4_70_71_72_73_74();

	}

	

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
