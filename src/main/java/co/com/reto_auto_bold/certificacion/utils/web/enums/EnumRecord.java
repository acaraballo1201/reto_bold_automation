package co.com.reto_auto_bold.certificacion.utils.web.enums;

public enum EnumRecord {

    FORM_DATA("FORM_DATA"),
    EXCEPTION_ERROR_ACTOR_REMEMBER("No hay datos guardados para validar la salida.");

    private final String nombreVariable;

    EnumRecord(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    @Override
    public String toString() {
        return nombreVariable;
    }

}
