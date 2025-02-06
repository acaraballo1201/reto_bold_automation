package co.com.reto_auto_bold.certificacion.stepDefinitions.web.authentication;

import co.com.reto_auto_bold.certificacion.interactions.transversales.AbrirNavegador;
import co.com.reto_auto_bold.certificacion.questions.web.ValidarCreacion;
import co.com.reto_auto_bold.certificacion.tasks.DiligenciarCamposTextBox;
import co.com.reto_auto_bold.certificacion.tasks.IngresarAlFormulario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStepDefinitions {

    @Dado("que {string} ingresa con a la pagina de demoqa")
    public void abrirNavegador(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(AbrirNavegador.enPantalla());
    }

    @Cuando("el ingresa al menu {string} y al apartado {string}")
    public void ingresarMenu(String menuPrincipal, String opcionMenu) {
        theActorInTheSpotlight().attemptsTo(IngresarAlFormulario.demoQa(menuPrincipal,opcionMenu));
    }

    @Y("el ingresa los datos del formulario")
    public void ingresarInformacionEnFormulario(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(DiligenciarCamposTextBox.conDatos(datos));
    }

    @Entonces("el podra observar el resumen de la informacion ingresada")
    public void verificarVisibilidadProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ValidarCreacion.conDatos()).isTrue());

    }
}