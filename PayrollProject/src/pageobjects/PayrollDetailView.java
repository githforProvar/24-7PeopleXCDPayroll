package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Payroll Detail View"                                
               , summary=""
               , page="PayrollDetailView"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__XCD_PAY_Payroll__c"
               , connection="LogonAs"
     )             
public class PayrollDetailView {

	@PageRow()
	public static class PayRuns {
	
		@FindBy(xpath ="//th/a")
		public WebElement payRun;
		
	
	}

	//@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[@class='list']/tbody/tr")
	@PageTable(firstRowContainsHeaders = true, row = PayRuns.class)
	public List<PayRuns> PayRuns;
	
}
