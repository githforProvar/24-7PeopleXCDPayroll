package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Payroll"                                
               , summary=""
               , page="Payroll"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Pay_Period__c"
               , connection="Admin"
     )             
public class xcdhcm__Payroll {

	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@VisualforceBy(componentXPath = "apex:form//td[4]/input")
	@TextType()
	public WebElement Search;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@VisualforceBy(componentXPath = "apex:form//tr[1]/td[1]/a")
	public WebElement gLTWPayroll;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "GLTW_Payroll")
	public WebElement gLTWPayroll1;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@VisualforceBy(componentXPath = "apex:form//tr[2]/td[1]/a")
	public WebElement weeklyPayroll;
	
	@PageRow()
    public static class PayRollTable {
    //now understood how to write @FindBy code
    // from the table rows of application inspect the columns and 
    // write the xpath
    
            @FindBy(xpath = ".//td[1]//a")
            public WebElement payroll;   
                   
            @FindBy(xpath = ".//td[4]")
            public WebElement frequency;
           
            @FindBy(xpath = ".//td[6]//a")
            public WebElement employer;
            
    }
    @FindBy(xpath = ".//table[contains(@class,'myTable')]/tbody/tr")
    @PageTable(firstRowContainsHeaders = false, row = PayRollTable.class)
    public List<PayRollTable> payRollTable;
    //now understood how to write @FindBy code
    

 

    //This is some other locator element(not related to payroll search and click)
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='Newpayroll']")
	public WebElement newPayroll;
			
}

