package com.create4.scenarios;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

//Check Edit feature for Provisional/Suspension/Query/Resubmission/Returned letter

public class TS_167 {

	public TS_167() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}
	
	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);
	// PI submit new project page elements

	@FindBy(linkText = "Submit New Project")
	WebElement createproject;
	
	@FindBy(xpath = "//*[@id='documentuploadprojectsuspension']/div/div[1]/div[1]/div/div[1]/button")
	public WebElement docdrop_sus;
	@FindBy(xpath = "//*[@id='documentuploadprojectsuspension']/div/div[1]/div[1]/div/div[1]/div/ul/li")
	public static List<WebElement> docvalue_sus;
	

	@FindBy(linkText = "My Projects")
	WebElement PI_project_menu;

	@FindBy(linkText = "Projects")
	WebElement MS_project_menu;

	@FindBy(linkText = "Archived Projects")
	WebElement PI_archived_menu;

	@FindBy(xpath = ".//*[@id='projectsummary']/div/div[1]/div[1]/div/div/button")
	public WebElement projtypdrop;

	@FindBy(xpath = "html/body/div[5]/div[1]/div[3]/div[4]/div[1]/form/div/div[1]/div[1]/div/div/div/ul/li")
	public static List<WebElement> projtypvalue;

	// review type selection element

	@FindBy(xpath = "//*[@id='projectsummary']/div/div[2]/div[1]/div/div/button")
	public WebElement revtypdrop;
	@FindBy(xpath = "html/body/div[5]/div[1]/div[3]/div[4]/div[1]/form/div/div[2]/div[1]/div/div/div/ul/li")
	public static List<WebElement> revtypvalue;

	@FindBy(id = "projecttitle")
	WebElement Full_title;

	@FindBy(id = "projectshorttitle")
	WebElement short_title;

	@FindBy(id = "pi_name")
	WebElement PI_Name;

	@FindBy(id = "project_description")
	WebElement sponsor;

	@FindBy(xpath = "//*[@id='sumsave']")
	WebElement save_button1;

	@FindBy(id = "sumsave")
	WebElement save_button3;

	// document type selection element_initial

	@FindBy(xpath = "//*[@id='document_type']/div/button")
	public WebElement docdrop;
	@FindBy(xpath = "//*[@id='document_type']/div/div/ul/li")
	public static List<WebElement> docvalue;

	// document type selection element_continuing

	@FindBy(xpath = "//*[@id='submitnewuploadproject']/div/div[1]/div[2]/div/div/button")
	public WebElement docdrop_c;
	@FindBy(xpath = "//*[@id='submitnewuploadproject']/div/div[1]/div[2]/div/div/div/ul/li")
	public static List<WebElement> docvalue_c;

	@FindBy(id = "document_title")
	WebElement doc_title;

	@FindBy(id = "version")
	WebElement doc_version;

	@FindBy(id = "proj_document")
	WebElement upload_doc;

	@FindBy(id = "document_date")
	WebElement doc_date;

	@FindBy(id = "savedoc")
	WebElement save_button2;

	@FindBy(id = "nextid")
	WebElement next_button1;

	@FindBy(linkText = "Download the template form")
	WebElement dwnld_temp_link;

	@FindBy(linkText = "Back")
	WebElement back_button1;

	@FindBy(id = "nextid")
	WebElement save_as_draft;

	@FindBy(id = "submitid")
	WebElement submit_to_IEC;

	@FindBy(xpath = "//span")
	WebElement Login_PI_Name;

	@FindBy(xpath = "//div[@id='list_documents']/div/div/table/tbody/tr/td")
	WebElement doctype_List;

	@FindBy(xpath = "//div[@id='list_documents']/div/div/table/tbody/tr/td[2]")
	WebElement doctype_title;

	@FindBy(xpath = "//div[@id='list_documents']/div/div/table/tbody/tr/td[3]")
	WebElement doctype_version;

	@FindBy(xpath = "//div[@id='list_documents']/div/div/table/tbody/tr/td[4]")
	WebElement doctype_date;

	@FindBy(className = "studyteam_members")
	WebElement yes;

	@FindBy(xpath = "(//input[@name='studyteam_members'])[2]")
	WebElement no;

	@FindBy(id = "submit_for_iec_review_confirm")
	WebElement conflictsubmit;

	@FindBy(xpath = "//span[3]/a")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	@FindBy(css = "li.active > a")
	WebElement dash;

	@FindBy(xpath = "//li[4]/a/span")
	WebElement Ongoingprojects;

	@FindBy(xpath = "//td[9]/a/span")
	WebElement approvedprojoverview;

	// Admin IEC admin review page elements

	@FindBy(css = "span.pull-left")
	WebElement Dashboard_newsubmission;

	@FindBy(xpath = "//td[10]/a/span")
	WebElement Projectoverview;

	@FindBy(linkText = "IEC Admin Review")
	WebElement Admin_Review;

	@FindBy(id = "processing_fee_paid")
	WebElement Processing_fee_yes;

	@FindBy(id = "payment_receipt")
	WebElement payment_receipt_yes;

	@FindBy(id = "hard_copy_submitted")
	WebElement hard_copy_yes;

	@FindBy(id = "inward_no")
	WebElement inward_no_yes;

	@FindBy(id = "project_number")
	WebElement projnum;

	@FindBy(id = "insurance_date")
	WebElement insurdate;

	@FindBy(id = "inward_no_date")
	WebElement inwdate;

	@FindBy(id = "forward_modal_btn")
	WebElement forward_button;

	@FindBy(id = "txn_ethic_committee_id")
	WebElement ethic_selection;

	@FindBy(id = "forward_comments")
	WebElement ethic_comments;

	@FindBy(id = "ms_name")
	WebElement ethic_ms_name;

	@FindBy(id = "forward_btn")
	WebElement ethic_frwd;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement ethic_cancel;

	@FindBy(xpath = "//div[@id='flash_message_admin']/p")
	WebElement ethic_frwd_acknowledge;

	@FindBy(css = "span.fa.fa-eye")
	WebElement overview;

	@FindBy(xpath = "//body/div[5]/div/div/div[2]/div[3]/div[1]/p")
	WebElement projectmsg;

	// Member Secretary page elements

	@FindBy(linkText = "Projects")
	WebElement projectslink;

	@FindBy(linkText = "Assign Reviewer(s)")
	WebElement asignreviewers;

	@FindBy(id = "primary_reviewer")
	WebElement primaryreview_one;

	@FindBy(name = "nontech_primary_reviewer1")
	WebElement nonprimaryreview_one;

	@FindBy(name = "tech_primary_reviewer2")
	WebElement primaryreview_two;

	@FindBy(name = "nontech_primary_reviewer2")
	WebElement nonprimaryreview_two;

	@FindBy(name = "tech_primary_reviewer3")
	WebElement primaryreview_three;

	@FindBy(name = "nontech_primary_reviewer3")
	WebElement nonprimaryreview_three;

	@FindBy(id = "comments")
	WebElement assign_comments;

	@FindBy(id = "assign")
	WebElement assign_button;

	@FindBy(css = "div.flash.alert-info > p")
	WebElement assignreviewer_msg;

	@FindBy(linkText = "msmembercomments")
	WebElement membercomments;

	@FindBy(linkText = "IEC Decision")
	WebElement iecdecisiontab;

	@FindBy(id = "decision_type")
	WebElement decisondropdown;

	@FindBy(id = "proj_document")
	WebElement decisionupload;

	@FindBy(xpath = "//input[@value='Submit']")
	WebElement decisionusubmit;

	// Subsequent submission links elements

	@FindBy(linkText = "Submit New Documents")
	WebElement newdocuments;

	@FindBy(linkText = "Amendment")
	WebElement amend;

	@FindBy(linkText = "Deviation")
	WebElement deviat;

	@FindBy(linkText = "Continuation")
	WebElement continu;

	@FindBy(linkText = "Completion")
	WebElement complet;

	@FindBy(linkText = "Premature Termination")
	WebElement premterm;

	@FindBy(linkText = "SAE")
	WebElement seriousadverse;

	@FindBy(linkText = "Other")
	WebElement othr;

	// Amendment form fields elements

	@FindBy(css = "label.col-sm-3.offset-0")
	WebElement subtype_one;

	@FindBy(xpath = "//form[@id='submitnewuploadproject']/div/div/div[2]/label")
	WebElement doctype_two;

	@FindBy(xpath = "//form[@id='submitnewuploadproject']/div/div/div[3]/label")
	WebElement version_three;

	@FindBy(xpath = "//form[@id='submitnewuploadproject']/div/div/div[4]/label")
	WebElement docdate_four;

	@FindBy(xpath = "//div[@id='review_type']/label")
	WebElement revtype_five;

	@FindBy(xpath = "//form[@id='submitnewuploadproject']/div/div[2]/div[2]/label")
	WebElement doctitle_six;

	@FindBy(id = "savedoc")
	WebElement savdoc_seven;

	@FindBy(id = "proj_document")
	WebElement uploaddoc_seven;

	@FindBy(linkText = "Dashboard")
	WebElement dash_board;

	@FindBy(xpath = "//div[2]/div/div/ul/li[7]/a/span")
	WebElement deviation_dashboard;

	// sussequent doctype upload

	@FindBy(xpath = "//*[@id='submitnewuploadproject']/div/div[1]/div[2]/div/div/button")
	public WebElement docdrop1;
	@FindBy(xpath = "//*[@id='submitnewuploadproject']/div/div[1]/div[2]/div/div/div/ul/li")
	public static List<WebElement> docvalue1;

	@FindBy(xpath = "//*[@id='respondqueryupload']/div/div[1]/div[1]/div/div/button")
	public WebElement docdrop2;
	@FindBy(xpath = "//*[@id='respondqueryupload']/div/div[1]/div[1]/div/div/div/ul/li")
	public static List<WebElement> docvalue2;

	// Admin document type add elements

	@FindBy(linkText = "Manage IEC")
	WebElement manageiec;

	@FindBy(linkText = "Manage Document Type")
	WebElement managedoctype;

	@FindBy(linkText = "Add Document Type")
	WebElement adddoctype;

	@FindBy(id = "add_annexure_project_type")
	WebElement projdoc1;

	@FindBy(id = "add_annexure_review_type")
	WebElement revtype1;

	@FindBy(id = "add_annexure_submission_type")
	WebElement subtype1;

	@FindBy(id = "add_annexure_document_type")
	WebElement documenttype1;

	@FindBy(id = "(//input[@id='add_project_document_type_isMandatory'])[2]")
	WebElement mandatory_no;

	@FindBy(id = "add_project_document_type_isMandatory")
	WebElement mandatory_yes;

	@FindBy(id = "add_edit_annexure_details")
	WebElement doctype_submit;

	@FindBy(xpath = "//div[2]/div/div/ul/li[2]/a/span")
	WebElement continuation_dashboard;

	@FindBy(xpath = "//li[3]/a/span")
	WebElement query_reply_dashboard;

	@FindBy(xpath = "//div[3]/ul/li[4]/a")
	WebElement query_tab;

	@FindBy(css = "span.fa.fa-edit")
	WebElement query_tab_edit;

	@FindBy(id = "query_comments")
	WebElement query_comments;

	@FindBy(id = "querysubmit")
	WebElement query_submit_button;

	@FindBy(xpath = "//td[5]")
	WebElement project_status;

	@FindBy(xpath = "//td[6]")
	WebElement latest_submission;

	@FindBy(xpath = "//td[8]")
	WebElement document_status;

	@FindBy(linkText = "Overview")
	WebElement PI_overview;

	@FindBy(linkText = "Study Team Member")
	WebElement PI_study_team_mem;

	@FindBy(linkText = "Project History")
	WebElement PI_history;

	// sae initial uploads

	@FindBy(xpath = "//*[@id='saedetails']/div[1]/div[2]/div[1]/div/div/button")
	public WebElement sae_site_drop;
	@FindBy(xpath = "//*[@id='saedetails']/div[1]/div[2]/div[1]/div/div/div/ul/li")
	public static List<WebElement> sae_site_value;

	@FindBy(xpath = "//*[@id='report_types_sel']/div/div/button")
	public WebElement sae_report_doc;
	@FindBy(xpath = "//*[@id='report_types_sel']/div/div/div/ul/li")
	public static List<WebElement> sae_report_value;

	@FindBy(xpath = "//*[@id='document_type_sae']/div/button")
	public WebElement sae_docdrop;
	@FindBy(xpath = "//*[@id='document_type_sae']/div/div/ul/li")
	public static List<WebElement> sae_docvalue;

	// SAE Elements

	@FindBy(id = "patient_initial")
	WebElement Sae_patient_initial;

	@FindBy(id = "sae_number")
	WebElement Sae_sae_number;

	@FindBy(id = "followup_number")
	WebElement sae_followup_number;

	@FindBy(linkText = "followup_date")
	WebElement sae_followup_date;

	@FindBy(xpath = "//li[8]/a/span")
	WebElement sae_dash;

	// admin return to pi form elements

	@FindBy(id = "return_modal_btn")
	WebElement Return_To_PI_button;

	@FindBy(id = "return_comments")
	WebElement Return_To_PI_comments;

	@FindBy(id = "return_btn")
	WebElement Returning_PI_button;

	// elements in pi to check returned project from dashboard

	@FindBy(xpath = "//li[5]/a/span")
	WebElement Submissions_returned_dash;
	
	@FindBy(linkText = "Resubmission")
	WebElement resubmission_edit;

	// Check Edit feature for Provisional letter
	public void CRe4_1954() throws Exception {


		// Create initial project and give MS decision as 'Letter of permission'

		// Login as PI

		GlobalMethods.PI_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("PI_Project_Data");
		Sheet r2 = wb.getSheet("Admin_Review");
		Sheet r3 = wb.getSheet("MS_Assign");
		Sheet r4 = wb.getSheet("Decision");
		Sheet r5 = wb.getSheet("Continuation_Submissions");

		// Project summary data

		String Project_Type = r1.getCell(0, 1).getContents();
		String Review_Type = r1.getCell(1, 1).getContents();
		String Project_Full_Title = r1.getCell(2, 1).getContents();
		String Project_Short_Title = r1.getCell(3, 1).getContents();
		String Sponsor = r1.getCell(4, 1).getContents();

		// Submit new documents data

		// First document upload

		String Document_Type_in_list = r1.getCell(5, 1).getContents();
		String Document_Title_in_list = r1.getCell(6, 1).getContents();
		String Version_in_list = r1.getCell(7, 1).getContents();
		String Document_Date_in_list = r1.getCell(9, 1).getContents();
		String doc_upload = r1.getCell(8, 1).getContents();

	
	
		String Decision_provisional = r5.getCell(5, 3).getContents();
		

		// Saving project summary

		Thread.sleep(10000);
		createproject.click();

		Thread.sleep(6000);
		projtypdrop.click();
		Thread.sleep(2000);

		List<WebElement> elementsList11 = projtypvalue;
		for (WebElement a11 : elementsList11) {
			WebElement span = a11.findElement(By.tagName("span"));
			if (span.getText().equalsIgnoreCase(Project_Type)) {
				span.click();
				break;
			}
		}

		Thread.sleep(3000);
		revtypdrop.click();
		Thread.sleep(1000);

		List<WebElement> elementsList2 = revtypvalue;
		for (WebElement a111 : elementsList2) {
			WebElement span = a111.findElement(By.tagName("span"));
			// System.out.println(Review_Type);
			// System.out.println(span.getText());
			if (span.getText().equalsIgnoreCase(Review_Type)) {
				Thread.sleep(2000);
				span.click();
				break;
			}
		}

		Thread.sleep(2000);
		Full_title.sendKeys(Project_Full_Title);
		Thread.sleep(2000);
		short_title.sendKeys(Project_Short_Title);

		// comparing PI name

		String PIname = Login_PI_Name.getText();
		String loggedpiname = PI_Name.getAttribute("value");

		PIname.equalsIgnoreCase(loggedpiname);

		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		save_button1.click();
		Thread.sleep(3000);

		// saving Submit documents


Thread.sleep(2000);
		System.out.println(docvalue.size()-1);
		
		for (int i = 1; i<=docvalue.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(8000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);
	
	

		next_button1.click();

		// submitting full board project to admin

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(5000);
		conflictsubmit.click();
		Thread.sleep(3000);
		GlobalMethods.alertaccept();
	
		Thread.sleep(8000);

		logoutt.click();

		Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		// Submit IEC admin review

		String pyrcnum = r2.getCell(0, 1).getContents();
		String inwnum = r2.getCell(1, 1).getContents();
		String prjnum = r2.getCell(2, 1).getContents();
		String insdate = r2.getCell(3, 1).getContents();
		String inwrddate = r2.getCell(4, 1).getContents();
		String ethic_com = r2.getCell(5, 1).getContents();
		String ethic_comnts = r2.getCell(6, 1).getContents();

		Thread.sleep(6000);
		Dashboard_newsubmission.click();
		Thread.sleep(6000);
		Projectoverview.click();
		Thread.sleep(6000);
		Admin_Review.click();
		Thread.sleep(6000);
		Processing_fee_yes.click();

		payment_receipt_yes.sendKeys(pyrcnum);

		hard_copy_yes.click();

		inward_no_yes.sendKeys(inwnum);

		projnum.sendKeys(prjnum);

		insurdate.sendKeys(insdate);

		inwdate.sendKeys(inwrddate);

		forward_button.click();
		Thread.sleep(2000);

		Select select = new Select(ethic_selection);
		select.selectByVisibleText(ethic_com);

		Thread.sleep(6000);

		// String MSname = ethic_ms_name.getText();

		ethic_comments.sendKeys(ethic_comnts);

		String MSname = ethic_ms_name.getAttribute("Value");

		ethic_frwd.click();

		Thread.sleep(8000);

		String msg = "Submission has been forwarded to Member Secretary" + " " + MSname;
		System.out.println(msg);

		String acknowledge = ethic_frwd_acknowledge.getText();
		acknowledge.equalsIgnoreCase(msg);
		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		// MS assign reviewers & giving decision

		GlobalMethods.MS_Login();

		String Rev_one = r3.getCell(1, 1).getContents();
		String Rev_two = r3.getCell(2, 1).getContents();
		String Rev_three = r3.getCell(3, 1).getContents();
		String Rev_four = r3.getCell(4, 1).getContents();
		String Rev_five = r3.getCell(5, 1).getContents();
		String Rev_six = r3.getCell(6, 1).getContents();
		String Rev_comnts = r3.getCell(7, 1).getContents();

		String Rev_acknow = r3.getCell(8, 1).getContents();

		String Decision = r4.getCell(0, 1).getContents();
		String Decisionfile = r4.getCell(1, 1).getContents();
		String Decisioncmnt = r4.getCell(2, 1).getContents();

		Thread.sleep(6000);

		projectslink.click();

		Thread.sleep(6000);

		Projectoverview.click();

		/*Thread.sleep(6000);

		asignreviewers.click();

		Thread.sleep(6000);

		Select select1 = new Select(primaryreview_one);
		select1.selectByVisibleText(Rev_one);

		Thread.sleep(2000);

		Select select2 = new Select(nonprimaryreview_one);
		select2.selectByVisibleText(Rev_two);
		Thread.sleep(2000);

		Select select3 = new Select(primaryreview_two);
		select3.selectByVisibleText(Rev_three);
		Thread.sleep(2000);

		Select select4 = new Select(nonprimaryreview_two);
		select4.selectByVisibleText(Rev_four);
		Thread.sleep(2000);

		Select select5 = new Select(primaryreview_three);
		select5.selectByVisibleText(Rev_five);
		Thread.sleep(2000);

		Select select6 = new Select(nonprimaryreview_three);
		select6.selectByVisibleText(Rev_six);
		Thread.sleep(2000);

		assign_comments.clear();
		assign_comments.sendKeys(Rev_comnts);

		Thread.sleep(8000);
		assign_button.click();

		String msg2 = assignreviewer_msg.getText();
		msg2.equalsIgnoreCase(Rev_acknow);
		System.out.println(msg2);*/

		Thread.sleep(8000);

		GlobalMethods.Commentswindhandler();

		Thread.sleep(8000);

		// membercomments.click();

		iecdecisiontab.click();

		Thread.sleep(8000);

		Select select7 = new Select(decisondropdown);
		select7.selectByVisibleText(Decision_provisional);

		Thread.sleep(8000);

		decisionupload.sendKeys(Decisionfile);

		Thread.sleep(8000);

		assign_comments.sendKeys(Decisioncmnt);

		Thread.sleep(8000);

		decisionusubmit.click();

		Thread.sleep(8000);

		logoutt.click();

		Thread.sleep(4000);
logo.click();
		

		GlobalMethods.PI_Login();

		Thread.sleep(8000);

		query_reply_dashboard.click();

		Thread.sleep(8000);
		query_tab_edit.click();

	
		Thread.sleep(8000);

		logoutt.click();
		Thread.sleep(4000);
		logo.click();


	}

	// Check Edit feature for Suspension letter
	public void CRe4_1955() throws Exception {


		// Create initial project and give MS decision as 'Letter of permission'

		// Login as PI

		GlobalMethods.PI_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("PI_Project_Data");
		Sheet r2 = wb.getSheet("Admin_Review");
		Sheet r3 = wb.getSheet("MS_Assign");
		Sheet r4 = wb.getSheet("Decision");
		Sheet r5 = wb.getSheet("Continuation_Submissions");
		Sheet r6 = wb.getSheet("Document_upload");

		// Project summary data

		String Project_Type = r1.getCell(0, 1).getContents();
		String Review_Type = r1.getCell(1, 1).getContents();
		String Project_Full_Title = r1.getCell(2, 1).getContents();
		String Project_Short_Title = r1.getCell(3, 1).getContents();
		String Sponsor = r1.getCell(4, 1).getContents();

		// Submit new documents data

		// First document upload

		String Document_Type_in_list = r1.getCell(5, 1).getContents();
		String Document_Title_in_list = r1.getCell(6, 1).getContents();
		String Version_in_list = r1.getCell(7, 1).getContents();
		String Document_Date_in_list = r1.getCell(9, 1).getContents();
		String doc_upload = r1.getCell(8, 1).getContents();

	

		String Document_type_Deviation = r6.getCell(0, 1).getContents();
		String Document_type_suspension_reply = r6.getCell(0, 1).getContents();
		String Upload_Doc_Continuation = r5.getCell(2, 1).getContents();
		String Date_Continuation = r5.getCell(3, 1).getContents();
		String Version_Continuation = r5.getCell(4, 1).getContents();
		
		// Saving project summary

		Thread.sleep(10000);
		createproject.click();

		Thread.sleep(6000);
		projtypdrop.click();
		Thread.sleep(2000);

		List<WebElement> elementsList11 = projtypvalue;
		for (WebElement a11 : elementsList11) {
			WebElement span = a11.findElement(By.tagName("span"));
			if (span.getText().equalsIgnoreCase(Project_Type)) {
				span.click();
				break;
			}
		}

		Thread.sleep(3000);
		revtypdrop.click();
		Thread.sleep(1000);

		List<WebElement> elementsList2 = revtypvalue;
		for (WebElement a111 : elementsList2) {
			WebElement span = a111.findElement(By.tagName("span"));
			// System.out.println(Review_Type);
			// System.out.println(span.getText());
			if (span.getText().equalsIgnoreCase(Review_Type)) {
				Thread.sleep(2000);
				span.click();
				break;
			}
		}

		Thread.sleep(2000);
		Full_title.sendKeys(Project_Full_Title);
		Thread.sleep(2000);
		short_title.sendKeys(Project_Short_Title);

		// comparing PI name

		String PIname = Login_PI_Name.getText();
		String loggedpiname = PI_Name.getAttribute("value");

		PIname.equalsIgnoreCase(loggedpiname);

		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		save_button1.click();
		Thread.sleep(3000);

		// saving Submit documents


Thread.sleep(2000);
		System.out.println(docvalue.size()-1);
		
		for (int i = 1; i<=docvalue.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(8000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);

	

		next_button1.click();

		// submitting full board project to admin

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(5000);
		conflictsubmit.click();
		Thread.sleep(4000);
		GlobalMethods.alertaccept();

		Thread.sleep(6000);

		logoutt.click();

		Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		// Submit IEC admin review

		String pyrcnum = r2.getCell(0, 1).getContents();
		String inwnum = r2.getCell(1, 1).getContents();
		String prjnum = r2.getCell(2, 1).getContents();
		String insdate = r2.getCell(3, 1).getContents();
		String inwrddate = r2.getCell(4, 1).getContents();
		String ethic_com = r2.getCell(5, 1).getContents();
		String ethic_comnts = r2.getCell(6, 1).getContents();

		Thread.sleep(6000);
		Dashboard_newsubmission.click();
		Thread.sleep(6000);
		Projectoverview.click();
		Thread.sleep(6000);
		Admin_Review.click();
		Thread.sleep(6000);
		Processing_fee_yes.click();

		payment_receipt_yes.sendKeys(pyrcnum);

		hard_copy_yes.click();

		inward_no_yes.sendKeys(inwnum);

		projnum.sendKeys(prjnum);

		insurdate.sendKeys(insdate);

		inwdate.sendKeys(inwrddate);

		forward_button.click();
		Thread.sleep(2000);

		Select select = new Select(ethic_selection);
		select.selectByVisibleText(ethic_com);

		Thread.sleep(6000);

		// String MSname = ethic_ms_name.getText();

		ethic_comments.sendKeys(ethic_comnts);

		String MSname = ethic_ms_name.getAttribute("Value");

		ethic_frwd.click();

		Thread.sleep(8000);

		String msg = "Submission has been forwarded to Member Secretary" + " " + MSname;
		System.out.println(msg);

		String acknowledge = ethic_frwd_acknowledge.getText();
		acknowledge.equalsIgnoreCase(msg);
		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		// MS assign reviewers & giving decision

		GlobalMethods.MS_Login();

		String Rev_one = r3.getCell(1, 1).getContents();
		String Rev_two = r3.getCell(2, 1).getContents();
		String Rev_three = r3.getCell(3, 1).getContents();
		String Rev_four = r3.getCell(4, 1).getContents();
		String Rev_five = r3.getCell(5, 1).getContents();
		String Rev_six = r3.getCell(6, 1).getContents();
		String Rev_comnts = r3.getCell(7, 1).getContents();

		String Rev_acknow = r3.getCell(8, 1).getContents();

		String Decision = r4.getCell(0, 1).getContents();
		String Decision_Suspension = r4.getCell(0, 3).getContents();

		String Decisionfile = r4.getCell(1, 1).getContents();
		String Decisioncmnt = r4.getCell(2, 1).getContents();

		Thread.sleep(6000);

		projectslink.click();

		Thread.sleep(6000);

		Projectoverview.click();

		/*Thread.sleep(6000);

		asignreviewers.click();

		Thread.sleep(6000);

		Select select1 = new Select(primaryreview_one);
		select1.selectByVisibleText(Rev_one);

		Thread.sleep(2000);

		Select select2 = new Select(nonprimaryreview_one);
		select2.selectByVisibleText(Rev_two);
		Thread.sleep(2000);

		Select select3 = new Select(primaryreview_two);
		select3.selectByVisibleText(Rev_three);
		Thread.sleep(2000);

		Select select4 = new Select(nonprimaryreview_two);
		select4.selectByVisibleText(Rev_four);
		Thread.sleep(2000);

		Select select5 = new Select(primaryreview_three);
		select5.selectByVisibleText(Rev_five);
		Thread.sleep(2000);

		Select select6 = new Select(nonprimaryreview_three);
		select6.selectByVisibleText(Rev_six);
		Thread.sleep(2000);

		assign_comments.clear();
		assign_comments.sendKeys(Rev_comnts);

		Thread.sleep(8000);
		assign_button.click();

		String msg2 = assignreviewer_msg.getText();
		msg2.equalsIgnoreCase(Rev_acknow);
		System.out.println(msg2);*/

		Thread.sleep(8000);

		GlobalMethods.Commentswindhandler();

		Thread.sleep(8000);

		// membercomments.click();

		iecdecisiontab.click();

		Thread.sleep(8000);

		Select select7 = new Select(decisondropdown);
		select7.selectByVisibleText(Decision);

		Thread.sleep(8000);

		decisionupload.sendKeys(Decisionfile);

		Thread.sleep(8000);

		assign_comments.sendKeys(Decisioncmnt);

		Thread.sleep(8000);

		decisionusubmit.click();

		Thread.sleep(8000);

		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		GlobalMethods.PI_Login();

		Thread.sleep(8000);

		Ongoingprojects.click();

		Thread.sleep(8000);

		approvedprojoverview.click();

		Thread.sleep(8000);

		newdocuments.click();

		Thread.sleep(8000);

		deviat.click();

		Thread.sleep(8000);

		Thread.sleep(2000);
		System.out.println(docvalue1.size()-1);
		
		for (int i = 1; i<=docvalue1.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop1.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue1;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(4000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);
		next_button1.click();

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(2000);
		conflictsubmit.click();

		GlobalMethods.alertaccept();

		Thread.sleep(8000);

		logoutt.click();

		Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		Thread.sleep(8000);

		deviation_dashboard.click();

		Thread.sleep(8000);
		overview.click();

		Thread.sleep(8000);
		Admin_Review.click();

		Thread.sleep(8000);

		forward_button.click();
		Thread.sleep(2000);

		Select select_1 = new Select(ethic_selection);
		select_1.selectByVisibleText(ethic_com);

		Thread.sleep(6000);

		// String MSname = ethic_ms_name.getText();

		ethic_comments.sendKeys(ethic_comnts);

		String MSname1 = ethic_ms_name.getAttribute("Value");

		ethic_frwd.click();

		Thread.sleep(8000);

		String msg11 = "Submission has been forwarded to Member Secretary" + " " + MSname1;
		System.out.println(msg11);

		String acknowledge1 = ethic_frwd_acknowledge.getText();
		acknowledge1.equalsIgnoreCase(msg11);
		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		// MS assign reviewers & giving decision

		GlobalMethods.MS_Login();

		Thread.sleep(6000);

		deviation_dashboard.click();

		Thread.sleep(6000);

		Projectoverview.click();

		/*Thread.sleep(6000);

		asignreviewers.click();

		Thread.sleep(6000);

		Select select2a = new Select(primaryreview_one);
		select2a.selectByVisibleText(Rev_one);

		Thread.sleep(2000);

		Select select3a = new Select(nonprimaryreview_one);
		select3a.selectByVisibleText(Rev_two);
		Thread.sleep(2000);

		Select select4a = new Select(primaryreview_two);
		select4a.selectByVisibleText(Rev_three);
		Thread.sleep(2000);

		Select select5a = new Select(nonprimaryreview_two);
		select5a.selectByVisibleText(Rev_four);
		Thread.sleep(2000);

		Select select6a = new Select(primaryreview_three);
		select6a.selectByVisibleText(Rev_five);
		Thread.sleep(2000);

		Select select7a = new Select(nonprimaryreview_three);
		select7a.selectByVisibleText(Rev_six);
		Thread.sleep(2000);

		assign_comments.clear();
		assign_comments.sendKeys(Rev_comnts);

		Thread.sleep(8000);
		assign_button.click();

		String msg21 = assignreviewer_msg.getText();
		msg21.equalsIgnoreCase(Rev_acknow);
		System.out.println(msg21);*/

		Thread.sleep(8000);

		GlobalMethods.Commentswindhandler();

		Thread.sleep(8000);

		// membercomments.click();

		iecdecisiontab.click();

		Thread.sleep(8000);

		Select select8a = new Select(decisondropdown);
		select8a.selectByVisibleText(Decision_Suspension);

		Thread.sleep(8000);

		decisionupload.sendKeys(Decisionfile);

		Thread.sleep(8000);

		assign_comments.sendKeys(Decisioncmnt);

		Thread.sleep(8000);

		decisionusubmit.click();

		Thread.sleep(8000);

		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		GlobalMethods.PI_Login();

		Thread.sleep(8000);

		query_reply_dashboard.click();
		Thread.sleep(8000);

		query_tab_edit.click();
		Thread.sleep(8000);

		Thread.sleep(8000);
		Thread.sleep(2000);
		System.out.println(docvalue_sus.size()-1);
		
		for (int i = 1; i<=docvalue_sus.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop_sus.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue_sus;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				

				doc_title.sendKeys(Document_Title_in_list);

				
				
				doc_date.sendKeys(Date_Continuation);

				
				doc_version.sendKeys(Version_Continuation);
				

				
				upload_doc.sendKeys(Upload_Doc_Continuation);
				
				save_button2.click();
Thread.sleep(2000);
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);
		
		   submit_to_IEC.click();
    	   
	        Thread.sleep(6000);
	        
           logoutt.click();
           Thread.sleep(4000);
	        logo.click(); 
	}
	

	// Check Edit feature for query letter
	public void CRe4_1956() throws Exception {


		// Create initial project and give MS decision as 'Letter of permission'

		// Login as PI

		GlobalMethods.PI_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("PI_Project_Data");
		Sheet r2 = wb.getSheet("Admin_Review");
		Sheet r3 = wb.getSheet("MS_Assign");
		Sheet r4 = wb.getSheet("Decision");
		Sheet r5 = wb.getSheet("Continuation_Submissions");

		// Project summary data

		String Project_Type = r1.getCell(0, 1).getContents();
		String Review_Type = r1.getCell(1, 1).getContents();
		String Project_Full_Title = r1.getCell(2, 1).getContents();
		String Project_Short_Title = r1.getCell(3, 1).getContents();
		String Sponsor = r1.getCell(4, 1).getContents();

	
		String Document_Title_in_list = r1.getCell(6, 1).getContents();
		String Version_in_list = r1.getCell(7, 1).getContents();
		String Document_Date_in_list = r1.getCell(9, 1).getContents();
		String doc_upload = r1.getCell(8, 1).getContents();


		
		String Decision_query_fb = r5.getCell(5, 4).getContents();
		

		// Saving project summary

		Thread.sleep(10000);
		createproject.click();

		Thread.sleep(6000);
		projtypdrop.click();
		Thread.sleep(2000);

		List<WebElement> elementsList11 = projtypvalue;
		for (WebElement a11 : elementsList11) {
			WebElement span = a11.findElement(By.tagName("span"));
			if (span.getText().equalsIgnoreCase(Project_Type)) {
				span.click();
				break;
			}
		}

		Thread.sleep(3000);
		revtypdrop.click();
		Thread.sleep(1000);

		List<WebElement> elementsList2 = revtypvalue;
		for (WebElement a111 : elementsList2) {
			WebElement span = a111.findElement(By.tagName("span"));
			// System.out.println(Review_Type);
			// System.out.println(span.getText());
			if (span.getText().equalsIgnoreCase(Review_Type)) {
				Thread.sleep(2000);
				span.click();
				break;
			}
		}

		Thread.sleep(2000);
		Full_title.sendKeys(Project_Full_Title);
		Thread.sleep(2000);
		short_title.sendKeys(Project_Short_Title);

		// comparing PI name

		String PIname = Login_PI_Name.getText();
		String loggedpiname = PI_Name.getAttribute("value");

		PIname.equalsIgnoreCase(loggedpiname);

		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		save_button1.click();
		Thread.sleep(3000);

		// saving Submit documents


Thread.sleep(2000);
		System.out.println(docvalue.size()-1);
		
		for (int i = 1; i<=docvalue.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(8000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");

		

		next_button1.click();

		// submitting full board project to admin

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(5000);
		conflictsubmit.click();
		Thread.sleep(3000);
		GlobalMethods.alertaccept();

		Thread.sleep(6000);

		logoutt.click();

		Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		// Submit IEC admin review

		String pyrcnum = r2.getCell(0, 1).getContents();
		String inwnum = r2.getCell(1, 1).getContents();
		String prjnum = r2.getCell(2, 1).getContents();
		String insdate = r2.getCell(3, 1).getContents();
		String inwrddate = r2.getCell(4, 1).getContents();
		String ethic_com = r2.getCell(5, 1).getContents();
		String ethic_comnts = r2.getCell(6, 1).getContents();
		Thread.sleep(6000);
		Dashboard_newsubmission.click();
		Thread.sleep(6000);
		Projectoverview.click();
		Thread.sleep(6000);
		Admin_Review.click();
		Thread.sleep(6000);
		Processing_fee_yes.click();

		payment_receipt_yes.sendKeys(pyrcnum);

		hard_copy_yes.click();

		inward_no_yes.sendKeys(inwnum);

		projnum.sendKeys(prjnum);

		insurdate.sendKeys(insdate);

		inwdate.sendKeys(inwrddate);

		forward_button.click();
		Thread.sleep(2000);

		Select select = new Select(ethic_selection);
		select.selectByVisibleText(ethic_com);

		Thread.sleep(6000);

		// String MSname = ethic_ms_name.getText();

		ethic_comments.sendKeys(ethic_comnts);

		String MSname = ethic_ms_name.getAttribute("Value");

		ethic_frwd.click();

		Thread.sleep(8000);

		String msg = "Submission has been forwarded to Member Secretary" + " " + MSname;
		System.out.println(msg);

		String acknowledge = ethic_frwd_acknowledge.getText();
		acknowledge.equalsIgnoreCase(msg);
		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		// MS assign reviewers & giving decision

		GlobalMethods.MS_Login();

		String Rev_one = r3.getCell(1, 1).getContents();
		String Rev_two = r3.getCell(2, 1).getContents();
		String Rev_three = r3.getCell(3, 1).getContents();
		String Rev_four = r3.getCell(4, 1).getContents();
		String Rev_five = r3.getCell(5, 1).getContents();
		String Rev_six = r3.getCell(6, 1).getContents();
		String Rev_comnts = r3.getCell(7, 1).getContents();

		String Rev_acknow = r3.getCell(8, 1).getContents();

		String Decision = r4.getCell(0, 1).getContents();
		String Decisionfile = r4.getCell(1, 1).getContents();
		String Decisioncmnt = r4.getCell(2, 1).getContents();

		Thread.sleep(6000);

		projectslink.click();

		Thread.sleep(6000);

		Projectoverview.click();

		/*Thread.sleep(6000);

		asignreviewers.click();

		Thread.sleep(6000);

		Select select1 = new Select(primaryreview_one);
		select1.selectByVisibleText(Rev_one);

		Thread.sleep(2000);

		Select select2 = new Select(nonprimaryreview_one);
		select2.selectByVisibleText(Rev_two);
		Thread.sleep(2000);

		Select select3 = new Select(primaryreview_two);
		select3.selectByVisibleText(Rev_three);
		Thread.sleep(2000);

		Select select4 = new Select(nonprimaryreview_two);
		select4.selectByVisibleText(Rev_four);
		Thread.sleep(2000);

		Select select5 = new Select(primaryreview_three);
		select5.selectByVisibleText(Rev_five);
		Thread.sleep(2000);

		Select select6 = new Select(nonprimaryreview_three);
		select6.selectByVisibleText(Rev_six);
		Thread.sleep(2000);

		assign_comments.clear();
		assign_comments.sendKeys(Rev_comnts);

		Thread.sleep(8000);
		assign_button.click();

		String msg2 = assignreviewer_msg.getText();
		msg2.equalsIgnoreCase(Rev_acknow);
		System.out.println(msg2);*/

		Thread.sleep(8000);

		GlobalMethods.Commentswindhandler();

		Thread.sleep(8000);

		// membercomments.click();

		iecdecisiontab.click();

		Thread.sleep(8000);

		Select select7 = new Select(decisondropdown);
		select7.selectByVisibleText(Decision_query_fb);

		Thread.sleep(8000);

		decisionupload.sendKeys(Decisionfile);

		Thread.sleep(8000);

		assign_comments.sendKeys(Decisioncmnt);

		Thread.sleep(8000);

		decisionusubmit.click();

		Thread.sleep(4000);

		logoutt.click();
		Thread.sleep(2000);
		logo.click();

		GlobalMethods.PI_Login();

		Thread.sleep(8000);

		query_reply_dashboard.click();

		Thread.sleep(8000);
		overview.click();

		Thread.sleep(8000);

		query_tab.click();

		Thread.sleep(8000);

		query_tab_edit.click();
		Thread.sleep(8000);

		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		}

	// Check Edit feature for resubmission letter
	public void CRe4_1957() throws Exception {


		// Create initial project and give MS decision as 'Letter of permission'

		// Login as PI

		GlobalMethods.PI_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("PI_Project_Data");
		Sheet r2 = wb.getSheet("Admin_Review");
		Sheet r3 = wb.getSheet("MS_Assign");
		Sheet r4 = wb.getSheet("Decision");
		Sheet r5 = wb.getSheet("Continuation_Submissions");

		// Project summary data

		String Project_Type = r1.getCell(0, 1).getContents();
		String Review_Type = r1.getCell(1, 1).getContents();
		String Project_Full_Title = r1.getCell(2, 1).getContents();
		String Project_Short_Title = r1.getCell(3, 1).getContents();
		String Sponsor = r1.getCell(4, 1).getContents();

	
		String Document_Title_in_list = r1.getCell(6, 1).getContents();
		String Version_in_list = r1.getCell(7, 1).getContents();
		String Document_Date_in_list = r1.getCell(9, 1).getContents();
		String doc_upload = r1.getCell(8, 1).getContents();


	
		String Decision_resubmission = r5.getCell(5, 10).getContents();
		

		// Saving project summary

		Thread.sleep(10000);
		createproject.click();

		Thread.sleep(6000);
		projtypdrop.click();
		Thread.sleep(2000);

		List<WebElement> elementsList11 = projtypvalue;
		for (WebElement a11 : elementsList11) {
			WebElement span = a11.findElement(By.tagName("span"));
			if (span.getText().equalsIgnoreCase(Project_Type)) {
				span.click();
				break;
			}
		}

		Thread.sleep(3000);
		revtypdrop.click();
		Thread.sleep(1000);

		List<WebElement> elementsList2 = revtypvalue;
		for (WebElement a111 : elementsList2) {
			WebElement span = a111.findElement(By.tagName("span"));
			// System.out.println(Review_Type);
			// System.out.println(span.getText());
			if (span.getText().equalsIgnoreCase(Review_Type)) {
				Thread.sleep(2000);
				span.click();
				break;
			}
		}

		Thread.sleep(2000);
		Full_title.sendKeys(Project_Full_Title);
		Thread.sleep(2000);
		short_title.sendKeys(Project_Short_Title);

		// comparing PI name

		String PIname = Login_PI_Name.getText();
		String loggedpiname = PI_Name.getAttribute("value");

		PIname.equalsIgnoreCase(loggedpiname);

		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		save_button1.click();
		Thread.sleep(3000);

		// saving Submit documents


Thread.sleep(2000);
		System.out.println(docvalue.size()-1);
		
		for (int i = 1; i<=docvalue.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(8000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);

		next_button1.click();

		// submitting full board project to admin

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(5000);
		conflictsubmit.click();
		Thread.sleep(3000);
		GlobalMethods.alertaccept();

		Thread.sleep(6000);

		logoutt.click();

		Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		// Submit IEC admin review

		String pyrcnum = r2.getCell(0, 1).getContents();
		String inwnum = r2.getCell(1, 1).getContents();
		String prjnum = r2.getCell(2, 1).getContents();
		String insdate = r2.getCell(3, 1).getContents();
		String inwrddate = r2.getCell(4, 1).getContents();
		String ethic_com = r2.getCell(5, 1).getContents();
		String ethic_comnts = r2.getCell(6, 1).getContents();

		Thread.sleep(6000);
		Dashboard_newsubmission.click();
		Thread.sleep(6000);
		Projectoverview.click();
		Thread.sleep(6000);
		Admin_Review.click();
		Thread.sleep(6000);
		Processing_fee_yes.click();

		payment_receipt_yes.sendKeys(pyrcnum);

		hard_copy_yes.click();

		inward_no_yes.sendKeys(inwnum);

		projnum.sendKeys(prjnum);

		insurdate.sendKeys(insdate);

		inwdate.sendKeys(inwrddate);

		forward_button.click();
		Thread.sleep(2000);

		Select select = new Select(ethic_selection);
		select.selectByVisibleText(ethic_com);

		Thread.sleep(6000);

		// String MSname = ethic_ms_name.getText();

		ethic_comments.sendKeys(ethic_comnts);

		String MSname = ethic_ms_name.getAttribute("Value");

		ethic_frwd.click();

		Thread.sleep(8000);

		String msg = "Submission has been forwarded to Member Secretary" + " " + MSname;
		System.out.println(msg);

		String acknowledge = ethic_frwd_acknowledge.getText();
		acknowledge.equalsIgnoreCase(msg);
		Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		// MS assign reviewers & giving decision

		GlobalMethods.MS_Login();

		String Rev_one = r3.getCell(1, 1).getContents();
		String Rev_two = r3.getCell(2, 1).getContents();
		String Rev_three = r3.getCell(3, 1).getContents();
		String Rev_four = r3.getCell(4, 1).getContents();
		String Rev_five = r3.getCell(5, 1).getContents();
		String Rev_six = r3.getCell(6, 1).getContents();
		String Rev_comnts = r3.getCell(7, 1).getContents();

		String Rev_acknow = r3.getCell(8, 1).getContents();

		String Decision = r4.getCell(0, 1).getContents();
		String Decisionfile = r4.getCell(1, 1).getContents();
		String Decisioncmnt = r4.getCell(2, 1).getContents();

		Thread.sleep(6000);

		projectslink.click();

		Thread.sleep(6000);

		Projectoverview.click();

		/*Thread.sleep(6000);

		asignreviewers.click();

		Thread.sleep(6000);

		Select select1 = new Select(primaryreview_one);
		select1.selectByVisibleText(Rev_one);

		Thread.sleep(2000);

		Select select2 = new Select(nonprimaryreview_one);
		select2.selectByVisibleText(Rev_two);
		Thread.sleep(2000);

		Select select3 = new Select(primaryreview_two);
		select3.selectByVisibleText(Rev_three);
		Thread.sleep(2000);

		Select select4 = new Select(nonprimaryreview_two);
		select4.selectByVisibleText(Rev_four);
		Thread.sleep(2000);

		Select select5 = new Select(primaryreview_three);
		select5.selectByVisibleText(Rev_five);
		Thread.sleep(2000);

		Select select6 = new Select(nonprimaryreview_three);
		select6.selectByVisibleText(Rev_six);
		Thread.sleep(2000);

		assign_comments.clear();
		assign_comments.sendKeys(Rev_comnts);

		Thread.sleep(8000);
		assign_button.click();

		String msg2 = assignreviewer_msg.getText();
		msg2.equalsIgnoreCase(Rev_acknow);
		System.out.println(msg2);*/

		Thread.sleep(8000);

		GlobalMethods.Commentswindhandler();

		Thread.sleep(8000);

		// membercomments.click();

		iecdecisiontab.click();

		Thread.sleep(8000);

		Select select7 = new Select(decisondropdown);
		select7.selectByVisibleText(Decision_resubmission);

		Thread.sleep(8000);

		decisionupload.sendKeys(Decisionfile);

		Thread.sleep(8000);

		assign_comments.sendKeys(Decisioncmnt);

		Thread.sleep(8000);

		decisionusubmit.click();

		Thread.sleep(4000);

		logoutt.click();
		Thread.sleep(2000);
		logo.click();
		GlobalMethods.PI_Login();

		Thread.sleep(8000);

		PI_project_menu.click();

		Thread.sleep(8000);
		resubmission_edit.click();

		Thread.sleep(6000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

	}

	// Check Edit feature for returned
	public void CRe4_1958() throws Exception {


		// Create initial project and give MS decision as 'Letter of permission'

		// Login as PI

		GlobalMethods.PI_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("PI_Project_Data");
		Sheet r2 = wb.getSheet("Admin_Review");
		Sheet r3 = wb.getSheet("MS_Assign");
		Sheet r4 = wb.getSheet("Decision");
		Sheet r5 = wb.getSheet("Continuation_Submissions");

		// Project summary data

		String Project_Type = r1.getCell(0, 1).getContents();
		String Review_Type = r1.getCell(1, 1).getContents();
		String Project_Full_Title = r1.getCell(2, 1).getContents();
		String Project_Short_Title = r1.getCell(3, 1).getContents();
		String Sponsor = r1.getCell(4, 1).getContents();

		
		String Document_Title_in_list = r1.getCell(6, 1).getContents();
		String Version_in_list = r1.getCell(7, 1).getContents();
		String Document_Date_in_list = r1.getCell(9, 1).getContents();
		String doc_upload = r1.getCell(8, 1).getContents();


		
		// Saving project summary

		Thread.sleep(10000);
		createproject.click();

		Thread.sleep(6000);
		projtypdrop.click();
		Thread.sleep(2000);

		List<WebElement> elementsList11 = projtypvalue;
		for (WebElement a11 : elementsList11) {
			WebElement span = a11.findElement(By.tagName("span"));
			if (span.getText().equalsIgnoreCase(Project_Type)) {
				span.click();
				break;
			}
		}

		Thread.sleep(3000);
		revtypdrop.click();
		Thread.sleep(1000);

		List<WebElement> elementsList2 = revtypvalue;
		for (WebElement a111 : elementsList2) {
			WebElement span = a111.findElement(By.tagName("span"));
			// System.out.println(Review_Type);
			// System.out.println(span.getText());
			if (span.getText().equalsIgnoreCase(Review_Type)) {
				Thread.sleep(2000);
				span.click();
				break;
			}
		}

		Thread.sleep(2000);
		Full_title.sendKeys(Project_Full_Title);
		Thread.sleep(2000);
		short_title.sendKeys(Project_Short_Title);

		// comparing PI name

		String PIname = Login_PI_Name.getText();
		String loggedpiname = PI_Name.getAttribute("value");

		PIname.equalsIgnoreCase(loggedpiname);

		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		save_button1.click();
		Thread.sleep(3000);

		// saving Submit documents


Thread.sleep(2000);
		System.out.println(docvalue.size()-1);
		
		for (int i = 1; i<=docvalue.size()-1; i++)
		{
			Thread.sleep(6000);
			docdrop.click();
			String numberAsString = Integer.toString(i);
			Thread.sleep(5000);
			List<WebElement> elementsList3 = docvalue;
			int j= 0;
			for (WebElement a11 : elementsList3) {
				WebElement span = a11.findElement(By.tagName("span"));
				System.out.println(numberAsString);
				System.out.println(span.getAttribute("data-original-index"));
				if (i==j) {
					Thread.sleep(2000);
					span.click();
					
					break;
				}
				j++;
			}
			if (i==j) {
				Thread.sleep(1000);
				doc_title.sendKeys(Document_Title_in_list);
				doc_version.sendKeys(Version_in_list);
				doc_date.sendKeys(Document_Date_in_list);
				Thread.sleep(1000);
				upload_doc.sendKeys(doc_upload);
				Thread.sleep(8000);

				save_button2.click();
				
			}
			
		}
				
		Thread.sleep(2000);
		((JavascriptExecutor) GlobalMethods.driver).executeScript("scroll(0,1000)");
		Thread.sleep(10000);

		next_button1.click();

		// submitting full board project to admin

		Thread.sleep(8000);

		submit_to_IEC.click();
		Thread.sleep(2000);

		no.click();
		Thread.sleep(5000);
		conflictsubmit.click();
		Thread.sleep(3000);
		GlobalMethods.alertaccept();

		Thread.sleep(6000);

		logoutt.click();

				Thread.sleep(4000);

		logo.click();

		// Login as admin

		GlobalMethods.Admin_Login();

		// Submit IEC admin review

		String pyrcnum = r2.getCell(0, 1).getContents();
		String inwnum = r2.getCell(1, 1).getContents();
		String prjnum = r2.getCell(2, 1).getContents();
		String insdate = r2.getCell(3, 1).getContents();
		String inwrddate = r2.getCell(4, 1).getContents();
		String ethic_com = r2.getCell(5, 1).getContents();
		String ethic_comnts = r2.getCell(6, 1).getContents();
Thread.sleep(6000);
		Dashboard_newsubmission.click();
Thread.sleep(6000);
		Projectoverview.click();
		Thread.sleep(6000);
		Admin_Review.click();
		Thread.sleep(6000);
		Return_To_PI_button.click();
		Thread.sleep(2000);
		Return_To_PI_comments.sendKeys(
				"Test Comments by Admin to PI for resubmitting the project with more files which are missing");

		Returning_PI_button.click();
Thread.sleep(8000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();

		GlobalMethods.PI_Login();
		Thread.sleep(6000);
		Submissions_returned_dash.click();
		Thread.sleep(6000);
		query_tab_edit.click();
		Thread.sleep(6000);
		logoutt.click();
		Thread.sleep(4000);
		logo.click();
		
		

	}

}
