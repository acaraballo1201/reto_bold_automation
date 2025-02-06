package co.com.reto_auto_bold.certificacion.tasks;

import co.com.reto_auto_bold.certificacion.utils.web.enums.EnumModelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static co.com.reto_auto_bold.certificacion.userInterfaces.PageDemoQa.*;
import static co.com.reto_auto_bold.certificacion.utils.web.enums.EnumRecord.FORM_DATA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarCamposTextBox implements Task {

    private final List<Map<String, String>> modeloDatosFormulario;

    public DiligenciarCamposTextBox(List<Map<String, String>> modeloDatosFormulario) {
        this.modeloDatosFormulario = modeloDatosFormulario;
    }

    public static DiligenciarCamposTextBox conDatos(List<Map<String, String>> modeloDatosFormulario) {
        return instrumented(DiligenciarCamposTextBox.class, modeloDatosFormulario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> data = modeloDatosFormulario.get(0);

        actor.attemptsTo(
                Enter.theValue(data.get(EnumModelo.FULL_NAME)).into(FULL_NAME),
                Enter.theValue(data.get(EnumModelo.EMAIL)).into(EMAIL),
                Enter.theValue(data.get(EnumModelo.CURRENT_ADDRESS)).into(CURRENT_ADDRESS),
                Enter.theValue(data.get(EnumModelo.PERMANENT_ADDRESS)).into(PERMANENT_ADDRESS),
                Click.on(BUTTON_SUBMIT)
        );

        actor.remember(FORM_DATA.toString(), data);
    }
}
