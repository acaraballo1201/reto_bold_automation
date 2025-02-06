package co.com.reto_auto_bold.certificacion.runners.webRunners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/auto_web/formulario/formulario.feature",
        glue = "co/com/reto_auto_bold/certificacion/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class FormularioRunner {

}