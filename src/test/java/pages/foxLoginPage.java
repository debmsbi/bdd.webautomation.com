package pages;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.security.InvalidParameterException;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.baseproject.utility.BasePage;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class foxLoginPage extends BasePage{
      
	  @FindBy(id = "txtCorpID") WebElement legacycompany;
      @FindBy(id = "txtLoginID") WebElement legacyUsername;
      @FindBy(name = "txtPassword") WebElement legacyPassword;
      @FindBy(name = "btnLogin") WebElement legacyLogin;
     
      
      
      public foxLoginPage() {
            initPageFactory( this);
      }
      

      
      
      /*
     * open url
     */
     public void openLoginPage(String url) {
                       openUrl(url);
     }
    
     /*
      * Enter Company
      * Enter Username
      * Enter Password
      * CLick on Login Button
      */
      
     public void LoginfoxApplication(String company,String username,String password){
         
	     enterLegacyCompany(company);
         enterLegacyUsername(username);
         enterLegacyPassword(password);
         clickOnLegacyLogin();
         
   }
     
     private void enterLegacyCompany(String optionText) {
         System.out.println("i am inside");
         enterText("Company", legacycompany, optionText);
   }
      
      private void enterLegacyUsername(String optionText) {
            System.out.println("i am inside");
            enterText("User Name", legacyUsername, optionText);
      }
      
      
      private void enterLegacyPassword(String optionText) {
    	  System.out.println("i am inside");
            enterText("Password", legacyPassword, optionText);
      }
      
      
      private void clickOnLegacyLogin() {
            clickOnElement("Submit", legacyLogin);
      }
      
      
      
     
      
}
