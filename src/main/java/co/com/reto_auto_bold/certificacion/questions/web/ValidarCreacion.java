package co.com.reto_auto_bold.certificacion.questions.web;


import co.com.reto_auto_bold.certificacion.utils.web.enums.EnumModelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

import static co.com.reto_auto_bold.certificacion.userInterfaces.PageDemoQa.*;
import static co.com.reto_auto_bold.certificacion.utils.web.enums.EnumRecord.EXCEPTION_ERROR_ACTOR_REMEMBER;
import static co.com.reto_auto_bold.certificacion.utils.web.enums.EnumRecord.FORM_DATA;

public class ValidarCreacion implements Question<Boolean> {

    public static ValidarCreacion conDatos() {
        return new ValidarCreacion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Map<String, String> expectedData = actor.recall(FORM_DATA.toString());

        if (expectedData == null || expectedData.isEmpty()) {
            throw new IllegalStateException(EXCEPTION_ERROR_ACTOR_REMEMBER.toString());
        }

        boolean nombreCorrecto = Text.of(NOMBRE_CREADO).answeredBy(actor).contains(expectedData.get(EnumModelo.FULL_NAME));
        boolean emailCorrrecto = Text.of(EMAIL_CREADO).answeredBy(actor).contains(expectedData.get(EnumModelo.EMAIL));
        boolean currentAddressCorrecta = Text.of(CURRENT_ADDRESS_CREADO).answeredBy(actor).contains(expectedData.get(EnumModelo.CURRENT_ADDRESS));
        boolean permanentAddressCorrecta = Text.of(PERMANENT_ADDRESS_CREADO).answeredBy(actor).contains(expectedData.get(EnumModelo.PERMANENT_ADDRESS));

        return nombreCorrecto && emailCorrrecto && currentAddressCorrecta && permanentAddressCorrecta;
    }

}
