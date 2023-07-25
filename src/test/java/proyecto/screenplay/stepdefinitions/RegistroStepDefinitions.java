package proyecto.screenplay.stepdefinitions;

import com.co.proyectoScreenplay.questions.Validar;
import com.co.proyectoScreenplay.tasks.Registrarse;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.proyectoScreenplay.userinterfaces.FormularioPage.LBL_TEXT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinitions {

    @Before
    public static void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Ruben ingreso al formulario de registro en la pagina web {string}")
    public void queRubenIngresoAlFormularioDeRegistroEnLaPaginaWeb(String url) {
        OnStage.theActorCalled("Ruben").wasAbleTo(Open.url(url));
    }
    @Cuando("Ruben ingresa la informacion solicitada en el formulario de registro de estudiantes")
    public void rubenIngresaLaInformacionSolicitadaEnElFormularioDeRegistroDeEstudiantes() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Registrarse.llenarFormulario()
        );
    }
    @Entonces("Ruben puede ver ´que su registro se realizo de forma exitosa")
    public void rubenPuedeVerQueSuRegistroSeRealizoDeFormaExitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat(Validar.elTexto(LBL_TEXT)));
    }
}