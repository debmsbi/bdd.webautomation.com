package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class foxPage extends BasePage {
      
      //Locators Webelement
      @FindBy(xpath = "//*[@id='mainNavPTO']/a") WebElement click_Mypto_link;
      @FindBy(id = "nav-one") WebElement click_PTORequest_Tab;
      @FindBy(id="btnPTORequest") WebElement click_AddPTORequest_button;
      @FindBy(id="dtFromToDate") WebElement entertext_PTORequest_Dates;
      @FindBy(xpath = "//*[contains(text(),'Apply')]") WebElement click_Apply_button;
      @FindBy(xpath = "//*[@id='s2id_dropPTOType']/a/span[2]/b")  WebElement click_dropdown_ptorequesttype;
      @FindBy(id = "s2id_autogen4_search") WebElement entertext_ptorequesttype;
      @FindBy(xpath = "//*[@id='select2-results-4']/li/div/span")  WebElement click_dropdown_ptorequesttype_sick;
      @FindBy(id = "btnSubmit") WebElement click_submit_button;
    
      
	 
	 //Constructor
            public foxPage() {
                  initPageFactory( this);
            }
      
      
            //Properties 
            
            public void click_Mypto_link() {
                
            	clickOnElement("click_Mypto_link", click_Mypto_link );
            	 /*JavascriptExecutor executor = (JavascriptExecutor)driver;
                 executor.executeScript("arguments[0].click();", click_Mypto_link);*/
          }
            
            public void click_PTORequest_Tab() {
                
            	clickOnElement("click_PTORequest_Tab", click_PTORequest_Tab );
            	 /*JavascriptExecutor executor = (JavascriptExecutor)driver;
                 executor.executeScript("arguments[0].click();", click_PTORequest_Tab);*/
          }
            
            public void click_AddPTORequest_button () {
                
           	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", click_AddPTORequest_button);
         }
            
            public void entertext_PTORequest_Dates(String text) {
                
            	enterText("entertext_PTORequest_Dates", entertext_PTORequest_Dates, text);
         }
            
            public void  click_Apply_button() {
            	
            	clickOnElement("click_Apply_button", click_Apply_button );
                
         }
            
            public void  click_dropdown_ptorequesttype() {
            	
            	clickOnElement("click_dropdown_ptorequesttype", click_dropdown_ptorequesttype );
         }
            
            public void  entertext_ptorequesttype(String text) {
                
            	enterText("entertext_ptorequesttype", entertext_ptorequesttype, text);
         }
           
            public void  click_dropdown_ptorequesttype_sick() {
            	
            	clickOnElement("click_dropdown_ptorequesttype_sick", click_dropdown_ptorequesttype_sick );
         }

            
            public void  click_submit_button() {
            	
            	clickOnElement("click_submit_button", click_submit_button );
         }
        
    
            
        
            //Methods
      
      
}
