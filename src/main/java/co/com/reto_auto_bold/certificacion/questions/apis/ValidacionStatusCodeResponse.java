package co.com.reto_auto_bold.certificacion.questions.apis;

import co.com.reto_auto_bold.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

public class ValidacionStatusCodeResponse implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final int statusCode;
    private boolean statusCodeResponse = true;

    public ValidacionStatusCodeResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public static ValidacionStatusCodeResponse is(int statusCode) {
        return new ValidacionStatusCodeResponse(statusCode);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
        return statusCodeResponse;
    }

}
