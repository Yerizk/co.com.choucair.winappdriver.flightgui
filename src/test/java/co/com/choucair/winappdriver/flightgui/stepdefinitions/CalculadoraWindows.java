package co.com.choucair.winappdriver.flightgui.stepdefinitions;


import co.com.choucair.winappdriver.flightgui.questions.Resultado;
import co.com.choucair.winappdriver.flightgui.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.windows.WindowsDriver;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebElement;
import static co.com.choucair.winappdriver.flightgui.tasks.Operaciones.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculadoraWindows {
    private static WindowsDriver CalculatorSession = null;
    private static WebElement CalculatorResult = null;

@Before
public void prepararEscenario() {
    OnStage.setTheStage(new OnlineCast());
}

    @Given("^Brandon is in the Windows calculator$")
    public void brandonIsInTheWindowsCalculator() {

        OnStage.theActorCalled("Brandon").wasAbleTo(Abrir.CalculadoraWindows());

    }

    @When("^he makes the sum  of (.*) and (.*)$")
    public void heMakesTheSumOfAnd(String numero1,String numero2) {
        theActorInTheSpotlight().attemptsTo(sumarNumeros(numero1,numero2));
    }

    @When("^he makes the Subtract of 6 and 8$")
    public void heMakesTheSubtractOfAnd() {
        theActorInTheSpotlight().attemptsTo(restarNumeros()  );
    }

    @When("^he makes the multiply of 6 and 8 $")
    public void heMakesTheMultiplyOfAnd() {
        theActorInTheSpotlight().attemptsTo(
                multiplicarNumeros()
        );

    }

    @When("^he makes the divide of 16 and 8$")
    public void heMakesTheDivideOfAnd() {
      /*  theActorInTheSpotlight().attemptsTo(
               dividirNumeros()
        );*/
    }


    @Then("^he should see the result equal to (.*)$")
    public void theresultis(String resultado) {
       theActorInTheSpotlight().should(seeThat(
                Resultado.esCorrecto(resultado))
        );
    }
}