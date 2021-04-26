package co.com.choucair.winappdriver.flightgui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.winappdriver.flightgui.userinterfaces.Calculadora.*;

public class Sumar implements Task {
    public Sumar(String numero1, String numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    private String numero1, numero2;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO.getCssOrXPathSelector().replace("%", numero1)),
                Click.on(SIGNO_MAS),
                Click.on(NUMERO.getCssOrXPathSelector().replace("%", numero2)),
                Click.on(SIGNO_IGUAL)
        );
    }


}
