package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",// donde se encuentran las fectures
        glue = "steps"// donde se encuentran las definiciones
)
 public class Runner {
}
