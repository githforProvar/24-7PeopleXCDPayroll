package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pay Run"                                
               , summary=""
               , page="PayrollPeriod"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Pay_Period__c"
               , connection="LogonAs"
     )             
public class PayRun {

	@PageRow()
	public static class ExcludedEmployeesTable {
		
		@BooleanType()
		@FindBy(xpath = ".//td[1]/input")
		public WebElement selectRow;
		
		@FindBy(xpath = ".//td[2]/a")
		public WebElement employeeName;
		
	}

	//@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, 'table table-hover')]//tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = ExcludedEmployeesTable.class)
	public List<ExcludedEmployeesTable> ExcludedEmployeesTable;
	
	@PageWait.Field(field = "generateDraft", timeoutSeconds = 20)
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form[@id='theForm']/apex:outputPanel[not(@id)]//center/input[2]")
	public WebElement generateDraft;
	
	
		
}
