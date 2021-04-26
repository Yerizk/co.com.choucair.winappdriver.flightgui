package co.com.choucair.winappdriver.flightgui.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Calculadora {
    public static final Target NUMERO = Target.the("Numero Seis").locatedBy("//*[@AutomationId='num%Button']");
    public static final Target NUMERO_UNO = Target.the( "Numero Uno").located(By.name("Uno"));
    public static final Target NUMERO_DOS = Target.the("Numero Dos").located(By.name("Dos"));
    public static final Target NUMERO_TRES = Target.the("Numero Tres").located(By.name("Tres"));
    public static final Target NUMERO_CUATRO = Target.the("Numero Cuatro").located(By.name("Cuatro"));
    public static final Target NUMERO_CINCO = Target.the("Numero Cinco").located(By.name("Cinco"));
    public static final Target NUMERO_SEIS = Target.the("Numero Seis").locatedBy("//*[@AutomationId='num%Button']");
    public static final Target NUMERO_SIETE = Target.the("Numero Siete").located(By.name("Siete"));
    public static final Target NUMERO_OCHO = Target.the("Numero Ocho").located(By.name("Ocho"));
    public static final Target NUMERO_NUEVE = Target.the("Numero Nueve").located(By.name("Nueve"));
    public static final Target NUMERO_CERO = Target.the("Numero Cero").located(By.name("Cero"));
    public static final Target SIGNO_MAS = Target.the("Más").locatedBy(("//*[@AutomationId='plusButton']"));
    public static final Target SIGNO_MENOS = Target.the("Menos").located(By.name("Menos"));
    public static final Target SIGNO_MULTIPLICAR = Target.the("Menos").located(By.name("Multiplicar por"));
    public static final Target SIGNO_DIVISION = Target.the("Menos").located(By.name("Dividido por"));
    public static final Target SIGNO_IGUAL = Target.the("Es igual a").locatedBy("//*[@AutomationId='equalButton']");
    public static final Target RESULTADO = Target.the("Es igual a").locatedBy("//*[@AutomationId='CalculatorResults']");


}
