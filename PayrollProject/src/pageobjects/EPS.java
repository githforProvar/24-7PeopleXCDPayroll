package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="EPS"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class EPS {

	@TextType()
	@FindBy(xpath = "//ul[contains(@class, \"slds-grid\")]/li[8]/a//span")
	public WebElement HMRCTab;
	
	@PageRow()
	public static class dddd
	 {

		@ButtonType()
		@FindBy(xpath = ".//td[2]/input[contains(@value,'New EPS')]")
		public WebElement newEPS;
	 }
	
	//
	public empFrame empFrame;
	@FindBy(css = "#vfFrameId_1544351406699")
	


@PageFrame()
public static class empFrame
{
@ButtonType()
		@FindBy(xpath = ".//td[2]/input[contains(@value,'New EPS')]")
		public WebElement newEPS;


	
	
}
	
@FindBy(xpath = "//div[contains(@class,'pbHeader')]/table/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = dddd.class)
	public List<dddd> dddd ;	
	
	
	
	
	
	
	
	
	
	
	
	//
	
	
	

	@PageFrame()
	public static class Frame {

	
		@ChoiceListType()
		@FindByLabel(label = "Select employer")
		public WebElement selectEmployer;
		@LinkType()
		@FindBy(xpath = "//table[contains(@class,'list')]//tbody/tr[1]/td[1]/a")
		public WebElement rTI;
	}
	
	
	@FindBy(css = "#vfFrameId_1544351276342")
	public Frame frame;

	@PageFrame()
	public static class Frame1 {

		@ChoiceListType()
		@FindByLabel(label = "Select employer")
		public WebElement selectEmployer;
		@ChoiceListType()
		@FindByLabel(label = "Select tax year")
		public WebElement selectTaxYear;
		@ChoiceListType()
		@FindByLabel(label = "Select period")
		public WebElement selectPeriod;
		@ButtonType()
		@FindBy(xpath = "//td[contains(@class, \"pbButtonb\")]//input[1]")
		public WebElement createEPS;
		@ButtonType()
		@FindByLabel(label = "OK")
		public WebElement oK;
	}

	

	@PageFrame()
	public static class Frame2 {
	}

	@FindBy(css = "#vfFrameId_1544351942991")
	public Frame2 frame2;

	

}
