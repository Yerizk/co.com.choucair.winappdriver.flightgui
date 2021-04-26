package co.com.choucair.winappdriver.flightgui.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.Calculadora.RESULTADO;


public class Resultado implements Question<Boolean> {
    private String resultado;

    public Resultado(String resultado) {this.resultado=resultado;}
    public static Resultado esCorrecto(String resultado){ return new Resultado(resultado);}


    @Override
    public Boolean answeredBy(Actor actor) { return RESULTADO.resolveFor(actor).getText().contains(resultado);
    }
}
