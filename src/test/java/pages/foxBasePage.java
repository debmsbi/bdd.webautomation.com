package pages;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.baseproject.base.BaseTest;
import com.baseproject.utility.BasePage;
import com.baseproject.utility.Log;

public class foxBasePage extends BasePage {
      


	
	
	 public foxBasePage() {
         initPageFactory( this);
   }
	
	
     /**
     * This function is to initialize Property file, initialize Excel, initialize
     * Webdriver
     *
     */
    
     public synchronized void setup() throws Exception {
           {
                 try {
                       
                       initProperties();
                       intiDriver();

                       Log.info("-----------Test Class [" + this.getClass().getSimpleName() + "] Execution started-----------");                      
                 } catch (WebDriverException e) {
                       Log.error("WebDriver exception occurred at init() ", e);
                 } catch (Exception e) {
                       Log.error("Exception occurred at init()  ", e);
                 }
           }
     }

  
     public synchronized void tearDown() {
         try {
               Log.info("-----------Test Class [" + this.getClass().getSimpleName() + "] Execution Completed-----------");
            
                     getWebDriver().close();
                     getWebDriver().quit();
               
         } catch (Exception e) {
               Log.error("Exception occurred @TearDown: " + e.getMessage());
         }
   }
    
      
	      
}
