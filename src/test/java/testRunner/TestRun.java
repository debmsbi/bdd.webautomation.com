package testRunner;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 

//@RunWith(Cucumber.class)
@CucumberOptions( 
	    features = "src//test//java//features",
        glue = {"stepDefinations"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
        "json:target/cucumber.json"},
        monochrome = true
        )
	    
public class TestRun extends AbstractTestNGCucumberTests  {
	
   
    @BeforeClass(alwaysRun = true)
    public static void beforeclass() throws Exception {
          
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
    	System.setProperty("currentdate", dateFormat.format(new Date()));         
                   
    }
	
	
	
}

