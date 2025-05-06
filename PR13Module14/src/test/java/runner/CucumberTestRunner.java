package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/cucumber-report.html"}, //berisi plugin yang akan dipakai
        glue = {"stepDefinitions"}, //lokasi file step definition
        features = {"src/test/resources/features"} //lokasi file feature
)



public class CucumberTestRunner {


}
