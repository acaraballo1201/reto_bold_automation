package co.com.reto_auto_bold.certificacion.tasks;

import co.com.reto_auto_bold.certificacion.interactions.esperas.EsperarElemento;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.reto_auto_bold.certificacion.userInterfaces.PageDemoQa.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAlFormulario implements Task {

    private final String menuPrincipal;
    private final String opcionMenu;

    public IngresarAlFormulario(String menuPrincipal, String opcionMenu) {
        this.menuPrincipal = menuPrincipal;
        this.opcionMenu = opcionMenu;
    }

    public static IngresarAlFormulario demoQa(String menuPrincipal, String opcionMenu) {
        return instrumented(IngresarAlFormulario.class, menuPrincipal, opcionMenu);
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BUTTON_ELEMENTS.of(menuPrincipal)),
                Click.on(BUTTON_ELEMENTS.of(menuPrincipal)),
                EsperarElemento.esClickable(BUTTON_TEXT_BOX.of(opcionMenu)),
                Click.on(BUTTON_TEXT_BOX.of(opcionMenu)),
                EsperarElemento.esClickable(BUTTON_SUBMIT)
        );
    }
}
