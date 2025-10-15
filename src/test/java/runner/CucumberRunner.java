package runner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 

@RunWith(Cucumber.class)
@CucumberOptions(
features="./src/test/resources/",
glue="steps",
plugin = {
		"pretty",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "html:target/cucumber-reports.html"
},
tags= "@Completed"
)
public class CucumberRunner {
 
}