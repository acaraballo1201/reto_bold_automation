#language:es

@Formulario

 Característica: formulario
  Como usuario de la aplicacion web demmoQA
  Quiero realizar el diligenciamiento del formulacion
  Para verificar el funcionamiento de sus componentes

  @Formulario_Text_Box
  Esquema del escenario: : Envio de datos en formulario Exitoso
    Dado que "Andres" ingresa con a la pagina de demoqa
    Cuando el ingresa al menu "Elements" y al apartado "Text Box"
    Y el ingresa los datos del formulario
      | fullName   | email   | currentAddress   | permanentAddress   |
      | <fullName> | <email> | <currentAddress> | <permanentAddress> |
    Entonces el podra observar el resumen de la informacion ingresada
    Ejemplos:
      | fullName  | email         | currentAddress     | permanentAddress |
      | Andres    | aco@bold.com  | Cra 47 Nro 57 - 40 | Mi Casa          |
      | Caraballo | jaco@bold.com | Cra 57 Nro 47 - 40 | Mi Estudio       |

