package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//		features = "src/test/resources/features/TestDataObjects.feature",
		features = "src/test/resources/features",
		glue = {"stepDefinations"}
		//		,tags= {"~@RegressionTest,~@smokeTest"} //exclude regression test and smoke test scripts
		,tags= {"@RegressionTest,@smokeTest"} //or condition, include regression and smoke test only
		//		,tags= {"@RegressionTest","@smokeTest"} //and condition
		,plugin= {"pretty", "html: Reports/report"}
		//		,monochrome=true
		)
public class runner {

}
