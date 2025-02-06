package co.com.reto_auto_bold.certificacion.exceptions;

public class MenuNoVisualizadoException extends AssertionError {
  public static final String MENU_VALIDACION_NO_ENCONTRADO = "Menu no visualizado";

  public MenuNoVisualizadoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
