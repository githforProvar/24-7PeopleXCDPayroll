package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Personal"                                
     , summary=""
     , relativeUrl=""
     , connection="LogonAs"
     )             
public class Personal {

	@PageWait.Field(field = "payroll", timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'xcdhcmHeaderWithIcon')]/ul/li[10]/a")
	public WebElement payroll;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-border_bottom\")]/div[1]/div[1]/button")
	public WebElement edit;
	@PageWait.Timed(durationSeconds = 10)
	@TextType()
	//@FindBy(xpath = "//div/div[2]/dl/div[1]//span")
	@FindBy(xpath = "//*[text()='Tax code']/../following-sibling::div[1]//span")
	public WebElement taxCode;
	@PageWait.Timed(durationSeconds = 1)
	@TextType()
	@FindBy(xpath = "//div/div[2]/dl/div[2]//span")
	public WebElement taxBasis;
	@LinkType()
	@FindBy(linkText = "Payroll")
	public WebElement payroll1;
	@LinkType()
	@FindBy(xpath = "(//li[@data-record='payroll'])[last()]")
	public WebElement payroll2;
	@FindBy(xpath = "(//button[contains(text(),'Edit')])[last()]")
	@ButtonType()
	public WebElement edit1;
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(xpath = "//p[contains(text(),'NI category')]/../following-sibling::div/div/div/select[contains(@name='j_id0')]")
	@TextType()
	public WebElement nICategory;
	@FindBy(xpath = "//div[5]/div[2]/div/span[contains(@data-aura-rendered-by,'143')]")
	@TextType()
	public WebElement cellValue;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id6:j_id35:j_id145:j_id146:4:j_id154\"]")
	public WebElement NICategory;
			
}
