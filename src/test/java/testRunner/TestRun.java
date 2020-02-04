package testRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

//@RunWith(Cucumber.class)
@CucumberOptions( 
		dryRun = false,
		tags = { "@homepage" },
	    features = "src/test/java/features",
        glue = {"stepDefinations","runner","l"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
        )
	    
public class TestRun extends AbstractTestNGCucumberTests  {
	


	
	
	
}

