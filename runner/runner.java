package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.Bass;

@CucumberOptions(features= "src/test/java/cucumber"
,glue="steps"
,monochrome=true
,publish=true)
public class runner extends Bass {

}
