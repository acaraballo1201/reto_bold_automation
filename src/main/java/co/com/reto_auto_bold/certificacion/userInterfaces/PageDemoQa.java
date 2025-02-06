package co.com.reto_auto_bold.certificacion.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class PageDemoQa {

    public static final Target BUTTON_ELEMENTS =
            Target.the("Button Elements").locatedBy("//*[@class='card-body' and contains(.,'{0}')]");
    public static final Target BUTTON_TEXT_BOX =
            Target.the("Button Text Box").locatedBy("//*[@class='btn btn-light ' and contains(.,'{0}')]");

    public static final Target FULL_NAME =
            Target.the("Full Name").located(By.xpath(" //input[@id='userName']"));
    public static final Target EMAIL =
            Target.the("Email").located(By.xpath("//input[@id='userEmail']"));
    public static final Target CURRENT_ADDRESS =
            Target.the("Current Address").located(By.xpath("//textarea[@id='currentAddress']"));
    public static final Target PERMANENT_ADDRESS =
            Target.the("Permanent Address").located(By.xpath("//textarea[@id='permanentAddress']"));
    public static final Target BUTTON_SUBMIT =
            Target.the("Button Sudmit").located(By.xpath("//button[@id='submit']"));

    public static final Target BTN_ALERTA =
            Target.the("Boton alerta loading").located(By.xpath("//*[@id='loading-spinner-text']"));
    public static final Target MSG_APLICACION =
            Target.the("Mensaje de la aplicacion Principal").locatedBy("//*[contains(text(),'{0}')]");

    public static final Target NOMBRE_CREADO =
            Target.the("Nombre creado").located(By.id("name"));
    public static final Target EMAIL_CREADO =
            Target.the("Email creado").located(By.id("email"));
    public static final Target CURRENT_ADDRESS_CREADO =
            Target.the("Current address creado").located(By.xpath("(//*[@id='currentAddress'])[2]"));
    public static final Target PERMANENT_ADDRESS_CREADO =
            Target.the("permanent address creado").located(By.xpath("(//*[@id='permanentAddress'])[2]"));

    private PageDemoQa() {}
}