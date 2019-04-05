package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Payroll Detail View"                                
               , summary=""
               , page="PayrollDetailView"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__XCD_PAY_Payroll__c"
               , connection="Admin"
     )   
               
public class xcdhcm__PayrollDetailView {
	
	@PageRow()
    public static class PayRollDetailViewTable
     {
	    //now understood how to write @FindBy code
	    // from the table rows of application inspect the columns and 
	    // write the xpath
	    
	    @LinkType()
		@VisualforceBy(componentXPath = ".//td[1]/a[2]")
		public WebElement Twoweek2;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:form[@id='theForm']//div[contains(@class, \"pShowMore\")]//a[2]")
		public WebElement goToList50;
		@LinkType()
		@FindBy(linkText = "Two Week-2")
		public WebElement TwoWeeklyRecord;
      }
	
	
	
	
	@FindBy(xpath="//iframe[1]")
 public iframe iframe;
 
 @PageFrame()
 public static class iframe
 {
    @FindBy(xpath = "//div[contains(@class,'pbBody')]/table[@class='list']/tbody/tr")
    @PageTable(firstRowContainsHeaders = false, row = PayRollDetailViewTable.class)
    public List<xcdhcm__PayrollDetailView> PayRollDetailViewTable;
 }




@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
@PageWait.Field(timeoutSeconds = 10)
@LinkType()
@VisualforceBy(componentXPath = "apex:form[@id='theForm']//tbody/tr[2]/th/a")
public WebElement twoWeek2;
@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
@PageWait.Field(timeoutSeconds = 10)
@LinkType()
@FindBy(linkText = "Two Week-2")
public WebElement twoWeek22;

@PageRow()
public static class Table {
}




@FindByLabel(label = "Two Week-2")
@PageTable(firstRowContainsHeaders = false, row = Table.class)
public List<Table> table;

@PageRow()
public static class Table1 {
}




@FindByLabel(label = "Two Week-2")
@PageTable(firstRowContainsHeaders = false, row = Table1.class)
public List<Table1> table1;
@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
@PageWait.Field(timeoutSeconds = 10)
@LinkType()
@FindBy(xpath = "//h3[text()='Pay Runs']/ancestor::div[@class='pbHeader']/following-sibling::div[@class='pbBody']//a[contains(text(),'Go to list')]")
public WebElement goToList;   
	
}
