package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",// donde se encuentran las fectures
        glue = "steps"// donde se encuentran las definiciones
)
 public class Runner {
}
