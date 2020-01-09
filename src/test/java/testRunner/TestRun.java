package testRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

//@RunWith(Cucumber.class)
@CucumberOptions( 
	    features = "src//test//java//features",
        glue = {"stepDefinations"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
        )
	    
public class TestRun extends AbstractTestNGCucumberTests  {
	


	
	
	
}

