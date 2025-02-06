package co.com.reto_auto_bold.certificacion.interactions.apis;

import co.com.reto_auto_bold.certificacion.utils.apis.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Assert;

import static co.com.reto_auto_bold.certificacion.utils.apis.ConcatenarMetodos.CREAR_USUARIO;
import static co.com.reto_auto_bold.certificacion.utils.apis.enums.EnumsTransversal.JOB;
import static co.com.reto_auto_bold.certificacion.utils.apis.enums.EnumsTransversal.NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConPostCrearUsuario implements Interaction {
    GestionarDatos Data = new GestionarDatos();

    public static ConPostCrearUsuario enApi() {
        return instrumented(ConPostCrearUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(CREAR_USUARIO.toString()).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + NAME.getLlave() + '\"' + ":" + '\"' + NAME.getValor() + '\"' + "," +
                                                '\"' + JOB.getLlave() + '\"' + ":" + '\"' + JOB.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(201, SerenityRest.lastResponse().statusCode());

    }
}
