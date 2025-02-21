package co.com.reto_auto_bold.certificacion.questions.apis;

import co.com.reto_auto_bold.certificacion.utils.apis.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ValidacionStatusResponse implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final String status;
    private boolean statusResponse = true;

    public ValidacionStatusResponse(String status) {
        this.status = status;
    }

    public static ValidacionStatusResponse is(String status) {
        return new ValidacionStatusResponse(status);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(Data.obtenerDatos("status"),equalTo(status));
        return statusResponse;
    }

}
