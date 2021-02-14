
package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Features\\digiturkson.feature",
        glue = "StepDefinitions",
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty", "html:target/HtmlReports/htmlresults.html",
                "json:target/JsonReports/jsonresults.json",
                "junit:target/JunitReports/junitresults.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:cucumber.runtime.CucumberException: You must supply an output argument to com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter."
        }
        //https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter
)
public class TestRunner {

}


