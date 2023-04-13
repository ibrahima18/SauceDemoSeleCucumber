import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@POEI23-372","@POEI23-386"},
        //chemin  pour les fichiers fetaures
        features = "src/test/resources/features",
        //dossier qui contient les steps de java//
        glue = "",
        monochrome = true,
        //plugin = {
        //        "pretty",
        //      "html:target/cucumber-reports/cucumber-pretty",
        //       "json:target/cucumber-reports/CucumberTestReport.json",
        //        "junit:target/cucumber-reports/CucumberTestReport.xml"
        //  }
        //
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }

)
public class RunnerMyTests {
}
