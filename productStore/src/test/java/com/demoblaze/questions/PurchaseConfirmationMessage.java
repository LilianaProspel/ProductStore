package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.demoblaze.ui.DemoblazeHomePage.SUCCESS_MESSAGE;

public class PurchaseConfirmationMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).$(SUCCESS_MESSAGE).getText();
    }
}
