package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;




@Page( title="NIChangeReport"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class NIChangeReport {

	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "Reports")
	public WebElement reportsTab;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "All Reports")
	public WebElement allReports;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@AuraBy(componentXPath = "//ui:inputText[@aura:id = 'searchTextField']")
	public WebElement searchAllReports;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH - TAX PAYROLL AUTOMATION")
	public WebElement dONOTTOUCHTAXPAYROLLAUTOMATION;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH - TAX PAYROLL AUTOMATION")
	public WebElement dONOTTOUCHTAXPAYROLLAUTOMATION1;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"highlightSearchText\")]")
	public WebElement ReportSelection;
	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//*[@id=\"ext-gen28\"]")
		public WebElement edit;
		@ButtonType()
		@FindByLabel(label = "OK")
		public WebElement oK;
		@TextType()
		@FindBy(xpath = "//input[@name=\"pv\"]")
		public WebElement PayrollValue;
		@LinkType()
		@FindBy(id = "ext-gen47")
		public WebElement edit1;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"ext-gen54\"]")
		public WebElement edit2;
		@ButtonType()
		@FindByLabel(label = "Run Report")
		public WebElement runReport;
	}
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"slds-grid\")]")
	public WebElement trigger;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//ul[contains(@class, \"scrollable\")]/li[1]/a")
	public WebElement editSalesforceClassic;
	@PageFrame()
	public static class Frame1 {

		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@LinkType()
		@FindBy(xpath = "//*[@id=\"ext-gen28\"]")
		public WebElement edit;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@TextType()
		@FindBy(xpath = "//input[@name=\"pv\"]")
		public WebElement PayrollValue;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@FindByLabel(label = "OK")
		@ButtonType()
		public WebElement oK;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@LinkType()
		@FindBy(xpath = "//*[@id=\"ext-gen47\"]")
		public WebElement edit1;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@TextType()
		@FindBy(xpath = "//input[@name=\"pv\"]")
		public WebElement PayFrequency;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@ButtonType()
		@FindByLabel(label = "OK")
		public WebElement oK1;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@LinkType()
		@FindBy(xpath = "//*[@id=\"ext-gen54\"]")
		public WebElement edit2;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@TextType()
		@FindBy(xpath = "//input[@name=\"pv\"]")
		public WebElement PayRun;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@PageWait.Field(timeoutSeconds = 10)
		@ButtonType()
		@FindByLabel(label = "Run Report")
		public WebElement runReport;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"JeMR0fPGBf-item-0\"]//a")
		public WebElement editSalesforceClassic;
	}
	@FindBy(xpath = "//iframe[contains(@class, \"isEdit\")]")
	public Frame1 frame;
	@PageFrame()
	public static class Frame2 {

		@ButtonType()
		@FindByLabel(label = "More Actions")
		public WebElement moreActions;
	}
	@FindBy(xpath = "//iframe[contains(@class, \"isView\")]")
	public Frame2 frame1;
	
//new frame

@PageFrame()
	public static class Framenew {
	
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'slds-dropdown-trigger slds-dropdown-trigger--click slds-button--last')]")
	public WebElement trigger1;
	
	@LinkType()
	@FindBy(xpath = "//ul[contains(@class, 'dropdown__list slds-dropdown--length-10')]/li[1]/a")
	public WebElement editSalesforceClassic1;
	
	}
	@FindBy(xpath = "//iframe[contains(@class, 'isView reportsReportBuilder')]")
	public Framenew Framenew;			
}



