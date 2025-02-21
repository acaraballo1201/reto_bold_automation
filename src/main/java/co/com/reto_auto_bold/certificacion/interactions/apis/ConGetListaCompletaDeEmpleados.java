package co.com.reto_auto_bold.certificacion.interactions.apis;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Assert;

import static co.com.reto_auto_bold.certificacion.utils.apis.ConcatenarMetodos.LISTA_COMPLETA_DE_EMPLEADOS;

public class ConGetListaCompletaDeEmpleados implements Interaction {

    public static ConGetListaCompletaDeEmpleados conGetEmpleados() {
        return Tasks.instrumented(ConGetListaCompletaDeEmpleados.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(LISTA_COMPLETA_DE_EMPLEADOS.toString())
                .with(requestSpecification -> requestSpecification
                        ));
        Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());
        System.out.println("si se obtuvo codigo 200");
    }
}

