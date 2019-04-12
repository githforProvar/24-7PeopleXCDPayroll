package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Payroll Period"                                
               , summary=""
               , page="PayrollPeriod"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Pay_Period__c"
               , connection="Admin"
     )             
public class xcdhcm__PayrollPeriod {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!Edit}']")
	public WebElement edit;
	
	@TextType()
	@AngularBy(model = "openModal()", controller = "ctrlRead", tagName = "SPAN", click = "openModal()")
	public WebElement Excluded_Employees;
	
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='newOutputPanel']//th[contains(@class, \"paySummary.selected\")]//input")
	public WebElement newOutputPanel;
	
	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='newOutputPanel']//table[contains(@class, \"table\")]/tbody/tr[1]/td[2]/a")
	public WebElement employee;
	
	@TextType()
	@AngularBy(click = "criteria.searchtext", controller = "ctrlRead", tagName = "INPUT", model = "criteria.searchtext")
	public WebElement search;
	
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='newOutputPanel']//input[@name=\"item.selected\"]")
	public WebElement newOutputPanel1;
	
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='theForm']/apex:outputPanel[not(@id)]//center/input[2]")
	public WebElement generateDraft;
	
	
	
	@PageRow()
	public static class Employees
	 {

		@LinkType()
		@FindBy(xpath = ".//td[2]/a")
		public WebElement employeeName;
		
		@BooleanType()
		@FindBy(xpath = ".//td[1]/input")
		public WebElement employeeNamechk;
		
		@LinkType()
		@FindBy(xpath = "//th[3]/a/i")
		public WebElement sortemployeeName;
		////table[1]/thead/tr/th[3]/a/i

	
		@BooleanType()
		@FindBy(xpath = "//th[contains(@class,'paySummary.selected')]//input[contains(@ng-model,'selectedAll')]")
		public WebElement payrollSetUpUnSelect;
		
		@ButtonType() 
	    @FindBy(xpath = "//input[contains(@ng-click,'generateFinalPayrol()')]")
	    public WebElement generateFinalDraft;
	    
	     @FindBy(xpath = "//input[contains(@value,'Create FPS')]")
		@ButtonType()
	    public WebElement createFPS;
	
	
		/*
			//@BooleanType()
			//@AngularBy(controller = "ctrlRead", tagName = "INPUT", model = "selectedAll")
			//public WebElement UnSelectEmployees;
		 */
		
	}
	
	@FindBy(xpath ="//table[contains(@class,'table')]/tbody/tr[contains(@class,'ng-scope')]")
	@PageTable(firstRowContainsHeaders = true, row = Employees.class)
	public List<Employees> Employees;
	
	
	 @TextType
     @FindBy(xpath = "((//form[contains(@id,'j_id0:theForm')]/div)[1]//span)[2]")
     public WebElement draftStatus;
     
     

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]/apex:commandButton[@action='{!fetchFPSData}']")
	public WebElement oK;

	
      
	
	/*
		@PageFrame()

        public static class Frame

        {

           @BooleanType()

            @FindBy(xpath = "//th[contains(@class,'paySummary.selected')]//input")

            public WebElement unSelecCheckBox;

         }

         @FindBy(xpath = "//iframe[@name='vfFrameId_1539106215807']")

         public Frame frame;



    */
	
	
}


