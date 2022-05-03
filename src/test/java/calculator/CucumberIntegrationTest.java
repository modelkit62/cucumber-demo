package calculator;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "classpath:Feature/calculator.feature")
public class CucumberIntegrationTest {
}

/*
@CucumberOptions(plugin = "pretty", features = "classpath:Feature/calculator.feature")
@CucumberOptions(plugin = "pretty", features = "src/test/resources")
@CucumberOptions(features = "classpath:Feature")
*/
