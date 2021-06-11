package com.guru99.demo.stepdefinitions;

import com.guru99.demo.tasks.GoTo;
import com.guru99.demo.tasks.GoToRegister;
import com.guru99.demo.tasks.OpenTheBrowser;
import com.guru99.demo.userinterface.Guru99DemoHomeNewToursPage;
import com.guru99.demo.userinterface.Guru99DemoHomePage;
import com.guru99.demo.userinterface.Guru99DemoRegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterNewUserStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor juan = Actor.named("Juan");
    private Guru99DemoHomePage guru99DemoHomePage;
    private Guru99DemoHomeNewToursPage guru99DemoHomeNewToursPage;
    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(hisBrowser));
        juan.wasAbleTo(Open.browserOn(new Guru99DemoHomePage()));
    }

    @Given("^I want to start to register me$")
    public void i_want_to_start_to_register_me() {
        juan.wasAbleTo(OpenTheBrowser.on(guru99DemoHomePage),
                GoTo.newTours(), GoToRegister.register());

        //juan.wasAbleTo(OpenTheBrowser.on());
       // juan.wasAbleTo(GoTo.newTours());

        // juan.wasAbleTo(Task) ; --> @Given
        // juan.attemptsTo(Task) ; --> @When
        //Pre condiciones : las pre condiciones son todas las acciones que se
        // tienen que llevar a cabo para llegar hasta el punto en la página
        // en el cual vamos a ejecutar la prueba, donde se realiza lo que se
        // quiere probar
        // Para este ejemplo sería estar en la página de registro

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @When("^I complete all the formulary$")
    public void i_complete_all_the_formulary() {
        //Condiciones
        // En las condiciones se ejecutan las pruebas

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should to see my name in the portal$")
    public void i_should_to_see_my_name_in_the_portal() {

        //Pos condiciones o consecuencias
        // Aquí se comprueba lo realizado anteriormente
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

}
