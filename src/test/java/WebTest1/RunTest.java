package WebTest1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = ".", tags = "@addtocart", plugin = {"pretty", "html:target/Destination" })

    public class RunTest {
}
