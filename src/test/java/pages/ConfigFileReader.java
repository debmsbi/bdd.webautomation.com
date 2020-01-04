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

public class ConfigFileReader extends BasePage {
      
	
	 public ConfigFileReader() {
         initPageFactory( this);
   }
	
	
	 /**
      * The function is to Get Property value from Project specific Config.properties
      * file <br>
      * 
       * @param propertykey as parameter to fetch corresponding value <br>
      * @return String value for key of Config.properties file (Project specific)
      *         else returns null
      */
      protected static synchronized String getPropertyValue(String propertykey) {
            try {
                  return prop.getProperty(propertykey);
            } catch (Exception e) {
                  return null;
            }
      }
    
	 public String getReportConfigPath(){
			String reportConfigPath = getPropertyValue("reportConfigPath");
			if(reportConfigPath!= null) return reportConfigPath;
			else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
		}	      
}
