package com.co.proyectoScreenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validar implements Question<String> {

    Target texto;

    public Validar(Target texto) {this.texto = texto;}

    @Override
    public String answeredBy(Actor actor) {return texto.resolveFor(actor).getText();}

    public static Question<String> elTexto(Target texto) {return new Validar(texto);}
}
