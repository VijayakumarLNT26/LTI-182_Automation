package stepDefinitions;

import java.io.File;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(features="src\\test\\resources\\Features\\login.feature",
glue= {"stepDefinitions"},
monochrome=true,
plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/MyReports/report.json","junit:target/MyReports/report.xml"},
dryRun = false,
publish=true)

public class TestRunner extends AbstractTestNGCucumberTests{
	//public TestNGCucumberRunner testNGCucumberRunner;

    }
  


