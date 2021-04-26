package co.com.choucair.winappdriver.flightgui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Abrir implements Task {

    public static Abrir  CalculadoraWindows() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("esperar");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*PARA CALCULADORA*/
        /*actor.attemptsTo(WaitUntil.the(By.xpath("//*[@AutomationId='num7Button']"),isVisible()));*/
        /*actor.attemptsTo(Click.on(By.xpath("//*[@AutomationId='num7Button']")));*/
        /*PARA NOTEPAD*/
        /*actor.attemptsTo(Click.on(By.xpath("//*[@AutomationId='15']")));
        actor.attemptsTo(Enter.theValue("Hola").into(By.xpath("//*[@AutomationId='15']")));*/

    }
}
