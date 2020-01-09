package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriverException;
import com.baseproject.utility.BasePage;
import com.baseproject.utility.Log;
public class foxBasePage extends BasePage {
      


	
	
	 public foxBasePage() {
         initPageFactory( this);
   }
	
	
     /**
     * This function is to initialize Property file, initialize
     * Webdriver
     *
     */
    
     public synchronized void setup() throws Exception {
    	
    	 try {
             DateTimeFormatter ft = DateTimeFormatter.ofPattern("MM.dd.yyyy.hh.mm.ss");
             if (runTime == null) {
                   runTime = LocalDateTime.now().format(ft);
             }

             createFolder("logs");
             createFolder("screenshots");
           
       } catch (WebDriverException e) {
             Log.error("WebDriver exception occurred at preinit() ", e);
       } catch (Exception e) {
             Log.error("Exception occurred at preinit()  ", e);
       }
    	 
             initProperties();
             intiDriver();
             try {       
             Log.info("-----------Test Class [" + this.getClass().getSimpleName()
                     + "] Execution Started-------------");
   } catch (WebDriverException e) {
         Log.error("WebDriver exception occurred at init() ", e);
   } catch (Exception e) {
         Log.error("Exception occurred at init()  ", e);
   }
             
 }
   


       
     

  
     public synchronized void tearDown() {
			  
    	 try {
             Log.info("-----------Test Class [" + this.getClass().getSimpleName() + "] Execution Completed-----------");
             // getExtentReportThreadSafe().removeTest(getExtentTestThreadSafe());
             getExtentReportThreadSafe().flush();
             closeExcelConnection();
             if (getWebDriver() != null) {
                   getWebDriver().close();
                   getWebDriver().quit();
             }
       } catch (Exception e) {
             Log.error("Exception occurred @TearDown: " + e.getMessage());
       }
 }
}
     

         
         
    
      
	      

