package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="PayrollTab"                                
     , connection="Admin"
     )             
public class PayrollTab {

	@LinkType()
	@FindBy(xpath = "//ul[contains(@class, \"slds-grid\")]/li[3]/a/span")
	public WebElement payroll;
	
	@LinkType()
	@FindBy(linkText = "DO NOT TOUCH AUTOMATION EMP 443")
	public WebElement employee;
	
	
	
	@TextType()
	@AngularBy(controller = "customerCtrl", tagName = "INPUT", model = "criteria.searchtext")
	public WebElement Search;
	
	@LinkType()
	@FindBy(xpath = "//*[@id='oneHeader']/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a/span")
	//@FindBy(xpath = "//ul[contains(@class, \"slds-grid\")]/li[3]/a/span")
	//
//*[@id="oneHeader"]/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a/span
	public WebElement payrollTab;
	
}
