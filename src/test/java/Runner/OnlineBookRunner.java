package Runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/book.feature"
		,glue={"stepdefination"},
		plugin={"pretty", "html:cucumberReport/cucumber-html-report","json:cucumberReport/cucumber-report.json"}
		//,tags={"@loginHomePage"}
		//,tags={"@displayUsersAPI"}
		//,tags={"@searchBooksUI"}
		,tags={"@searchBooksAPI"}
		)

public class OnlineBookRunner {

}
