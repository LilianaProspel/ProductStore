package com.demoblaze.steps;

import com.demoblaze.questions.PurchaseConfirmationMessage;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
import com.demoblaze.tasks.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.steps.StepEventBus;
import net.serenitybdd.screenplay.GivenWhenThen.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@Tag("Screenplay")
public class PurchaseSteps {

    @Before
    public void setTheStage() {
        StepEventBus.getEventBus().testStarted("testName");
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("the user is on the Demoblaze page")
    public void theUserIsOnTheDemoblazePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.theDemoblazeHomePage());
    }

    @When("the user selects and adds a product to the cart")
    public void theUserSelectsAndAddsAProductToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.theFirstProduct());
    }

    @And("the user selects and adds a second product to the cart")
    public void theUserSelectsAndAddsASecondProductToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.theSecondProduct());
    }

    @And("the user navigates to the cart option")
    public void theUserNavigatesToTheCartOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCart.view());
    }

    @And("the user clicks on Place Order")
    public void theUserClicksOnPlaceOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceOrder.click());
    }

    @And("the user fills out the order form with the following information")
    public void theUserFillsOutTheOrderFormWithTheFollowingInformation(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> formData = rows.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchaseForm.withDetails(formData));
    }

    @Then("the user should see the purchase confirmation message")
    public void theUserShouldSeeThePurchaseConfirmationMessage() {
        String expectedConfirmationMessage = "Thank you for your purchase!";
        OnStage.theActorInTheSpotlight().should(seeThat("confirmation message", new PurchaseConfirmationMessage(), equalTo(expectedConfirmationMessage)));
    }
}
