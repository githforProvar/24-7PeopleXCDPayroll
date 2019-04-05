package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Payroll"                                
               , page="Payroll"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Pay_Period__c"
               , connection="Admin"
     )             
public class Payroll {

	@PageWait.Field(field = "search", timeoutSeconds = 10)
	@PageWaitAfter.Timed(durationSeconds = 10)
	@TextType()
	@VisualforceBy(componentXPath = "apex:form//td[4]/input")
	public WebElement search;
	
	 @LinkType()
	 @VisualforceBy(componentXPath = "apex:form//tr[10]/td[1]/a")
	 public WebElement gLTWPayroll;
	
	@PageRow()
       public static class PayrollTable {
    	   
    	   @FindBy(xpath=".//td[1]/a")
    	   public WebElement payRoll; 
    	   
    	  
    	   
    	    @FindBy(xpath=".//td[2]")
    	   public WebElement payRun; 
    	   
       }

       //@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
       @FindBy(xpath = "//table[contains(@class, 'table')]/tbody/tr")
       @PageTable(firstRowContainsHeaders = false, row = PayrollTable.class)
       public List<PayrollTable> PayrollTable;
	
	
	
	
	
}
