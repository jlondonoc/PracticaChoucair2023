# language: es
# Autor: Juan Felipe Londoño Carmona.

@Regresion
@HistoriaDeUsuario1
Característica: Registrarse en la pagina web de Demoqa
  Ruben desea ingresar y registrarse en la pagina web para acceder como estudiante


  @RegistrarseenDemoqa
  Escenario: Registrarse de manera exitosa, diligenciando todos los campos
    Dado que Ruben ingreso al formulario de registro en la pagina web "https://demoqa.com/automation-practice-form"
    Cuando Ruben ingresa la informacion solicitada en el formulario de registro de estudiantes
    Entonces Ruben puede ver ´que su registro se realizo de forma exitosa
