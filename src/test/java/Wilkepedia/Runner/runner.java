package Wilkepedia.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Wilkepedia/Features/",glue="Wilkepedia")
public class runner {
}
