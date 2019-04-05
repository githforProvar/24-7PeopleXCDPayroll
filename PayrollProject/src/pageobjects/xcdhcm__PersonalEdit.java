package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Personal Edit"                                
               , summary=""
               , page="PersonalEdit"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__Employee_Detail__c"
               , connection="Admin"
     )             
public class xcdhcm__PersonalEdit {

	@TextType()
	@FindBy(name = "j_id0:j_id6:j_id35:j_id145:j_id146:0:j_id154")
	public WebElement taxCode;
	@ChoiceListType(values = { @ChoiceListValue(value = "Week1/Month1"), @ChoiceListValue(value = "Cumulative") })
	@FindBy(name = "j_id0:j_id6:j_id35:j_id145:j_id146:1:j_id154")
	public WebElement taxBasis;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
