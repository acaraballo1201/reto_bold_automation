package co.com.reto_auto_bold.certificacion.interactions.transversales;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AbrirNavegador implements Interaction {

  public static AbrirNavegador enPantalla() {
    return instrumented(AbrirNavegador.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    getDriver().manage().window().maximize();
    actor.attemptsTo(Open.url("https://demoqa.com/"));
  }
}
