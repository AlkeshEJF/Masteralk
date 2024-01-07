package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Specify the path to your feature files
        glue = "src/test/java/stepdef" // Specify the package where your step definitions are located
)
public class testRunner {
	
	
	
	
	
}

