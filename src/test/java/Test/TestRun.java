package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/SignUp.feature"},
        glue = {"Steps"},
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true)
public class TestRun extends AbstractTestNGCucumberTests {
}
