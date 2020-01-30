package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demo28janu.feature",glue= {"stepGlue"},tags= {"@datadriven"},plugin= {"json:target/cucumber-report.json"})
public class TestRunner {

}
