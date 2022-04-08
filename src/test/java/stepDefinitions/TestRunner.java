package stepDefinitions;

//import java.io.File;
//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
//import org.testng.annotations.BeforeClass;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(features = "src\\test\\resources\\Features\\Other_Policyholder.feature", 
		glue = {"stepDefinitions"}, 
		monochrome = true, 
		plugin = { "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml" }, 
		dryRun = false, 
		publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	/*
	 * public TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass(alwaysRun = false) public void setUpCucumber() {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	 * 
	 * }
	 */
}
