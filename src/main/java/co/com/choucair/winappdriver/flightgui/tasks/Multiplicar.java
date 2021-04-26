package co.com.choucair.winappdriver.flightgui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.winappdriver.flightgui.userinterfaces.Calculadora.*;


public class Multiplicar implements Task {
    @Override
public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(NUMERO_SEIS),
        Click.on(SIGNO_MULTIPLICAR),
        Click.on(NUMERO_OCHO),
        Click.on(SIGNO_IGUAL)
        );
        }
}