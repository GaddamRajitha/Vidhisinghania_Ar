package com.create4.scenarios;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

//***Check for Add Department with valid/Invalid data ((After creation should display in the List/Registration forms/Member forms)***//
public class TS_12A {

	public TS_12A() {
		// this.driver=driver;
		// driver = GlobalMethods.driver;
		PageFactory.initElements(GlobalMethods.driver, this);
	}
	
	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li[4]/a")
	WebElement Manage_IEC;

	@FindBy(xpath = "//li[4]/ul/li[4]/a")
	WebElement Manage_Departments;

	@FindBy(css = ".col-sm-10.col-xs-12.main-right>h3")
	WebElement Verify_DepartmentsName;

	@FindBy(xpath = "html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a")
	WebElement Add_Departments;

	@FindBy(css = ".col-sm-10.col-xs-12.main-right>h3")
	WebElement Verify_AddDepartmentstxt;

	@FindBy(id = "addDepartmentButton")
	WebElement Submit_AddDepart;

	@FindBy(css = ".help-block")
	WebElement Submit_BlankAlert;

	@FindBy(id = "add_department_name")
	WebElement AddDepartmentTextbox;

	@FindBy(css = ".bg-success.text-success.col-sm-12.text-center")
	WebElement AddDepartmentPopuptext;

	@FindBy(xpath = "//td[contains(text(),'QuadQC')]")
	WebElement DepartValue;

	@FindBy(linkText="Logout")
	WebElement LogOut;

	public void AddDepartment_CRe4_917_18_19_10() throws Exception {
		
			// ----------IEC Admin Login------------//
			GlobalMethods.Admin_Login();

			FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
			Workbook wb = Workbook.getWorkbook(fi);
			Sheet r = wb.getSheet("ManageIEC");

			String ManageDepart_text = r.getCell(2,1).getContents();
			String AddDepart_text = r.getCell(3,1).getContents();
			String AddDepartName_data = r.getCell(4,1).getContents();

			WebElement Manage_IECA=GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
			Manage_IECA.click();
			
			//----------Check for 'Manage Departments' in Manage IEC(CRe4_910) -------------//
			
			WebElement Manage_DepartmentsA=GWait.Wait_GetElementByXpath("//li[4]/ul/li[4]/a");
			Manage_DepartmentsA.click();
			
			//---------Check for add department(CRe4_917)---------------//
			
			WebElement Verify_DepartmentsNameA=GWait.Wait_GetElementByCSS(".col-sm-10.col-xs-12.main-right>h3");
			System.out.println(Verify_DepartmentsNameA.getText());
			System.out.println(ManageDepart_text);
			System.out.println(Verify_DepartmentsNameA.getText().equalsIgnoreCase(ManageDepart_text));

			WebElement Add_DepartmentsA=GWait.Wait_GetElementByXpath("html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a");
			Add_DepartmentsA.click();

			WebElement Verify_AddDepartmentstxtA=GWait.Wait_GetElementByCSS(".col-sm-10.col-xs-12.main-right>h3");
			System.out.println(Verify_AddDepartmentstxtA.getText());
			System.out.println(AddDepart_text);
			System.out.println(Verify_AddDepartmentstxtA.getText().equalsIgnoreCase(AddDepart_text));

			// ------Check for add department with blank data-----Test cases ==
			// CRe4_918---//
			
			System.out.println("Test cases == CRe4_918");
			WebElement Submit_AddDepartA=GWait.Wait_GetElementById("addDepartmentButton");
			Submit_AddDepartA.click();
			WebElement  Submit_BlankAlertA=GWait.Wait_GetElementByCSS(".help-block");
			System.out.println(Submit_BlankAlertA.getText());
            Assert.assertEquals(Submit_BlankAlertA.getText(),"Department field is required!");
            
			// ------Check for add department with valid data-----Test cases ==CRe4_919---//
			
			System.out.println("Test cases == CRe4_919");
			WebElement AddDepartmentTextboxA=GWait.Wait_GetElementById("add_department_name");
			AddDepartmentTextboxA.sendKeys(AddDepartName_data);
			WebElement Submit_AddDepartB=GWait.Wait_GetElementById("addDepartmentButton");
			Submit_AddDepartB.click();
			WebElement AddDepartmentPopuptextA=GWait.Wait_GetElementByCSS(".bg-success.text-success.col-sm-12.text-center");
			System.out.println(AddDepartmentPopuptextA.getText());
            Assert.assertEquals(AddDepartmentPopuptextA.getText(),"Department added successfully.");
            
			// --Check for 'Action>>Edit' field--//
			Thread.sleep(4500);
			WebElement table_element = GlobalMethods.driver.findElement(By.cssSelector(".table.table-striped>tbody"));
			ArrayList<WebElement> rows = (ArrayList<WebElement>) table_element.findElements(By.tagName("tr"));
			for (WebElement row : rows) {
				ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td"));
				for (WebElement cell : cells) {
					System.out.println(cell.getText());
					System.out.println(cell.getText().equalsIgnoreCase(AddDepartName_data));

				}

			}

			WebElement LogOutA=GWait.Wait_GetElementByLinkText("Logout");
			LogOutA.click();
		
	}

	@FindBy(xpath = "html/body/div[1]/div[1]/div[1]/a[1]/img")
	WebElement Logo;

	@FindBy(linkText = "Research approval institute")
	WebElement StudyLink;

	@FindBy(css = ".btn.btn-primary.col-sm-12.register-class")
	WebElement Registration;

	@FindBy(id = "dept")
	WebElement Deprt;

	@FindBy(xpath = "html/body/div[5]/div/div/div/div/form/div[2]/div[1]/div/div/select/option")
	List<WebElement> DeprtValue;

	public void AddDepartment_CRe4_920() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("ManageIEC");
		String AddDepartName_data = r1.getCell(2,7).getContents();
		String Institutename = r1.getCell(3,7).getContents();
		
			// ----------Click to 'Research approval institute'------------//
		    WebElement StudyLinkA=GWait.Wait_GetElementByLinkText(Institutename);
			StudyLinkA.click();

			
			System.out.println("*"+AddDepartName_data);

			WebElement RegistrationA=GWait.Wait_GetElementByCSS(".btn.btn-primary.col-sm-12.register-class");
			RegistrationA.click();
			WebElement DeprtA=GWait.Wait_GetElementById("dept");
			DeprtA.click();
            Select s=new Select(GlobalMethods.driver.findElement(By.id("dept")));
         
            s.selectByVisibleText(AddDepartName_data);
            System.out.println("test"+s.getFirstSelectedOption().getText());
            String s11=s.getFirstSelectedOption().getText();
            Assert.assertEquals(s11, AddDepartName_data);
		
	}

}
