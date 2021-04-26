package co.com.choucair.winappdriver.flightgui.tasks;
import net.serenitybdd.screenplay.Performable;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Operaciones {


    public static Performable sumarNumeros (String numero1,String numero2){return instrumented (Sumar.class,numero1,numero2);}
    public static Performable restarNumeros (){return instrumented (Restar.class);}
    public static Performable multiplicarNumeros (){return instrumented (Multiplicar.class);}
    public static Performable dividirNumeros (){return instrumented (Dividir.class);}
}
