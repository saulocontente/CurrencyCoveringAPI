import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\feature\\AvailableCurrenciesFeature.feature"},
        glue = {"feature.steps_definition"},
        plugin = "pretty",
        snippets = SnippetType.CAMELCASE
)
public class CurrencyConverterRunnerTest {



}
