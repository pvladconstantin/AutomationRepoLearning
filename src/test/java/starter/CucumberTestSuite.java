package starter;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@FIRST",
        plugin = {"pretty"},
        features = "classpath:features/"
)
public class CucumberTestSuite {}

//RUN WITH JAVA 16 or otherwise will crash