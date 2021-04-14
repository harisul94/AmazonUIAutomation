package bdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/featureFiles" }, glue = { "bdd.usps.stepDef",
		"bdd.usps.utilities" }, tags = { "@regression" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File("config/config.xml"));
//
//	}

}
