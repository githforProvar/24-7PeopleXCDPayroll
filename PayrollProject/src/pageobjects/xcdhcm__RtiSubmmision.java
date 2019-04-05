package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Xcdhcm__ Rti Submmision"                                
               , summary=""
               , page="RtiSubmmision"
               , namespacePrefix="xcdhcm"
               , object="xcdhcm__RTI_Submission__c"
               , connection="Admin"
     )             
public class xcdhcm__RtiSubmmision {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='theButton']")
	public WebElement newEPS;
	
}
