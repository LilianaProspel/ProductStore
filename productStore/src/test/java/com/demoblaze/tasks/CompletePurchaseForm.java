package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static com.demoblaze.ui.PurchaseForm.*;

public class CompletePurchaseForm {
    public static Task withDetails(Map<String, String> details) {
        return Task.where("{0} completes the purchase form",
                Enter.theValue(details.get("Name")).into(NAME_FIELD),
                Enter.theValue(details.get("Country")).into(COUNTRY_FIELD),
                Enter.theValue(details.get("City")).into(CITY_FIELD),
                Enter.theValue(details.get("Credit Card")).into(CREDIT_CARD_FIELD),
                Enter.theValue(details.get("Month")).into(MONTH_FIELD),
                Enter.theValue(details.get("Year")).into(YEAR_FIELD),
                Click.on(PURCHASE_BUTTON)
        );
    }
}
