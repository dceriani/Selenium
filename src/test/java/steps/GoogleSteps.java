package steps;

import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Navego a google$")
    public void navegarGoogle(){
        google.navigateToGoogle();
    }

    @When("^Ingreso criterio de busuqueda$")
    public void ingresarCriterioBusqueda(){

    }

    @And("^Presionar el boton de buscar$")
    public void presionarBotonBusqueda(){

    }

    @Then("^Obtengo resultado$")
    public void validarResultado(){

    }



}
