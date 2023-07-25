package com.co.proyectoScreenplay.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage {

    public static final Target INPUT_FIRSTNAME = Target.the("Campo nombre")
            .locatedBy("//input[@id='firstName']");
    public static final Target INPUT_LASTNAME = Target.the("Campo apellido")
            .locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("Campo email")
            .locatedBy("//input[@id='userEmail']");
    public static final Target BTN_GENDER = Target.the("Selección de género")
            .locatedBy("//input[@id='gender-radio-1']");
    public static final Target INPUT_MOBILE = Target.the("Campo email")
            .locatedBy("//input[@id='userNumber']");
    public static final Target INPUT_DATE = Target.the("Selección de fecha")
            .locatedBy("//input[@id='dateOfBirthInput']");
    public static final Target INPUT_SUBJECTS = Target.the("Temas de interés")
            .locatedBy("//div[@id='subjectsWrapper']//input");
    public static final Target CHECK_HOBBIES = Target.the("Checks hobbies")
            .locatedBy("//input[@id='hobbies-checkbox-3']");
    public static final Target INPUT_ADDRESS = Target.the("Ingresar dirección")
            .locatedBy("//textarea[@placeholder='Current Address']");
    public static final Target BTN_SUBMIT = Target.the("Enviar información ingresada")
            .locatedBy("//button[@id='submit']");
    public static final Target LBL_TEXT = Target.the("texto a validar")
            .locatedBy("//div[@id='example-modal-sizes-title-lg']");
}
