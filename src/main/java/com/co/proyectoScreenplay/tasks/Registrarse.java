package com.co.proyectoScreenplay.tasks;

import com.co.proyectoScreenplay.userinterfaces.FormularioPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.FileReader;
import java.text.Normalizer;

import static com.co.proyectoScreenplay.userinterfaces.FormularioPage.LBL_TEXT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registrarse implements Task {

    public static Registrarse llenarFormulario() {
        return Instrumented.instanceOf(Registrarse.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Ruben").into(FormularioPage.INPUT_FIRSTNAME),
                Enter.theValue("Blades").into(FormularioPage.INPUT_LASTNAME),
                Enter.theValue("rb@yahoo.es").into(FormularioPage.INPUT_EMAIL),
                JavaScriptClick.on(FormularioPage.BTN_GENDER),
                Enter.theValue("30045634512").into(FormularioPage.INPUT_MOBILE),
                //Enter.theValue("31 Aug 1990").into(FormularioPage.INPUT_DATE),
                Enter.theValue("Testing,Automation, Others").into(FormularioPage.INPUT_SUBJECTS),
                JavaScriptClick.on(FormularioPage.CHECK_HOBBIES),
                Enter.theValue("Cra 51AA 110-16").into(FormularioPage.INPUT_ADDRESS),
                JavaScriptClick.on(FormularioPage.BTN_SUBMIT),
                WaitUntil.the(LBL_TEXT, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
