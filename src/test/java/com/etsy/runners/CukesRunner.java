package com.etsy.runners;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import com.etsy.utilities.EmailStatus;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"html:target/cucumber-reports","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:output/newReport.html"},
		features ="./src/test/resources/com/etsy/features",
		glue = "com.etsy.step_defs",
		tags= "@Login",
		dryRun = false,
		monochrome = true
		)

public class CukesRunner {
	
	@AfterClass
    public static void tearDown() throws Exception {
        Reporter.loadXMLConfig(new File("./config.xml"));
        Reporter.setSystemInfo("User", System.getProperty("user.name"));
        Reporter.setSystemInfo("operation System", System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Automated Test");
//        EmailStatus.sendEmail("1danya0443@gmail.com", "lutsenkob87@gmail.com", "file:///Users/bogdanlutsenko/git/ct-loan/output/report.html");
	}
}

		

