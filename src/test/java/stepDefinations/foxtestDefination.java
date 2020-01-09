package stepDefinations;

import java.io.IOException;
import com.baseproject.base.BaseTest;
import cucumber.api.java.en.*;
import pages.foxLoginPage;
import pages.foxPage;
import pages.foxBasePage;



public class foxtestDefination extends BaseTest {
	
	public String URL,Company,User,Pass;
	public foxLoginPage foxloginPage;
	public foxPage foxPage;
	public foxBasePage foxBasePage;
	
	

	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Exception  {
     
		foxBasePage=new foxBasePage();
		
		foxBasePage.setup();
		
		 //WIth config file
  	  
    	Company= getPropertyValue("company");
        User = getPropertyValue("user");
        Pass = getPropertyValue("pass");
        URL=getPropertyValue("url");
         
        foxloginPage= new foxLoginPage();
        
        //foxloginPage.openLoginPage(URL);
        foxloginPage.openLoginPage(getURL("url"));
        foxloginPage.LoginfoxApplication(Company,User, Pass);
        
       
           
    }
	
	
	 
	 @When("^User Enter PTORequestDates \"([^\"]*)\" and ptorequesttype \"([^\"]*)\" and login$")
	    public void user_enter_ptorequestdates_something_and_ptorequesttype_something_and_login(String strArg1, String strArg2) {
	        
	        
	   foxPage= new foxPage();    
	   foxPage.click_Mypto_link();
	   foxPage.click_PTORequest_Tab();
	   foxPage.click_AddPTORequest_button ();    
	   foxPage.entertext_PTORequest_Dates(strArg1);
	   foxPage.click_Apply_button();
	   foxPage.click_dropdown_ptorequesttype();
	   foxPage.entertext_ptorequesttype(strArg2);
	    	  
	    }

	 @Then("^Verify Timesheet is displayed$")
	    public void verify_timesheet_is_displayed() throws IOException {
	        
	   foxPage.click_dropdown_ptorequesttype_sick();
	   foxPage.click_submit_button();
	   foxBasePage.tearDown();
	     
	    }
	 
	 


	
}